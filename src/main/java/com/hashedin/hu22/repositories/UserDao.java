package com.hashedin.hu22.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hashedin.hu22.entities.User;



@Repository
public interface UserDao extends JpaRepository<User, Long> {
	
}
