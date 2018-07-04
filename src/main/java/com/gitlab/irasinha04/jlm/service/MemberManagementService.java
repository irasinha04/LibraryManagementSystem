package com.gitlab.irasinha04.jlm.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.gitlab.irasinha04.jlm.Book;
import com.gitlab.irasinha04.jlm.Member;


public class MemberManagementService {
	
	private Map<Integer, Member> memberMap = new HashMap<>();
	
	private MemberManagementService() {
	}
	
	private static final MemberManagementService mms = new MemberManagementService();
	
	public static MemberManagementService getInstance() {
		return mms;
	}
	
	public int create(String name, String email, String phoneNo) {
		
		int memberId = Double.valueOf(Math.random() * 10000).intValue();

		Member member = new Member();
		member.setName(name);
		member.setEmail(email);
		member.setPhoneNo(phoneNo);
		member.setId(memberId);	
		member.setJoinDate(new Date().toString());
		member.setIsBlacklisted(false);
		member.setFine(0.00);
		memberMap.put(memberId, member);
		
		return memberId;
	}
	

	public Member read(int id) {
		return memberMap.get(id);
	}
	
	public void updateName(int id, String newName) {
		Member m = memberMap.get(id);
		m.setName(newName);
	}
	
	public void updateEmail(int id, String newEmail) {
		Member m = memberMap.get(id);
		m.setEmail(newEmail);
	}

	public void updatePhoneNo(int id, String newPhoneNo) {
		Member m = memberMap.get(id);
		m.setPhoneNo(newPhoneNo);
	}
	
	public void delete(int id) {
		memberMap.remove(id);
	}

	public void saveMember(String filePath) throws IOException {
		// Write to file
				File file = new File(filePath);
				PrintWriter pw = new PrintWriter(new FileOutputStream(file), true);

				for (Integer key : memberMap.keySet()) {

					Member member = memberMap.get(key);

					String text = member.getId() + "|" + member.getName() + "|" 
					+ member.getEmail() + "|" + member.getPhoneNo() + "|" 
					+ member.getJoinDate() + "|" + member.getIsBlacklisted() + "|"+
					member.getFine() + "|" + member.getNumOfBooksIssued();
					
					pw.println(text);
				}
				
				pw.close();
	}

	public void retrieveMember(String filePath) throws IOException {
		// Read from file
				File file = new File(filePath);
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				String text;
				while ((text = br.readLine()) != null) {
					Member member = new Member();
					String[] arr = text.split("\\|");
					member.setId(Integer.valueOf(arr[0]));
					member.setName(arr[1]);
					member.setEmail(arr[2]);
					member.setPhoneNo(arr[3]);
					member.setJoinDate(arr[4]);
					member.setIsBlacklisted(arr[5].equals("true"));
					member.setFine(Double.valueOf(arr[6]));
					member.setNumOfBooksIssued(Integer.valueOf(arr[7]));

					memberMap.put(member.getId(), member);
				}
				br.close();
				fr.close();
	}
}
