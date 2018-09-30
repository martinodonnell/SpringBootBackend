package com.queens.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//	UserDetailsResource userDetailsResource = new UserDetailsResource();
//	@RequestMapping("/login")
//	public String login(@RequestBody String userName,@RequestBody String password) {
//		
//		userDetailsResource.retrieveUser(id)
//		return "true";
//	}
	
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
}
