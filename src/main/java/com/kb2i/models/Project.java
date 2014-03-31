package com.kb2i.models;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="project")
public class Project implements Serializable{
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_PROJECT")
	private int id ;
	
	@NaturalId
	@Column(name="IDENTIFIANT")
	private String identifiant;
	@Column(name="INTITULE")
	private String intitule;
	@Column(name="DESCRIPTION")
	private String description;
	@Column(name="DATEAJOUT")
	private Date dateajout;
	@Column(name="VISIBILITE")
	private boolean visibilite;
	@OneToMany(mappedBy="project")	
	private Set<Membre> listmembres= new HashSet<Membre>(0);
	
	private Configprojet config;
	
	/*	@Column(name="SOUSPROJET")
	private java.util.List<Project> listprojets;
	@Column(name="PARENT")
	private Project projetparent;
	*/
/**********************************************************/ 
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
/**********************************************************/	
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	
/**********************************************************/
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
/**********************************************************/
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
/**********************************************************/
	public Date getDateajout() {
		return dateajout;
	}
	public void setDateajout(Date dateajout) {
		this.dateajout = dateajout;
	}

/**********************************************************/
	public boolean isVisibilite() {
		return visibilite;
	}
	public void setVisibilite(boolean visibilite) {
		this.visibilite = visibilite;
	}

/**********************************************************/
	
	public Set<Membre> getListmembres() {
		return listmembres;
	}
	public void setListmembres(Set<Membre> listmembres) {
		this.listmembres = listmembres;
	}
/**********************************************************/
/*	public java.util.List<Project> getListprojets() {
		return listprojets;
	}
	public void setListprojets(java.util.List<Project> listprojets) {
		this.listprojets = listprojets;
	}
*/
/**********************************************************/
/*	public Project getProjetparent() {
		return projetparent;
	}
	public void setProjetparent(Project projetparent) {
		this.projetparent = projetparent;
	}
*/	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CONFIG_FK")
	public Configprojet getConfig() {
		return config;
	}
	public void setConfig(Configprojet config) {
		this.config = config;
	}
	
}
