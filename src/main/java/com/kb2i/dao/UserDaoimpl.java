package com.kb2i.dao;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.kb2i.models.User;

@Repository
@Scope("session")
public class UserDaoimpl implements UserDao,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SessionFactory sessionFactory;
	
	@Autowired
	User user;
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	@Autowired
	public UserDaoimpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}

	
	
	public Session currentseSession(){
		return  this.sessionFactory.getCurrentSession();
	}
	
	@Transactional
	public void saveUser(User user) {
		currentseSession().save(user);
		
	}
	
	@Transactional
	public User getUserById(int id ){			
		try {
		this.user= (User) currentseSession().get(User.class,id);
		}catch (NullPointerException e){
			e.getStackTrace();
		}	
		return user ;		
	}

	
	
}
