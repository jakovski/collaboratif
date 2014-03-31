package com.kb2i.models;

import java.io.Serializable;
import java.util.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="demande")
public class Demande implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_DEMANDE")
	private int id_demande;
	@Column(name="TYPE", nullable=false)
	private int type;
	@Column(name="STATUS", nullable=false)
	private int status;
	@Column(name="PRIORITE", nullable=false)
	private int priorite;
	
	private Membre creepar;
	
	private Membre assignea;
	
	@Column(name="OBJET")
	private String objet;
	@Column(name="DESCRIPTION")
	private String description;
	@Column(name="CREATION")
	private Date date_creation;
	@Column(name="ECHEANCE")
	private Date echeance;
	
	
	
	public int getId_demande() {
		return id_demande;
	}
	public void setId_demande(int id_demande) {
		this.id_demande = id_demande;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getPriorite() {
		return priorite;
	}
	public void setPriorite(int priorite) {
		this.priorite = priorite;
	}
	public Membre getCreerpar() {
		return creepar;
	}
	public void setCreerpar(Membre creepar) {
		this.creepar = creepar;
	}
	public Membre getAssignea() {
		return assignea;
	}
	public void setAssignea(Membre assignea) {
		this.assignea = assignea;
	}
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public Date getEcheance() {
		return echeance;
	}
	public void setEcheance(Date echeance) {
		this.echeance = echeance;
	}
}
