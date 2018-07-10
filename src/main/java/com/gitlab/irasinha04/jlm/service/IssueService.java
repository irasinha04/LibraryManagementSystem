package com.gitlab.irasinha04.jlm.service;

import java.util.Scanner;

import com.gitlab.irasinha04.jlm.Book;
import com.gitlab.irasinha04.jlm.Member;
import com.gitlab.irasinha04.jlm.controller.BookController;
import com.gitlab.irasinha04.jlm.controller.IssueController;
import com.gitlab.irasinha04.jlm.controller.MemberController;
import com.gitlab.irasinha04.jlm.exception.IssueException;

public class IssueService {
	MemberManagementService mms = MemberManagementService.getInstance();
	BookManagementService bms = BookManagementService.getInstance();
	MemberController memCont = new MemberController();
	BookController bookCont = new BookController();

	public void issueBook(int bookId, int memberId) throws IssueException {

		Member m = mms.read(memberId);
		Book b = bms.readDetails(bookId);

		if (m.getIsBlacklisted()) {
			throw new IssueException("YOU ARE BLACKLISTED !!");
		}
		if (m.getNumOfBooksIssued() >= 5) {
			throw new IssueException("BOOK LIMIT EXCEEDED !!");
		}
		if (m.getFine() > 0) {
			throw new IssueException("PAY FINE BEFORE ISSUING !!");
		}
		if (b.getIsIssued()) {
			throw new IssueException("BOOK ALREADY ISSUED !!");
		}
		if (!b.getGenre().isIssueable()) {
			throw new IssueException("BOOK BELONGS TO SPECIAL CATEGORY !!");
		}

		m.setNumOfBooksIssued(m.getNumOfBooksIssued() + 1);
		b.setIsIssued(true);
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
