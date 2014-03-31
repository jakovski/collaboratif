package com.kb2i.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="permission")
public class Permission {
	
	
	@Id
	@GeneratedValue
	@Column(name="ID_PERMISSION")
	private int id_permission;
	@Column(name="LIBILLE")
	private int libille;
	@Column(name="DESCRIPTION")
	private String description;
	@ManyToMany
	@JoinTable(name="role_permission", joinColumns={
			@JoinColumn(name="ID_PERMISSION",nullable=false, updatable=false)},
			inverseJoinColumns={@JoinColumn(name="ID_ROLE",nullable=false,updatable=false)}
			)
	private Set<Role> roles=new HashSet<Role>();
	
	
	public int getId_permission() {
		return id_permission;
	}
	public void setId_permission(int id_permission) {
		this.id_permission = id_permission;
	}
	public int getLibille() {
		return libille;
	}
	public void setLibille(int libille) {
		this.libille = libille;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	protected Set<Role> getRoles() {
		return roles;
	}
	protected void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	public void addtorole(Role role){
		this.getRoles().add(role);
		role.getPermissions().add(this);	
	}

	public void removefromrole(Role role){
		this.getRoles().remove(role);
		role.getPermissions().remove(this);
	}

}