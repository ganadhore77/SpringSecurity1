package com.security.controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class DemoController {

	@GetMapping("/")
	public String demo(HttpServletRequest request) {

		System.out.println("SESSIONID : " + request.getSession().getId());
		return "Hello Security ,  We are champion	  -     " + request.getSession().getId();
	}

	@GetMapping("/csrf-token")
	public CsrfToken csrfToken(HttpServletRequest request) {

		return (CsrfToken) request.getAttribute("_csrf");

	}
}
