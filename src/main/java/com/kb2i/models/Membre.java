package com.kb2i.models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="membre")
public class Membre implements Serializable {
	
	@EmbeddedId
	@AttributeOverrides({
		@AttributeOverride(name="user_id",column=@Column(name="USER_ID")),
		@AttributeOverride(name="project_id",column=@Column(name="PROJECT_ID"))
	})
	private MembreId id;
	
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="USER_ID",insertable=false, updatable=false)
	private User user;
	
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="PROJECT_ID",insertable=false, updatable=false)
	private Project project;
	
	@Column(name="AJOUT_LE")
	private Date ajoutle;
	


	public MembreId getId() {
		return id;
	}

	public void setId(MembreId id) {
		this.id = id;
	}

	public Date getAjoutle() {
		return ajoutle;
	}

	public void setAjoutle(Date ajoutle) {
		this.ajoutle = ajoutle;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	
}
