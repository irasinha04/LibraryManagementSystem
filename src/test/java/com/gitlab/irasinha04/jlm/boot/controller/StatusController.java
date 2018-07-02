package com.gitlab.irasinha04.jlm.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {

	@RequestMapping("/check")
	public Integer isAlive() {
		return 1;
	}

}
