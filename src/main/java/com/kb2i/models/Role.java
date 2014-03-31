package com.kb2i.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.print.attribute.HashAttributeSet;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="role")
public class Role {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_ROLE")
	private int id_role;
	@Column(name="LIBILLE")
	private int libille;
	@Column(name="DESCRIPTION")
	private String description;
	@ManyToMany(mappedBy="roles")
	private Set<Permission> permissions=new HashSet<Permission>();
	
	public int getId_role() {
		return id_role;
	}
	public void setId_role(int id_role) {
		this.id_role = id_role;
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
	public Set<Permission> getPermissions() {
		return permissions;
	}
	public void setPermissions(Set<Permission> permissions) {
		this.permissions = permissions;
	}
		
}
