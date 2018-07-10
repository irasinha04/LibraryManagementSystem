package com.gitlab.irasinha04.jlm;

import com.gitlab.irasinha04.jlm.enums.Genre;

public class Book {
	private int id;
	private String title;
	private String author;
	private Genre genre;
	private int rating;
	private boolean isIssued;

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
	
	public void setGenre(Genre genre) {
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

	public Genre getGenre() {
		return genre;
	}

	public int getRating() {
		return rating;
	}
	
	public boolean getIsIssued() {
		return isIssued;
	}
	
	public void setIsIssued(boolean isIssued) {
		this.isIssued = isIssued;
	}
}

