package com.kb2i.managed;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.kb2i.models.User;
import com.kb2i.services.UserServices;


@ManagedBean
@SessionScoped
public class UserBean implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String login;
	private String password;
	
	@ManagedProperty(value="#{userServicesimpl}")
	private UserServices userServices;
	
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserServices getUserServices() {
		return userServices;
	}
	public void setUserServices(UserServices userServices) {
		this.userServices = userServices;
	}
	
	public String afficher(){
		
		User user=(User) userServices.getUserById(2);
		
		System.out.println(userServices.getUserById(1).getLogin());
		
		if(user.getLogin().equals(login) && user.getPassword().equals(password))
		{return "success";}
		return "error";
	}
	
}
