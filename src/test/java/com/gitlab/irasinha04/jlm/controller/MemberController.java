package com.gitlab.irasinha04.jlm.controller;

import java.io.IOException;
import java.util.Scanner;

import com.gitlab.irasinha04.jlm.Member;
import com.gitlab.irasinha04.jlm.service.MemberManagementService;
import com.gitlab.irasinha04.jlm.util.MenuUtil;

public class MemberController {

	MemberManagementService mms = MemberManagementService.getInstance();
	
	public void performMemberOperation(int option) {

		boolean isActive = true;
		while (isActive) {
			switch (option) {

			case 1: {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter name : ");
				String name = scanner.nextLine();

				System.out.println("Enter email id : ");
				String emailId = scanner.nextLine();

				System.out.println("Enter phone number : ");
				String phoneNum = scanner.nextLine();

				int id = mms.create(name, emailId, phoneNum);
				System.out.println("New member created successfully ! Member ID : " + id);
				System.out.println();
				break;
			}

			case 2: {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Member ID : ");
				int id = scanner.nextInt();
				scanner.nextLine();

				Member member = mms.read(id);
				System.out.println("The member's details are as follows: ");
				System.out.println("Name : " + member.getName());
				System.out.println("Email Id : " + member.getEmail());
				System.out.println("Phone number : " + member.getPhoneNo());
				System.out.println("Date of Joining : " + member.getJoinDate());
				System.out.println("No. of books issued : " + member.getNumOfBooksIssued());
				System.out.println("Fine pending : INR " + member.getFine());
				System.out.println();
				break;
			}

			case 3: {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Member ID : ");
				int id = scanner.nextInt();
				scanner.nextLine();

				Member member = mms.read(id);
				System.out.println("The member's name is : " + member.getName());
				System.out.println("Enter new name : ");
				String newName = scanner.nextLine();
				mms.updateName(id, newName);
				System.out.println();
				break;

			}
			case 4: {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Member ID : ");
				int id = scanner.nextInt();
				scanner.nextLine();

				Member member = mms.read(id);
				System.out.println("The member's email id is : " + member.getName());
				System.out.println("Enter new email id : ");
				String newEmail = scanner.nextLine();
				mms.updateEmail(id, newEmail);
				System.out.println();
				break;
			}
			case 5: {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Member ID : ");
				int id = scanner.nextInt();
				scanner.nextLine();

				Member member = mms.read(id);
				System.out.println("The member's phone number is : " + member.getName());
				System.out.println("Enter new phone number : ");
				String newPhoneNo = scanner.nextLine();

				mms.updatePhoneNo(id, newPhoneNo);
				System.out.println();
				break;
			}
			case 6: {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Member ID : ");
				int id = scanner.nextInt();
				scanner.nextLine();

				Member member = mms.read(id);
				System.out.println("The member's details are as follows: ");
				System.out.println("Name : " + member.getName());
				System.out.println("Email Id : " + member.getEmail());
				System.out.println("Phone number : " + member.getPhoneNo());
				System.out.println("Date of Joining : " + member.getJoinDate());
				System.out.println("Are you sure you wamt to delete member  (yes = 1, no = 0 : ");
				int decision = scanner.nextInt();
				scanner.nextLine();
				if (decision == 1) {
					mms.delete(id);
				}
				System.out.println();				
				break;
			}

			case 7: {
				isActive = false;
				break;
			}
			default: {
				System.out.println("Oops! You entered the wrong choice. Try again");
			}
			}
			if(option != 7) {
				option = MenuUtil.displayMemberMenu();
			}
		}
	}

	public void retrieveMemberRecords(String filePath) throws IOException {
		mms.retrieveMember(filePath);
		
	}

	public void saveMemberRecords(String filePath) throws IOException {
		// TODO Auto-generated method stub
		mms.saveMember(filePath);
	}
}
