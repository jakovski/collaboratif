package com.kb2i.managed;

import java.io.Serializable;
import java.util.Date;

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
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	private String telephone;
	private Date datenaissance;
	private String login;
	private String password;
	
	@ManagedProperty(value="#{userServicesimpl}")
	private UserServices userServices;
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Date getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}
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

	public void ajouteruser(){
		User user= new User();
		user.setNom(nom);
		user.setPrenom(prenom);
		user.setEmail(email);
		user.setAdresse(adresse);
		user.setTelephone(telephone);
		user.setDate_naissance(datenaissance);
		user.setDate_creation();
		user.setLogin(login);
		user.setPassword(password);
		userServices.saveUser(user);	
		}
	
	public String connecter(){
		
		if(userServices.getUserByLoginPassword(login, password) != null){
		return "success";}
	
		return "error";
	}
	
}
