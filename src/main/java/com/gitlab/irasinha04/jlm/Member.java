package com.gitlab.irasinha04.jlm;

public class Member {
	private int id;
	private String name;
	private String email;
	private String phoneNo;
	private String joinDate;
	private boolean isBlackList;
	private int numOfBooks;
	private double fine;

//Getters and Setters
	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean getIsBlacklisted() {
		return isBlackList;
	}
	
	public void setIsBlacklisted(boolean isBlackList) {
		this.isBlackList = isBlackList;
	}
	
	public int getNumOfBooksIssued() {
		return numOfBooks;
	}
	
	public void setNumOfBooksIssued(int numOfBooks) {
		this.numOfBooks = numOfBooks;
	}
	
	public double getFine() {
		return fine;
	}
	
	public void setFine(double fine) {
		this.fine = fine;
	}
	
	@Override
	public String toString() {
		return String.format("Id: %d, Name: %s, Email: %s, Phone: %s, "
				+ "Join date: %s, No. of books issued: %d, Fine: %ld",
				id, name, email, phoneNo, joinDate, numOfBooks, fine);
	}
	
}
