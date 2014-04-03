package com.kb2i.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="fichier")
public class Fichier {
	
	
	@Id
	@GeneratedValue
	@Column(name="ID_FICHIER")
	private int id_fichier;
	@Column(name="NOM_FICHIER")
	private String nom_fichier;
	@Column(name="DESCRIPTION")
	private String description;
	@Column(name="CONTEXT")
	private String context;
	@Column(name="DATE_AJOUT")
	private Date date_ajout;
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumns({
	@JoinColumn(name="USER_ID",referencedColumnName="USER_ID"),
	@JoinColumn(name="PROJECT_ID",referencedColumnName="PROJECT_ID")})
	private Membre membre;
	@OneToMany(mappedBy="fichier")
	private Set<Demande> demandes = new HashSet<Demande>();
/****************************************************************************************/
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
	public Membre getMembre() {
		return membre;
	}
	public void setMembre(Membre membre) {
		this.membre = membre;
	}
}
