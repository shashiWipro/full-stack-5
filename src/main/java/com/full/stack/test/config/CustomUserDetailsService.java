package com.full.stack.test.config;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.full.stack.test.model.Users;
import com.full.stack.test.repository.IUserRepository;
@Service
public class CustomUserDetailsService implements UserDetailsService{
	@Autowired
	private IUserRepository userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = userRepo.findByusername(username);
		return new User(user.getUsername(), user.getPassword(), new ArrayList<>());
	}

}
