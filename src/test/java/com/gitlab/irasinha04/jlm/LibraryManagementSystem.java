package com.gitlab.irasinha04.jlm;

import com.gitlab.irasinha04.jlm.controller.BookController;
import com.gitlab.irasinha04.jlm.controller.MemberController;
import com.gitlab.irasinha04.jlm.util.MenuUtil;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		BookController bookController = new BookController();
		MemberController memberController = new MemberController();
		boolean isActive = true;

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
				break;
			}

			default: {
				System.out.println("Oops! You entered the wrong choice. Try again");
			}
			}
		}
	}
}
