package com.gitlab.irasinha04.jlm;

import java.io.IOException;

import com.gitlab.irasinha04.jlm.controller.BookController;
import com.gitlab.irasinha04.jlm.controller.IssueController;
import com.gitlab.irasinha04.jlm.controller.MemberController;
import com.gitlab.irasinha04.jlm.exception.IssueException;
import com.gitlab.irasinha04.jlm.util.MenuUtil;

public class LibraryManagementSystem {

	// Create file path
	private static final String BOOK_FILE_PATH = "C:\\Users\\IRA\\Desktop\\LibraryBooks.txt";
	private static final String MEMBER_FILE_PATH = "C:\\Users\\IRA\\Desktop\\LibraryMembers.txt";
	
	public static void main(String[] args) throws IOException, IssueException {
		BookController bookController = new BookController();
		MemberController memberController = new MemberController();
		IssueController issueController = new IssueController();
		
		boolean isActive = true;

		bookController.retrieveBookRecords(BOOK_FILE_PATH);
		memberController.retrieveMemberRecords(MEMBER_FILE_PATH);

		MenuUtil.displayWelcome();
		
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
				int screen3option = MenuUtil.displayIssueMenu();
				issueController.performIssueOperation(screen3option);
				break;
			}
			
			case 4: {
				isActive = false;

				bookController.saveBookRecords(BOOK_FILE_PATH);
				memberController.saveMemberRecords(MEMBER_FILE_PATH);
				
				MenuUtil.displayExit();
							
				break;
			}

			default: {
				MenuUtil.displayWrongChoiceSelected();
			}
			}
		}
	}
}
