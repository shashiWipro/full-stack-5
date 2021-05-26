package com.full.stack.test.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.full.stack.test.model.Passport;
import com.full.stack.test.model.Student;

@Repository
@Transactional
public class StudentRepository {
	@Autowired
private EntityManager em;
	
	public Student saveStudentPassport()
	{
		Passport p1=new Passport("PASS57575757");
		em.persist(p1);
		
		Student s1=new Student(5000,"shashi");
		s1.setPassport(p1);
		
		em.persist(s1);
		return s1;
	}
	
	
	public Student getStudentPassportDetails()
	{
	return em.find(Student.class, 5000);
	}
}
