package com.gitlab.irasinha04.jlm.service;

import com.gitlab.irasinha04.jlm.Member;

//import com.gitlab.irasinha04.jlm.Member;

public class MemberManagementTest {
	public static void main(String[] args) {
		MemberManagementService test = new MemberManagementService();
		int id = test.createMember("Ira", "irasinha.04@gmail.com", "9560084813");
		Member m = test.readMember(id);
		
		System.out.println("Name test " + (m.getName().equals("Ira") ? "Passed" : "Failed"));
		
		System.out.println("Email test " + (m.getEmail().equals("irasinha.04@gmail.com") ? "Passed" : "Failed"));
		
		System.out.println("Phone no. test " + (m.getPhoneNo().equals("9560084813") ? "Passed" : "Failed"));
		
//		System.out.println("Member created");
//		System.out.println("Details of member :");
//		System.out.println(m);
//		System.out.println(m.toString());
	}
}
