package com.demo.repository;

import java.util.List;

import com.demo.model.user;

public interface UserRepository {
	
	List<user> findAllUser();

}
