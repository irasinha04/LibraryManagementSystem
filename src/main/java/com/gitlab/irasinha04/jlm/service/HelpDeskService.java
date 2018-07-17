package com.gitlab.irasinha04.jlm.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.gitlab.irasinha04.jlm.Book;
import com.gitlab.irasinha04.jlm.Member;
import com.gitlab.irasinha04.jlm.exception.HelpdeskException;

public class HelpDeskService {
	
	BookManagementService bms = BookManagementService.getInstance();
	MemberManagementService mms = MemberManagementService.getInstance();

	public Map<Integer, Book> getAllBooksInfo() throws IOException  {
		return bms.returnAllBookInfo();		

	}

	public Map<Integer, Member> getAllMemberInfo() throws IOException {
		 return mms.returnAllMemberInfo();
	}
}