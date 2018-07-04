package com.gitlab.irasinha04.jlm.controller;

import java.util.Scanner;

import com.gitlab.irasinha04.jlm.service.IssueService;
import com.gitlab.irasinha04.jlm.util.MenuUtil;

public class IssueController {
	IssueService is = new IssueService();
	
	public void performIssueOperation(int option) {
		boolean isActive = true;
		while (isActive) {
			switch (option) {

			case 1: {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter member ID: ");
				int memID = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter book ID: ");
				int bookID = sc.nextInt();
				sc.nextLine();				
				is.issueBook(bookID, memID);
				break;
			}
			
			case 2: {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter member ID: ");
				int memID = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter book ID: ");
				int bookID = sc.nextInt();
				sc.nextLine();				
				is.returnBook(bookID, memID);
				break;
			}
			
			case 3: {
				isActive = false;
				break;
			}
			
			default: {
				System.out.println("Oops! You entered the wrong choice. Try again");
			}
			}
			if(option != 3) {
				option = MenuUtil.displayIssueMenu();
			}
		}
	}
}
