package com.gitlab.irasinha04.jlm.service;

import com.gitlab.irasinha04.jlm.Book;
import com.gitlab.irasinha04.jlm.util.TestUtil;

public class BookManagementTest {

	private static final String TITLE = "Harry Potter";
	private static final String GENRE = "Fiction";
	private static final String AUTHOR = "J.K. Rowling";
	private static final int RATING = 5;
	
	public static void main(String[] args) {
		BookManagementService test = new BookManagementService();
		
		int id = test.create(TITLE,GENRE,AUTHOR,RATING);
		Book book = test.readDetails(id);

		TestUtil.test(TITLE, book.getTitle(), "Title");
		TestUtil.test(GENRE, book.getGenre(), "Genre");
		TestUtil.test(AUTHOR, book.getAuthor(), "Author");
		TestUtil.test(RATING, book.getRating(),"Rating");
	}
}
