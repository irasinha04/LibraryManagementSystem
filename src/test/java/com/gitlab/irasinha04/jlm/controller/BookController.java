package com.gitlab.irasinha04.jlm.controller;

import java.io.IOException;
import java.util.Scanner;

import com.gitlab.irasinha04.jlm.Book;
import com.gitlab.irasinha04.jlm.service.BookManagementService;
import com.gitlab.irasinha04.jlm.util.MenuUtil;

public class BookController {

	BookManagementService bms = new BookManagementService();
	
	public void performBookOperation(int option) {

		boolean isActive = true;
		while (isActive) {
			switch (option) {

			case 1: {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter title : ");
				String title = scanner.nextLine();

				System.out.println("Enter genre : ");
				String genre = scanner.nextLine();

				System.out.println("Enter author : ");
				String author = scanner.nextLine();

				System.out.println("Enter rating : ");
				int rating = scanner.nextInt();
				scanner.nextLine();

				int id = bms.create(title, genre, author, rating);
				System.out.println("New book record created successfully ! Book ID : " + id);

				System.out.println();
				break;
			}

			case 2: {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Book ID : ");
				int id = scanner.nextInt();
				scanner.nextLine();
				Book book = bms.readDetails(id);
				System.out.println("The book's details are as follows: ");
				System.out.println("Title : " + book.getTitle());
				System.out.println("Genre : " + book.getGenre());
				System.out.println("Author : " + book.getAuthor());
				System.out.println("Rating : " + book.getRating());

				System.out.println();
				break;
			}

			case 3: {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Book ID : ");
				int id = scanner.nextInt();
				scanner.nextLine();
				Book book = bms.readDetails(id);
				System.out.println("The book's title is " + book.getTitle());
				System.out.println("Enter new book title : ");
				String newTitle = scanner.nextLine();
				bms.updateTitle(id, newTitle);

				System.out.println();
				break;
			}

			case 4: {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Book ID : ");
				int id = scanner.nextInt();
				scanner.nextLine();

				Book book = bms.readDetails(id);
				System.out.println("Author's name is " + book.getAuthor());
				System.out.println("Enter updated author's name : ");
				String newAuthor = scanner.nextLine();

				bms.updateAuthor(id, newAuthor);

				System.out.println();
				break;
			}

			case 5: {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Book ID : ");
				int id = scanner.nextInt();
				scanner.nextLine();

				Book book = bms.readDetails(id);
				System.out.println("The book's genre is " + book.getGenre());
				System.out.println("Enter updated genre : ");
				String newGenre = scanner.nextLine();

				bms.updateGenre(id, newGenre);

				System.out.println();
				break;
			}

			case 6: {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Book ID : ");
				int id = scanner.nextInt();
				scanner.nextLine();

				Book book = bms.readDetails(id);
				System.out.println("The book's rating is " + book.getRating());
				System.out.println("Enter updated rating : ");
				int newRating = scanner.nextInt();
				scanner.nextLine();

				bms.updateRating(id, newRating);

				System.out.println();
				break;
			}

			case 7: {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Book ID : ");
				int id = scanner.nextInt();
				scanner.nextLine();

				Book book = bms.readDetails(id);
				System.out.println("The book's details are as follows: ");
				System.out.println("Title : " + book.getTitle());
				System.out.println("Author : " + book.getAuthor());
				System.out.println("Genre : " + book.getGenre());
				System.out.println("Rating : " + book.getRating());

				System.out.println("Are you sure you wamt to delete book  (yes = 1, no = 0 : ");
				int decision = scanner.nextInt();
				scanner.nextLine();
				if (decision == 1) {
					bms.delete(id);
				}

				System.out.println();
				break;
			}

			case 8: {
				isActive = false;
				break;
			}

			default: {
				System.out.println("Oops! You entered the wrong choice. Try again");
			}
			}
			if(option != 8) {
				option = MenuUtil.displayBookMenu();
			}
		}
	}

	public void retrieveBookRecords(String filePath) throws IOException {
		bms.retrieveBook(filePath);
	}

	public void saveBookRecords(String filePath) throws IOException {
		bms.saveBook(filePath);
		
	}
}
