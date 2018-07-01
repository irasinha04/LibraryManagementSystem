package com.gitlab.irasinha04.jlm.service;

import com.gitlab.irasinha04.jlm.Book;

public class BookManagementTest {

	private static final String TITLE = "Harry Potter";
	private static final String GENRE = "Fiction";
	private static final String AUTHOR = "J.K. Rowling";
	private static final int RATING = 5;

	public static void test(String actual, String expected, String variable) {
	    System.out.println(variable + " Test " + (actual.equals(expected)? "Passed" : "Failed"));
	}

	public static void test(int actual, int expected, String variable) {
	    System.out.println(variable + " Test " + (actual == expected ? "Passed" : "Failed"));
	}
	
	public static void main(String[] args) {
		BookManagementService test = new BookManagementService();
		
		int id = test.create(TITLE,GENRE,AUTHOR,RATING);
		Book book = test.readDetails(id);

		test(TITLE, book.getTitle(), "Title");
		test(GENRE, book.getGenre(), "Genre");
		test(AUTHOR, book.getAuthor(), "Author");
		test(RATING, book.getRating(),"Rating");
	}
}
