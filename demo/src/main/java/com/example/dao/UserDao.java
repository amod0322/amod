package com.example.dao;

import com.example.model.User;

public interface UserDao {

	void save(User user);
	void delete(User user);

}