package com.full.stack.test.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {
@Autowired
private IUserRepository userRepo;
	@Test
	public void test1()
	{
		int size = userRepo.findAll().size();
		Assert.assertEquals(3,size );
	}
	
}
