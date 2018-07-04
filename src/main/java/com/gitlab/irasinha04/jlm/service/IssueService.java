package com.gitlab.irasinha04.jlm.service;

import java.util.Scanner;

import com.gitlab.irasinha04.jlm.Book;
import com.gitlab.irasinha04.jlm.Member;

public class IssueService {
	MemberManagementService mms = MemberManagementService.getInstance();
	BookManagementService bms = BookManagementService.getInstance();

	public void issueBook(int bookId, int memberId) {

		Member m = mms.read(memberId);
		Book b = bms.readDetails(bookId);
		
		if (m.getIsBlacklisted()) {
			System.out.println("YOU ARE BLACKLSTED!!!");
			return;
		}
		if (m.getNumOfBooksIssued() >= 5) {
			System.out.println("DONT ISSUE MORE BOOKS!!");
			return;
		}
		if (m.getFine() > 0) {
			System.out.println("PAAAAAAAAAYYYYYYYYYY!!!!");
			return;
		}
		if (b.getIsIssued()) {
			System.out.println("BOOK UNAVIALABLE!!");
			return;
		}
		if (!b.getGenre().isIssueable()) {
			System.out.println("DON'T RUN AWAY WITH THIS BOOK!!");
			return;
		}

		m.setNumOfBooksIssued(m.getNumOfBooksIssued() + 1);
		b.setIsIssued(true);

		System.out.println("Book issued successfully !");
		System.out.println("Book ID: " + b.getID());
		System.out.println("Book Name: " + b.getTitle());
		System.out.println("Member ID: " + m.getId());
		System.out.println("Member Name: " + m.getName());
	}

	public void returnBook(int bookId, int memberId) {
		Member m = mms.read(memberId);
		Book b = bms.readDetails(bookId);

		m.setNumOfBooksIssued(m.getNumOfBooksIssued() - 1);
		double fine = m.getFine() + calculateFine(m, b);
		m.setFine(fine);
		b.setIsIssued(false);
	}

	private double calculateFine(Member m, Book b) {
		// TODO add very fine logic
		return 0;
	}
}
