package com.gitlab.irasinha04.jlm;

public class Book {
	private int id;
	private String title;
	private String author;
	private String genre;
	private int rating;

// Getters and Setters
	public void setID(int id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getID() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}

	public int getRating() {
		return rating;
	}
}

