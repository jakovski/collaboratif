package com.kb2i.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="groupe")
public class Groupe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_GROUPE")
	private int id_groupe;
	@Column(name="NOM_GROUPE")
	private String nom_groupe;
	@Column(name="DESCRIPTION")
	private String description;
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="groupe_user", joinColumns={
		@JoinColumn(name="ID_GROUPE", nullable=false, updatable=false)},
		inverseJoinColumns={@JoinColumn(name="ID_USER", nullable=false, updatable=false)}
			)
	private Set<User> users=new HashSet<User>();
	
	
	public int getId_groupe() {
		return this.id_groupe;
	}
	public void setId_groupe(int id_groupe) {
		this.id_groupe = id_groupe;
	}
	public String getNom_groupe() {
		return this.nom_groupe;
	}
	public void setNom_groupe(String nom_groupe) {
		this.nom_groupe = nom_groupe;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public void adduser(){
		//this.users.add()		
	}
	
}
