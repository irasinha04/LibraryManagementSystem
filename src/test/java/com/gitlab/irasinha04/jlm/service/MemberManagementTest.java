package com.gitlab.irasinha04.jlm.service;

import com.gitlab.irasinha04.jlm.Member;

//import com.gitlab.irasinha04.jlm.Member;

public class MemberManagementTest {
	
	public static void test(String actual, String expected, String variable) {
	    System.out.println(variable + " Test " + (actual.equals(expected)? "Passed" : "Failed"));
	}
	
	public static void main(String[] args) {
		MemberManagementService test = new MemberManagementService();
		int id = test.createMember("Ira", "irasinha.04@gmail.com", "9560084813");
		Member m = test.readMember(id);
		
		test("Ira", m.getName(), "Name");
		test("irasinha.04@gmail.com", m.getEmail(), "Email");
		test("9560084813", m.getPhoneNo(), "Phone No.");
		
//		System.out.println("Member created");
//		System.out.println("Details of member :");
//		System.out.println(m);
//		System.out.println(m.toString());
	}
}
