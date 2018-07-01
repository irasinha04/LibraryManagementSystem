package com.gitlab.irasinha04.jlm.service;

import com.gitlab.irasinha04.jlm.Member;

//import com.gitlab.irasinha04.jlm.Member;

public class MemberManagementTest {
	public static void main(String[] args) {
		MemberManagementService test = new MemberManagementService();
		int id = test.createMember("Ira", "irasinha.04@gmail.com", "9560084813");
		Member m = test.readMember(id);
		
		if((m.getName()).equals("Ira"))
			System.out.println("Name test passed");
		else
			System.out.println("Name test failed");
		
		if((m.getEmail()).equals("irasinha.04@gmail.com"))
			System.out.println("E-Mail test passed");
		else
			System.out.println("E-Mail test failed");
		
		if((m.getPhoneNo()).equals("9560084813"))
			System.out.println("Phone test passed");
		else
			System.out.println("Phone test failed");
		

//		System.out.println("Member created");
//		System.out.println("Details of member :");
//		System.out.println(m);
//		System.out.println(m.toString());
	}
}
