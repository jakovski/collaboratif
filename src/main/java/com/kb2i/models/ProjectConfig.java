package com.kb2i.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="projectConfig")
public class ProjectConfig implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_PROJECTCONFIG")
	private int id_projectConfig;
	@Column(name="PARTAGE_FICHIER")
	private boolean partagefichier;
	@Column(name="PARTAGE_DOCUMENET")
	private boolean partagedoc;
	@Column(name="ASSIGN_DEMANDE")
	private boolean assigndemande;
	@Column(name="NEWS")
	private boolean news;
	@ManyToOne
	@JoinColumn(name="PROJECT_STATUT",insertable=false, updatable=false)
	private ProjectStatut projectStatut;
	

/*********************************************************************/
	
	public int getIdprojectConfig() {
		return id_projectConfig;
	}
	public void setIdprojectConfig(int id_projectConfig) {
		this.id_projectConfig = id_projectConfig;
	}
	public boolean isPartagefichier() {
		return partagefichier;
	}
	public void setPartagefichier(boolean partagefichier) {
		this.partagefichier = partagefichier;
	}
	public boolean isPartagedoc() {
		return partagedoc;
	}
	public void setPartagedoc(boolean partagedoc) {
		this.partagedoc = partagedoc;
	}
	public boolean isAssigndemande() {
		return assigndemande;
	}
	public void setAssigndemande(boolean assigndemande) {
		this.assigndemande = assigndemande;
	}
	public boolean isNews() {
		return news;
	}
	public void setNews(boolean news) {
		this.news = news;
	}
	public ProjectStatut getProjectStatut() {
		return projectStatut;
	}
	public void setProjectStatut(ProjectStatut projectStatut) {
		this.projectStatut = projectStatut;
	}
	
}
