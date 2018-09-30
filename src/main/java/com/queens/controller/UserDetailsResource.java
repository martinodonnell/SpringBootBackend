package com.queens.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.queens.entity.UserDetails;
import com.queens.exception.StudentNotFoundException;
import com.queens.repository.UserDetailsRepository;

@RestController
public class UserDetailsResource {

	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@GetMapping("/users")
	public List<UserDetails> retrieveAllUsers() {
		return userDetailsRepository.findAll();
	}

	@GetMapping("/users/{id}")
	public UserDetails retrieveUser(@PathVariable long id) {
		Optional<UserDetails> user = userDetailsRepository.findById(id);

		System.out.println("getusers: " + user.toString());
		if (!user.isPresent())
			throw new StudentNotFoundException("id-" + id);

		return user.get();
	}
}