package com.gitlab.irasinha04.jlm.service;

import com.gitlab.irasinha04.jlm.Book;
import com.gitlab.irasinha04.jlm.util.TestUtil;

public class BookManagementTest {

	private static final String TITLE = "Harry Potter";
	private static final String GENRE = "Fiction";
	private static final String AUTHOR = "J.K. Rowling";
	private static final int RATING = 5;
	
	public static void main(String[] args) {
		BookManagementService bms = new BookManagementService();
		
		int id = bms.create(TITLE,GENRE,AUTHOR,RATING);
		Book book = bms.readDetails(id);

		TestUtil.bmsTest(TITLE, book.getTitle(), "Title");
		TestUtil.bmsTest(GENRE, book.getGenre(), "Genre");
		TestUtil.bmsTest(AUTHOR, book.getAuthor(), "Author");
		TestUtil.bmsTest(RATING, book.getRating(),"Rating");
	}
}
