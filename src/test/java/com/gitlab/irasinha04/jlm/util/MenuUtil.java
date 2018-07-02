package com.gitlab.irasinha04.jlm.util;

import java.util.Scanner;

public class MenuUtil {

	public static int Menu() {
		System.out.println("########## MENU ##########");
		System.out.println("#                        #");
		System.out.println("# 1. Book Management     #");
		System.out.println("# 2. Member Managenent   #");
		System.out.println("#                        #");
		System.out.println("##########################");

		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		scanner.nextLine();
		return option;
	}
}
