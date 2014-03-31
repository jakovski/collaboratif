package com.kb2i.models;

import java.util.Date;

public class Fichier {
	
	private int id_fichier;
	private String nom_fichier;
	private String description;
	private String context;
	private Date date_ajout;
	private int ajoutpar;
	
	public int getId_fichier() {
		return id_fichier;
	}
	public void setId_fichier(int id_fichier) {
		this.id_fichier = id_fichier;
	}
	public String getNom_fichier() {
		return nom_fichier;
	}
	public void setNom_fichier(String nom_fichier) {
		this.nom_fichier = nom_fichier;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public Date getDate_ajout() {
		return date_ajout;
	}
	public void setDate_ajout(Date date_ajout) {
		this.date_ajout = date_ajout;
	}
	public int getAjoutpar() {
		return ajoutpar;
	}
	public void setAjoutpar(int ajoutpar) {
		this.ajoutpar = ajoutpar;
	}
}
