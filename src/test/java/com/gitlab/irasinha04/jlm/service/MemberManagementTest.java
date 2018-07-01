package com.gitlab.irasinha04.jlm.service;

import com.gitlab.irasinha04.jlm.Member;

public class MemberManagementTest {
	
	private static final String PHONE_NUM = "9560084813";
	private static final String EMAIL = "irasinha.04@gmail.com";
	private static final String NAME = "Ira";

	public static void test(String actual, String expected, String variable) {
	    System.out.println(variable + " Test " + (actual.equals(expected)? "Passed" : "Failed"));
	}
	
	public static void main(String[] args) {
		MemberManagementService test = new MemberManagementService();
		
		int id = test.createMember(NAME, EMAIL, PHONE_NUM);
		Member m = test.readMember(id);

		test(NAME, m.getName(), "Name");
		test(EMAIL, m.getEmail(), "Email");
		test(PHONE_NUM, m.getPhoneNo(), "Phone No.");
	}
}
