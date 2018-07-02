package com.gitlab.irasinha04.jlm.util;

import java.util.Scanner;

public class MemberMenuUtil {

	public static int memberMenu() {

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
}
