package com.kb2i.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="user")
public class User implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_USER")
	private int id;
		
	/*
	@Column(name="NOM")	
	private String nom;
	
	@Column(name="PRENOM")
	private String prenom;
	
	@Column(name="ADDRESS")
	private String adresse;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="TELEPHONE")
	private String telephone;
	
	@Column(name="PHOTO")
	private String photo;
	
	@Column(name="DATE_NAIS")
	private Date date_naissance;
	
	@Column(name="DATE_CREAt")
	private Date date_creation;
	
	*/
	@Column(name="LOGIN")
	private String login;
	
	@Column(name="PASSWORD")
	private String password;
	
	@OneToMany(mappedBy="user")
	private Set<Membre> listprojects = new HashSet<Membre>();
	@ManyToMany(mappedBy="users")
	private Set<Groupe> groupes = new HashSet<Groupe>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
/*	public String getNom() {
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
*/
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
	
	public Set<Membre> getListproject() {
	return listprojects;
	}
	public void setListproject(Set<Membre> listprojects) {
		this.listprojects = listprojects;
	}
	protected Set<Groupe> getGroupes() {
		return groupes;
	}
	protected void setGroupes(Set<Groupe> groupes) {
		this.groupes = groupes;
	}	
	
	public void addtogroupe (Groupe groupe){
		this.getGroupes().add(groupe);
		groupe.getUsers().add(this);
	}
	
	public void removegroupe(Groupe groupe){
		this.getGroupes().remove(groupe);
		groupe.getUsers().remove(this);
	}

}
