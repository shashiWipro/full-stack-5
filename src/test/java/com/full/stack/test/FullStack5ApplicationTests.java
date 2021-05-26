package com.full.stack.test;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class FullStack5ApplicationTests {

	
	@Autowired
	private TestRestTemplate restTemplate;
	@Test
	public void contextLoads() throws JSONException {
		String result = restTemplate.getForObject("/all-users", String.class);
		JSONAssert.assertEquals("[{id:1,username:shashi,password:shashi@123,email:shashi@gmail.com},{id:2,username:bhushan,password:bhushan@123,email:bhushan@gmail.com},{id:3,username:prasad,password:prasad@123,email:prasad@gmail.com}]", result, false);
	}

}
