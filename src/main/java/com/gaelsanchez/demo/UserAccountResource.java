package com.gaelsanchez.demo;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAccountResource {
	
	@Autowired
	UserRepository repo;
	
	@GetMapping("/api/users")
	public List<UserAccount> getUsers(){
		
		List<UserAccount> list = (List<UserAccount>) repo.findAll();
		
		return list;
	}

}
