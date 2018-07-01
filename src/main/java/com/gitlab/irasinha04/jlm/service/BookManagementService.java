package com.gitlab.irasinha04.jlm.service;

import java.util.HashMap;
import java.util.Map;

import com.gitlab.irasinha04.jlm.Book;

public class BookManagementService {

	private Map<Integer, Book> bookMap = new HashMap<>();	
	
	public int create(String title, String genre, String author, int rating) {
		int bookId = Double.valueOf(Math.random() * 10000).intValue();

		Book book = new Book();
		book.setID(bookId);
		book.setTitle(title);
		book.setGenre(genre);
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
		book.setGenre(newGenre);
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
}
