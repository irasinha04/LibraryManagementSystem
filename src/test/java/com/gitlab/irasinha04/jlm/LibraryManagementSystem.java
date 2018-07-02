package com.gitlab.irasinha04.jlm;

import java.util.Scanner;

import com.gitlab.irasinha04.jlm.util.BookMenuUtil;
import com.gitlab.irasinha04.jlm.util.BookServiceUtil;
import com.gitlab.irasinha04.jlm.util.MemberMenuUtil;
import com.gitlab.irasinha04.jlm.util.MemberServiceUtil;
import com.gitlab.irasinha04.jlm.util.MenuUtil;

public class LibraryManagementSystem {

	public void displayMenu() {
		int c = 0;
		while (c == 0) {
			int option = MenuUtil.Menu();

			switch (option) {
			case 1: {
				c++;
				int screen1option = BookMenuUtil.BookMenu();
				BookServiceUtil bsu = new BookServiceUtil();
				bsu.BookService(screen1option);
				break;
			}

			case 2: {
				c++;
				int screen2option = MemberMenuUtil.MemberMenu();
				MemberServiceUtil msu = new MemberServiceUtil();
				msu.MemberService(screen2option);
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
