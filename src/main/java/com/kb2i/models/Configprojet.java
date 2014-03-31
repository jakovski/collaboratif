package com.kb2i.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="configprojet")
public class Configprojet implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_configprojet")
	private int id_configprojet;
	@Column(name="partagefichier")
	private boolean partagefichier;
	@Column(name="partagedocument")
	private boolean partagedoc;
	@Column(name="assigndemande")
	private boolean assigndemande;
	@Column(name="news")
	private boolean news;
	
	
	private Project project;
/*********************************************************************/
	
	public int getId_configprojet() {
		return id_configprojet;
	}
	public void setId_configprojet(int id_configprojet) {
		this.id_configprojet = id_configprojet;
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
	
	@OneToOne(mappedBy="config")
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	
}
