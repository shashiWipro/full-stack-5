package com.full.stack.test.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.full.stack.test.model.Users;
import com.full.stack.test.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest 
{
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private UserService service;
	
	@Test
	public void test1() throws Exception
	{
		when(service.findUserById(600))
		      .thenReturn(Optional.of(new Users(600, "xxxx", "xxxx", "xxxx@gmail.com")));
		RequestBuilder accept = MockMvcRequestBuilders.get("/users/{userId}",600)
				.accept(MediaType.APPLICATION_JSON);
		    mockMvc.perform(accept)
		   .andExpect(status().isOk())
		   .andExpect(content().json("{id:600, username:xxxx, password:xxxx, email:xxxx@gmail.com}"));
		
	}
}
