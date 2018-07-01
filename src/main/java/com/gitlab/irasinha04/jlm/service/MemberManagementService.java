package com.gitlab.irasinha04.jlm.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.gitlab.irasinha04.jlm.Member;

public class MemberManagementService {
	
	
	private Map<Integer, Member> memberMap = new HashMap<>();
	
	public int createMember(String name, String email, String phoneNo) {
		
		int memberId = Double.valueOf(Math.random() * 10000).intValue();

		Member member = new Member();
		member.setName(name);
		member.setEmail(email);
		member.setPhoneNo(phoneNo);
		member.setId(memberId);	
		member.setJoinDate(new Date().toString());
		memberMap.put(memberId, member);
		
		return memberId;
	}
	

	public Member readMember(int id) {
		return memberMap.get(id);
	}
	
	public void updateMemberName(int id, String newName) {
		Member m = memberMap.get(id);
		m.setName(newName);
	}
	
	public void updateMemberEmail(int id, String newEmail) {
		Member m = memberMap.get(id);
		m.setEmail(newEmail);
	}

	public void updateMemberPhoneNo(int id, String newPhoneNo) {
		Member m = memberMap.get(id);
		m.setPhoneNo(newPhoneNo);
	}
	
	public void deleteMember(int id) {
		memberMap.remove(id);
	}
}
