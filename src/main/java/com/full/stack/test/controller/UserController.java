package com.full.stack.test.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.full.stack.test.controller.exception.UserNotAvailableException;
import com.full.stack.test.model.Users;
import com.full.stack.test.service.UserService;

@RestController
@CrossOrigin(origins="*",allowedHeaders="*")
public class UserController {
	@Autowired
	public UserService userService;
	
	@GetMapping("/all-users")
	public List<Users> findAllUsers()
	{
		List<Users> allUsers = userService.findAllUsers();
		return allUsers;
	}
	
	@PostMapping("/users")
	public ResponseEntity<Object> saveUsers(@RequestBody Users user)
	{
	    Users user1 = userService.saveUsers(user);
	    URI location = ServletUriComponentsBuilder
	    		.fromCurrentRequest().path("/{users}").buildAndExpand(user.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@GetMapping("/users/{userId}")
	public Users findUserById(@PathVariable Integer userId)
	{
		Optional<Users> user = userService.findUserById(userId);
		if(user.isPresent())
		{
			return user.get();
		}
		throw new UserNotAvailableException("id:"+userId);
		
		
	}
	
}
