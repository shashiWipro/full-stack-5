package com.full.stack.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.full.stack.test.model.Users;
import com.full.stack.test.repository.IUserRepository;

@Service
public class UserService {
	@Autowired
	public IUserRepository userRepository;
	
	
	public List<Users> findAllUsers()
	{
		List<Users> allUsers = userRepository.findAll();
		return allUsers;
	}
	
	public Users saveUsers(Users user)
	{
	 Users user1 = userRepository.save(user);
		return user1;
	}
	
	public Optional<Users> findUserById(Integer userId)
	{
		Optional<Users> user = userRepository.findById(userId);
		return user;
	}
	
}
