package com.kb2i.models;

import java.io.Serializable;
import java.util.Date;





import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@Column(name="OBJET")
	private String objet;
	@Column(name="DESCRIPTION")
	private String description;
	@Column(name="CREATION")
	private Date datecreation;
	@Column(name="FIN")
	private Date datefin;
	@ManyToOne
	@JoinColumn(name="DEMANDE_TYPE",insertable=false, updatable=false)
	private DemandeType demandeType;
	@ManyToOne
	@JoinColumn(name="DEMANDE_STATUT",insertable=false, updatable=false)
	private DemandeStatut demandeStatut;
	@ManyToOne
	@JoinColumn(name="DEMANDE_PRIORITE",insertable=false, updatable=false)
	private DemandePriorite demandePriorite;
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="CREE_PAR",insertable=false, updatable=false)
	private User creepar;
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="FICHIER",insertable=false, updatable=false)
	private Fichier fichier;
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumns({
	@JoinColumn(name="ASSIGN_A",referencedColumnName="USER_ID"),
	@JoinColumn(name="PROJECT",referencedColumnName="PROJECT_ID")})
	private Membre membre;
/***********************************************************************************************/	
	public int getId_demande() {
		return id_demande;
	}
	public void setId_demande(int id_demande) {
		this.id_demande = id_demande;
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
	public Date getDatecreation() {
		return datecreation;
	}
	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}
	public Date getDatefin() {
		return datefin;
	}
	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}
	public DemandeType getTypeDemande() {
		return demandeType;
	}
	public void setTypeDemande(DemandeType demandeType) {
		this.demandeType = demandeType;
	}
	public DemandeStatut getDemandeStatut() {
		return demandeStatut;
	}
	public void setDemandeStatut(DemandeStatut demandeStatut) {
		this.demandeStatut = demandeStatut;
	}
	public void setCreerpar(User creepar) {
		this.creepar = creepar;
	}
	public Membre getAssignea() {
		return membre;
	}
	public void setAssignea(Membre membre) {
		this.membre= membre;
	}
	public Fichier getFichier() {
		return fichier;
	}
	public void setFichier(Fichier fichier) {
		this.fichier = fichier;
	}
	public DemandePriorite getDemandePriorite() {
		return demandePriorite;
	}
	public void setDemandePriorite(DemandePriorite demandePriorite) {
		this.demandePriorite = demandePriorite;
	}
}
