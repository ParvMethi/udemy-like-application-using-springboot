package com.hashedin.hu22.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hashedin.hu22.entities.User;
import com.hashedin.hu22.exceptions.UserNotExistsException;
import com.hashedin.hu22.repositories.UserDao;



@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public User addUser(User user) {
		userDao.save(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		userDao.save(user);
		return user;
	}

	@Override
	public User findById(long userId) throws UserNotExistsException {
		Optional<User> optionalUser = userDao.findById(userId);
		if(optionalUser.isEmpty()) {
			throw new UserNotExistsException("Invalid User Id: " + userId);
		}
		return optionalUser.get();
	}

}
