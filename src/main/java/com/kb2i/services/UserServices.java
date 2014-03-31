package com.kb2i.services;

import com.kb2i.models.User;

public interface UserServices {
		

	void saveUser(User user);
	User getUserById(int id );
}	
