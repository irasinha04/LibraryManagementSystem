package com.gitlab.irasinha04.jlm.boot.dto;

public class BookDTO {

	private String title;
	private String genre;
	private String author;
	private int rating;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public String getAuthor() {
		return author;
	}

	public int getRating() {
		return rating;
	}

}
