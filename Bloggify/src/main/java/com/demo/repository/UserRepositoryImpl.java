package com.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.model.user;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

	public List<user> findAllUser() {
		List<user> userList = new ArrayList<user>();
		// To be implemented...
		return userList;
	}

}
