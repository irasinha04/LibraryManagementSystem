package com.gitlab.irasinha04.jlm.service;

import com.gitlab.irasinha04.jlm.Member;
import com.gitlab.irasinha04.jlm.util.TestUtil;

public class MemberManagementTest {
	
	private static final String PHONE_NUM = "9560084813";
	private static final String EMAIL = "irasinha.04@gmail.com";
	private static final String NAME = "Ira";

	public static void main(String[] args) {
		MemberManagementService test = MemberManagementService.getInstance();
		
		int id = test.create(NAME, EMAIL, PHONE_NUM);
		Member m = test.read(id);

		TestUtil.bmsTest(NAME, m.getName(), "Name");
		TestUtil.bmsTest(EMAIL, m.getEmail(), "Email");
		TestUtil.bmsTest(PHONE_NUM, m.getPhoneNo(), "Phone No.");
	}
}
