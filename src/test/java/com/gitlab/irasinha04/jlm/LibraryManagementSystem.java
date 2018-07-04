package com.gitlab.irasinha04.jlm;

import java.io.IOException;

import com.gitlab.irasinha04.jlm.controller.BookController;
import com.gitlab.irasinha04.jlm.controller.MemberController;
import com.gitlab.irasinha04.jlm.util.MenuUtil;

public class LibraryManagementSystem {

	// Create file path
	private static final String BOOK_FILE_PATH = "/home/abhijitsinha/Documents/ira/LMS/LibraryBooks.txt";
	private static final String MEMBER_FILE_PATH = "/home/abhijitsinha/Documents/ira/LMS/LibraryMembers.txt";
	
	public static void main(String[] args) throws IOException {
		BookController bookController = new BookController();
		MemberController memberController = new MemberController();
		boolean isActive = true;

		System.out.println("*WELCOME TO LIBRARY MANAGEMENT SYSTEM*");
		System.out.println("Retrieving your records..");
		bookController.retrieveBookRecords(BOOK_FILE_PATH);
		memberController.retrieveMemberRecords(MEMBER_FILE_PATH);
		System.out.println("Records retrieved successfully!");
		
		while (isActive) {
			int option = MenuUtil.displayMainMenu();

			switch (option) {
			case 1: {
				int screen1option = MenuUtil.displayBookMenu();
				bookController.performBookOperation(screen1option);
				break;
			}

			case 2: {
				int screen2option = MenuUtil.displayMemberMenu();
				memberController.performMemberOperation(screen2option);
				break;
			}

			case 3: {
				isActive = false;
				System.out.println("Saving your records...");
				bookController.saveBookRecords(BOOK_FILE_PATH);
				memberController.saveMemberRecords(MEMBER_FILE_PATH);
				System.out.println("Your records are saved successfully. Thank you!");
				
				break;
			}

			default: {
				System.out.println("Oops! You entered the wrong choice. Try again");
			}
			}
		}
	}
}
