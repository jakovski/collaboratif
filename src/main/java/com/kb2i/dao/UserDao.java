package com.kb2i.dao;

import com.kb2i.models.User;

public interface UserDao {
	
	void saveUser(User user);
	User getUserById(int id );
}
