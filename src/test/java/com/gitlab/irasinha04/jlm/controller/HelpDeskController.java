package com.gitlab.irasinha04.jlm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.gitlab.irasinha04.jlm.Book;
import com.gitlab.irasinha04.jlm.Member;
import com.gitlab.irasinha04.jlm.exception.HelpdeskException;
import com.gitlab.irasinha04.jlm.service.BookManagementService;
import com.gitlab.irasinha04.jlm.service.MemberManagementService;
import com.gitlab.irasinha04.jlm.util.MenuUtil;

public class HelpDeskController {
	
	BookManagementService bms = BookManagementService.getInstance();
	MemberManagementService mms = MemberManagementService.getInstance();

	public void performHelpDeskOperation(int option) throws IOException {
		
		boolean isActive = true;
		
		while (isActive) {
			switch (option) {
			
			case 1: {
//				Available books
				Collection<Book> availableBooks = bms.returnAllAvailableBookInfo();
				Iterator<Book> iterator = availableBooks.iterator();
				int i = 1;
				// while loop
			    while (iterator.hasNext()) {
			    	Book book = iterator.next();
			    	
			    	String text = "ID : " + book.getID() + "|" + 
			    			 "Title : " + book.getTitle() 
						+ "|" + "Author : " + book.getAuthor();
						
			    	System.out.println(i + ") " + text);
					i++;
			    }
			    
				break;
			}
			
			case 2: {
//				All Books
				Collection<Book> allBooks = bms.returnAllBookInfo();
				Iterator<Book> iterator = allBooks.iterator();
				int i = 1;
				// while loop
			    while (iterator.hasNext()) {
			    	Book book = iterator.next();
			    	
			    	String text = "ID : " + book.getID() + "|" + "Title : " + book.getTitle() 
					+ "|" + "Author : " + book.getAuthor() + "|"
					+ (book.getIsIssued() ? "Issued" : "Available");
				
			    	System.out.println(i + ") " + text);
					i++;
			    }
				
				break;
			}
			
			case 3: {
//				All members
				Collection<Member> allMember = mms.returnAllMemberInfo();
				Iterator<Member> iterator = allMember.iterator();
				int i = 1;
				// while loop
			    while (iterator.hasNext()) {
			    	Member member = iterator.next();
			    	
			    	String text = "ID : " + member.getId() + "|" + "Name : " +
							member.getName() + "|" + 
							/*member.getDOB() + "|" + member.getEmail() + "|" + 
							member.getPhoneNo() + "|" + */
							"Join Date : " + member.getJoinDate() + "|" + 
							(member.getIsBlacklisted() ? "BlackListed":"Active") + "|"+ 
							"Fine Pending : INR " + member.getFine() + "|" + 
							"Books Issued : " + member.getNumOfBooksIssued();
							
							System.out.println(i + ") " + text);
							i++;
			    }
			    
				break;
			}
			case 4: {
				isActive = false;
				break;
			}
			default: {
				System.out.println("Oops! You entered the wrong choice. Try again");
			}
			}
			
			if(option != 4) {
				option = MenuUtil.displayHelpDeskMenu();
			}
		}
	}	
}

