package com.gitlab.irasinha04.jlm.controller;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import com.gitlab.irasinha04.jlm.Book;
import com.gitlab.irasinha04.jlm.Member;
import com.gitlab.irasinha04.jlm.exception.HelpdeskException;
import com.gitlab.irasinha04.jlm.service.BookManagementService;
import com.gitlab.irasinha04.jlm.service.HelpDeskService;
import com.gitlab.irasinha04.jlm.service.MemberManagementService;
import com.gitlab.irasinha04.jlm.util.MenuUtil;

public class HelpDeskController {
	
	HelpDeskService hds = new HelpDeskService();

	public void performHelpDeskOperation(int option) throws IOException {
		Map<Integer, Book> books = hds.getAllBooksInfo();
		Map<Integer, Member> members = hds.getAllMemberInfo();
		
		boolean isActive = true;
		while (isActive) {
			switch (option) {
			
			case 1: {
				
//				Available books
				for (Integer key : books.keySet()) {
					
					Book book = books.get(key);
					if(!book.getIsIssued()) {
						String text = "ID : " + book.getID() + "|" + "Title : " + book.getTitle() 
						+ "|" + "Author : " + book.getAuthor();
						
						System.out.println(text);
					}
				}
				
				break;
			}
			
			case 2: {
				
//				All Books				
				for (Integer key : books.keySet()) {

					Book book = books.get(key);

					String text = "ID : " + book.getID() + "|" + "Title : " + book.getTitle() 
					+ "|" + "Author : " + book.getAuthor() + "|"
					+ (book.getIsIssued() ? "Issued" : "Available");
				
					System.out.println(text);
				}
				
				break;
			}
			
			case 3: {
				
//				All members
				for (Integer key : members.keySet()) {

					Member member = members.get(key);

					String text = "ID : " + member.getId() + "|" + "Name : " +
					member.getName() + "|" + 
					/*member.getDOB() + "|" + member.getEmail() + "|" + 
					member.getPhoneNo() + "|" + */
					"Join Date : " + member.getJoinDate() + "|" + 
					(member.getIsBlacklisted() ? "BlackListed":"Active") + "|"+ 
					"Fine Pending : INR " + member.getFine() + "|" + 
					"Books Issued : " + member.getNumOfBooksIssued();
					
					System.out.println(text);
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
				MenuUtil.displayHelpDeskMenu();
			}
		}
	}	
}

