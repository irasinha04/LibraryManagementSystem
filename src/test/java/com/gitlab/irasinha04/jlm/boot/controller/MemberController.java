package com.gitlab.irasinha04.jlm.boot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gitlab.irasinha04.jlm.Member;
import com.gitlab.irasinha04.jlm.boot.dto.MemberDTO;
import com.gitlab.irasinha04.jlm.service.MemberManagementService;

@RestController
@RequestMapping("/member")
@CrossOrigin(origins = "http://localhost:3000")
public class MemberController {

	private final MemberManagementService mms = new MemberManagementService();

	@RequestMapping(value = "/create", method = RequestMethod.PUT)
	public Integer create(@RequestBody(required = true) MemberDTO memberDTO) {
		return mms.create(memberDTO.getName(), memberDTO.getEmail(), memberDTO.getPhoneNo());
	}

	@RequestMapping(value = "/read/id/{id}", method = RequestMethod.GET)
	public Member read(@PathVariable(value = "id") Integer id) {
		return mms.read(id);
	}

	@RequestMapping(value = "/update/id/{id}/name", method = RequestMethod.POST)
	public void updateName(@PathVariable(value = "id") Integer id, @RequestBody(required = true) String name) {
		mms.updateName(id, name);
	}

	@RequestMapping(value = "/update/id/{id}/email", method = RequestMethod.POST)
	public void updateEmail(@PathVariable(value = "id") Integer id, @RequestBody(required = true) String email) {
		mms.updateEmail(id, email);
	}

	@RequestMapping(value = "/update/id/{id}/phone", method = RequestMethod.POST)
	public void updatePhoneNo(@PathVariable(value = "id") Integer id, @RequestBody(required = true) String phoneNo) {
		mms.updatePhoneNo(id, phoneNo);
	}
	
	@RequestMapping(value = "/delete/id/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") Integer id) {
		mms.delete(id);
	}
}
