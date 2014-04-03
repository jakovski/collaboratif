package com.kb2i.services;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.kb2i.dao.UserDao;
import com.kb2i.models.User;


@Service
@Scope("session")
public class UserServicesimpl implements UserServices,Serializable{
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Autowired
		private UserDao userDao;
		

		public void saveUser(User user) {
			userDao.saveUser(user);
		}
		
		public User getUserById(int id) {

			return userDao.getUserById(id);
		}
		
		public UserDao getUserDao() {
		
			return userDao;
		}
		
		public void setUserDao(UserDao userDao) {
			this.userDao = userDao;
		}
		
		public User getUserByLoginPassword(String login, String password){			
		
			return userDao.getUserByLoginPassword(login, password);
		}
}
