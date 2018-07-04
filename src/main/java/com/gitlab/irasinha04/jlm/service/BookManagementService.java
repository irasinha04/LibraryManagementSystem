package com.gitlab.irasinha04.jlm.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.gitlab.irasinha04.jlm.Book;
import com.gitlab.irasinha04.jlm.enums.Genre;
//import com.gitlab.irasinha04.jlm.controller.BufferedWriter;
//import com.gitlab.irasinha04.jlm.controller.FileWriter;

public class BookManagementService {

	private Map<Integer, Book> bookMap = new HashMap<>();

	private BookManagementService() {
	}

	private static final BookManagementService bms = new BookManagementService();

	public static BookManagementService getInstance() {
		return bms;
	}

	public int create(String title, String genre, String author, int rating) {
		int bookId = Double.valueOf(Math.random() * 10000).intValue();

		Book book = new Book();
		book.setID(bookId);
		book.setTitle(title);
		book.setGenre(Genre.valueOf(genre.toUpperCase()));
		book.setAuthor(author);
		book.setRating(rating);
		bookMap.put(bookId, book);

		return bookId;
	}

	public Book readDetails(int id) {
		return bookMap.get(id);
	}

	public void updateTitle(int id, String newTitle) {
		Book book = bookMap.get(id);
		book.setTitle(newTitle);
	}

	public void updateGenre(int id, String newGenre) {
		Book book = bookMap.get(id);
		book.setGenre(Genre.valueOf(newGenre.toUpperCase()));
	}

	public void updateAuthor(int id, String newAuthor) {
		Book book = bookMap.get(id);
		book.setAuthor(newAuthor);
	}

	public void updateRating(int id, int newRating) {
		Book book = bookMap.get(id);
		book.setRating(newRating);
	}

	public void delete(int id) {
		bookMap.remove(id);
	}

	public void saveBook(String filePath) throws IOException {
		// Write to file
		File file = new File(filePath);
		PrintWriter pw = new PrintWriter(new FileOutputStream(file), true);

		for (Integer key : bookMap.keySet()) {

			Book book = bookMap.get(key);

			String text = book.getID() + "|" + book.getTitle() + "|" + book.getGenre() + "|" + book.getAuthor() + "|"
					+ book.getRating() + "|" + book.getIsIssued();
			pw.println(text);
		}

		pw.close();
	}

	public void retrieveBook(String filePath) throws IOException {
		// Read from file
		File file = new File(filePath);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String text;
		while ((text = br.readLine()) != null) {
			Book book = new Book();
			String[] arr = text.split("\\|");
			book.setID(Integer.valueOf(arr[0]));
			book.setTitle(arr[1]);
			book.setGenre(Genre.valueOf(arr[2].toUpperCase()));
			book.setAuthor(arr[3]);
			book.setRating(Integer.valueOf(arr[4]));
			book.setIsIssued(arr[5].equals("true"));

			bookMap.put(book.getID(), book);
		}
		br.close();
		fr.close();
	}
}
