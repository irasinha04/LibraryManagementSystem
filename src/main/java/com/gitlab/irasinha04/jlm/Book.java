package com.gitlab.irasinha04.jlm;

public class Book {
	private int ID;
	private String Title;
	private String Author;
	private String Genre;
	private int Rating;

// Getters and Setters
	public void setID(int id) {
		ID = id;
	}
	
	public void setTitle(String title) {
		Title = title;
	}
	
	public void setAuthor(String author) {
		Author = author;
	}
	
	public void setGenre(String genre) {
		Genre = genre;
	}
	
	public void setRating(int rating) {
		Rating = rating;
	}

	public int getID() {
		return ID;
	}

	public String getTitle() {
		return Title;
	}

	public String getAuthor() {
		return Author;
	}

	public String getGenre() {
		return Genre;
	}

	public int getRating() {
		return Rating;
	}
	
	
}

