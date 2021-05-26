package com.full.stack.test;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.full.stack.test.model.Student;
import com.full.stack.test.model.Users;
import com.full.stack.test.repository.IUserRepository;
import com.full.stack.test.repository.StudentRepository;

@SpringBootApplication
public class FullStack5Application {
	@Autowired
  private StudentRepository studentRepository;
	@Autowired
	private IUserRepository userRepo;
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(FullStack5Application.class, args);
	}
    @PostConstruct
	public void init()
	{
    	userRepo.save(new Users(1001, "shashi", "shashi@123","shashi@gmail.com"));
    	userRepo.save(new Users(1002, "bhushan", "bhushan@123","bhushan@gmail.com"));
    	userRepo.save(new Users(1003, "prasad", "prasad@123","prasad@gmail.com"));
    	
    	Student saveStudentPassport = studentRepository.saveStudentPassport();
    	//Student student = studentRepository.getStudentPassportDetails();
    	logger.info("student->{}",saveStudentPassport);
    	logger.info("Password-{}",saveStudentPassport.getPassport());
	}
	
}
