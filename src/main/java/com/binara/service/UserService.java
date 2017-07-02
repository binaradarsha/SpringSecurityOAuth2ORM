package com.binara.service;

import java.util.List;

import com.binara.model.User;
import org.springframework.security.access.prepost.PreAuthorize;


public interface UserService {

	@PreAuthorize("hasAuthority('ADMIN')")
	User findById(long id);
	
	User findByName(String name);

	User findByUsername(String username);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(long id);

	List<User> findAllUsers(); 
	
	void deleteAllUsers();
	
	public boolean isUserExist(User user);
	
}
