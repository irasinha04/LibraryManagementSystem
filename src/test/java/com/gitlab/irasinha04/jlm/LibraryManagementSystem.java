package com.gitlab.irasinha04.jlm;

import java.util.Scanner;

import com.gitlab.irasinha04.jlm.util.BookMenuUtil;
import com.gitlab.irasinha04.jlm.util.BookServiceUtil;
import com.gitlab.irasinha04.jlm.util.MemberMenuUtil;
import com.gitlab.irasinha04.jlm.util.MemberServiceUtil;
import com.gitlab.irasinha04.jlm.util.MenuUtil;

public class LibraryManagementSystem {

	public void displayMenu() {
	 boolean isActive = true;
		while (isActive) {
			int option = MenuUtil.Menu();

			switch (option) {
			case 1: {
				int screen1option = BookMenuUtil.BookMenu();
				BookServiceUtil bsu = new BookServiceUtil();
				System.out.println("Option selected = * " + screen1option + " *");
				bsu.BookService(screen1option);
				break;
			}

			case 2: {
				int screen2option = MemberMenuUtil.MemberMenu();
				MemberServiceUtil msu = new MemberServiceUtil();
				System.out.println("Option selected = * " + screen2option + " *");
				msu.MemberService(screen2option);
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

	public static void main(String[] args) {
		LibraryManagementSystem lmsMenu = new LibraryManagementSystem();
		lmsMenu.displayMenu();
	}
}
