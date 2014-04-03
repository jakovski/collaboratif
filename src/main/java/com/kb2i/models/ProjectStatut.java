package com.kb2i.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="projectStatut")
public class ProjectStatut {
	
	@Id
	@GeneratedValue
	@Column(name="ID_STATUT")
	private int idprojectStatut;
	@Column(name="NOMSTATUT")
	private String nomstatut;
	@Column(name="DESCRIPTION")
	private String description;
	@OneToMany(mappedBy="projectStatut")
	private Set<ProjectConfig> projectConfig = new HashSet<ProjectConfig>(); 
	
	public Set<ProjectConfig> getProjectConfig() {
		return projectConfig;
	}
	public void setProjectConfig(Set<ProjectConfig> projectConfig) {
		this.projectConfig = projectConfig;
	}
	public int getIdprojectStatut() {
		return idprojectStatut;
	}
	public void setIdprojectStatut(int idprojectStatut) {
		this.idprojectStatut = idprojectStatut;
	}
	public String getNomstatut() {
		return nomstatut;
	}
	public void setNomstatut(String nomstatut) {
		this.nomstatut = nomstatut;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
