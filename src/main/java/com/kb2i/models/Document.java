package com.kb2i.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="document")
public class Document implements Serializable {
	@Id
	@GeneratedValue
	@Column(name="ID_DOCUMENT")
	private int id_document;
	@Column(name="NOM_DOCUMENT")
	private String nom_document;
	@Column(name="DESCRIPTION")
	private String description;
	@Column(name="CONTEXT")
	private String context;
	@Column(name="DATE_AJOUT")
	private Date date_ajout;
	
	private Membre ajoutpar;

	public int getId_document() {
		return id_document;
	}
	public void setId_document(int id_document) {
		this.id_document = id_document;
	}
	public String getNom_document() {
		return nom_document;
	}
	public void setNom_document(String nom_document) {
		this.nom_document = nom_document;
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
	public Membre getAjoutpar() {
		return ajoutpar;
	}
	public void setAjoutpar(Membre ajoutpar) {
		this.ajoutpar = ajoutpar;
	}

}
