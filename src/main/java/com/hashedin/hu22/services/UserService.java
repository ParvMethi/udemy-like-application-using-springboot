package com.hashedin.hu22.services;

import com.hashedin.hu22.entities.User;

public interface UserService {
	
	public User addUser(User user);

	public User updateUser(User user);

	public User findById(long userId);
}

