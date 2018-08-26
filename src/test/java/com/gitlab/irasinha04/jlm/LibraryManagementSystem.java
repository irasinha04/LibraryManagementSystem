package com.gitlab.irasinha04.jlm;

import java.io.IOException;

import com.gitlab.irasinha04.jlm.controller.BookController;
import com.gitlab.irasinha04.jlm.controller.IssueController;
import com.gitlab.irasinha04.jlm.controller.MemberController;
import com.gitlab.irasinha04.jlm.controller.HelpDeskController;
import com.gitlab.irasinha04.jlm.exception.IssueException;
import com.gitlab.irasinha04.jlm.util.MenuUtil;

public class LibraryManagementSystem {
	
	// Create file path
	private static final String BOOK_FILE_PATH = "C:\\Users\\IRA\\Desktop\\ProgramDatabaseFiles\\LibraryBooks.txt";
	private static final String MEMBER_FILE_PATH = "C:\\Users\\IRA\\Desktop\\ProgramDatabaseFiles\\LibraryMembers.txt";
	
	public String getBookFilePath() {
		return BOOK_FILE_PATH;
	}
	
	public String getMemberFilePath() {
		return MEMBER_FILE_PATH;
	}
	
	public static void main(String[] args) throws IOException, IssueException {
		BookController bookController = new BookController();
		MemberController memberController = new MemberController();
		IssueController issueController = new IssueController();
		HelpDeskController helpdeskController = new HelpDeskController();
		LibraryManagementSystem lms = new LibraryManagementSystem();
		
		boolean isActive = true;

		bookController.retrieveBookRecords(lms.getBookFilePath());
		memberController.retrieveMemberRecords(lms.getMemberFilePath());

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
				int screen4option = MenuUtil.displayHelpDeskMenu();
				helpdeskController.performHelpDeskOperation(screen4option);
				break;
			}
			
			case 5: {
				isActive = false;

				bookController.saveBookRecords(lms.getBookFilePath());
				memberController.saveMemberRecords(lms.getMemberFilePath());
				
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
