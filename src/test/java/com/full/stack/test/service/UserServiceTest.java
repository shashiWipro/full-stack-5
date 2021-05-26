package com.full.stack.test.service;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.full.stack.test.model.Users;
import com.full.stack.test.repository.IUserRepository;
import com.full.stack.test.service.UserService;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {
@InjectMocks
private UserService service;
	
@Mock
private IUserRepository userRepo;
	@Test
	public void test1()
	{
		when(userRepo.findAll())
		 .thenReturn(Arrays.asList(new Users(700, "ppp", "ppp@123", "ppp@gmail.com"),
				                   new Users(800, "yyy",  "yyy@123",  "yyy@gmail.com")));
		
		List<Users> users = service.findAllUsers();
		Assert.assertEquals("ppp", users.get(0).getUsername());
	}
	

}
