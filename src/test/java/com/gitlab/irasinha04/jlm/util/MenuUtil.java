package com.gitlab.irasinha04.jlm.util;

import java.util.Scanner;

public class MenuUtil {

	public static int displayMainMenu() {
		System.out.println("########## MENU ##########");
		System.out.println("#                        #");
		System.out.println("# 1. Book Management     #");
		System.out.println("# 2. Member Managenent   #");
		System.out.println("# 3. Exit                #");
		System.out.println("#                        #");
		System.out.println("##########################");

		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		scanner.nextLine();
		return option;
	}
	
	public static int displayMemberMenu() {

		System.out.println("####### Member MENU ######");
		System.out.println("# 1. Create member       #");
		System.out.println("# 2. Read member details #");
		System.out.println("# 3. Update member name  #");
		System.out.println("# 4. Update member email #");
		System.out.println("# 5. Update member phone #");
		System.out.println("# 6. Delete member       #");
		System.out.println("# 7. Main Menu           #");
		System.out.println("##########################");

		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		scanner.nextLine();
		return option;
	}
	
	public static int displayBookMenu() {
		System.out.println("######## Book MENU #######");
		System.out.println("# 1. Create book         #");
		System.out.println("# 2. Read book details   #");
		System.out.println("# 3. Update book title   #");
		System.out.println("# 4. Update book author  #");
		System.out.println("# 5. Update book genre   #");
		System.out.println("# 6. Update book rating  #");
		System.out.println("# 7. Delete book         #");
		System.out.println("# 8. Main Menu           #");
		System.out.println("##########################");

		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		scanner.nextLine();
		return option;
	}
}