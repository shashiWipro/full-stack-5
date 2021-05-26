package com.full.stack.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.full.stack.test.model.Users;

@Repository
public interface IUserRepository extends JpaRepository<Users,Integer>{
public Users findByusername(String username);
}
