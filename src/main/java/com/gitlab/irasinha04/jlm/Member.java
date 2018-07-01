package com.gitlab.irasinha04.jlm;

public class Member {
	private int id;
	private String name;
	private String email;
	private String phoneNo;
	private String joinDate;

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
	
	@Override
	public String toString() {
		return String.format("id: %d, name: %s, email: %s, phone: %s, join date: %s", id, name, email, phoneNo, joinDate);
	}
}
