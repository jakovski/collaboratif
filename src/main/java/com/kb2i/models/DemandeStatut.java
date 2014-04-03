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
@Table(name="demandestatut")
public class DemandeStatut {

	@Id
	@GeneratedValue
	@Column(name="ID_STATUT")
	private int id_statutDemande;
	@Column(name="NOM_STATUT")
	private String nomstatut;
	@Column(name="DESCRIPTION")
	private String description;
	@OneToMany(mappedBy="demandeStatut")
	private Set<Demande> listdemande = new HashSet<Demande>();
	public int getId_statutDemande() {
		return id_statutDemande;
	}
	public void setId_statutDemande(int id_statutDemande) {
		this.id_statutDemande = id_statutDemande;
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
