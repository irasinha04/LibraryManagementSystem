package com.gitlab.irasinha04.jlm;

public class Main {
	public static void main(String[] args) {
	Book harry = new Book();
	harry.setID(9999);
	harry.setTitle("Harry Potter and the Order of Phoenix");
	harry.setAuthor("J.K. Rowling");
	harry.setGenre("Fiction");
	harry.setRating(5);
	
	Member abhijit = new Member();
	abhijit.setId(1234);
	abhijit.setName("Abhijit Sinha");
	abhijit.setJoinDate("02.07.2014");
		
	System.out.println(abhijit.getName());
	System.out.println(abhijit.getJoinDate());
	System.out.println(abhijit.getId());
	
	System.out.println(harry.getTitle());
	System.out.println(harry.getAuthor());
	System.out.println(harry.getGenre());
	System.out.println(harry.getID());
	System.out.println(harry.getRating());
	
	
	}
}
