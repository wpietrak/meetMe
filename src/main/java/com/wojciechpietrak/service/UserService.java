package com.wojciechpietrak.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.wojciechpietrak.model.User;


public interface UserService extends UserDetailsService{

	List<User> findAll();

	void save(User user);

	User findOne(Long id);

	void delete(Long id);
	
	User findByEmail(String email) ;

	User findById(Long id);

}
