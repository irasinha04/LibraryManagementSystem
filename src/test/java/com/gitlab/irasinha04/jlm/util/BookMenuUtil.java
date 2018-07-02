package com.gitlab.irasinha04.jlm.util;

import java.util.Scanner;

public class BookMenuUtil {

	public static int bookMenu() {
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
