package com.shadab.springdatajpa.springboot.service;


import java.util.List;

import com.shadab.springdatajpa.springboot.model.User;

public interface UserService {
	
	User findById(Long id);

	User findByName(String name);
	
	User findBySalary(double salary);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserById(Long id);

	void deleteAllUsers();

	List<User> findAllUsers();

	boolean isUserExist(User user);
}