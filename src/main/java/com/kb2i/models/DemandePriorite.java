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
@Table(name="demandepriorite")
public class DemandePriorite {

	@Id
	@GeneratedValue
	@Column(name="ID_PRIORITE")
	private int id_prioriteDemande;
	@Column(name="NOM_PRIORITE")
	private String nompriorite;
	@Column(name="DESCRIPTION")
	private String description;
	@OneToMany(mappedBy="demandePriorite")
	private Set<Demande> listdemande = new HashSet<Demande>(); 	
/***************************************************************************/
	public int getId_prioriteDemande() {
		return id_prioriteDemande;
	}
	public void setId_prioriteDemande(int id_prioriteDemande) {
		this.id_prioriteDemande = id_prioriteDemande;
	}
	public String getNompriorite() {
		return nompriorite;
	}
	public void setNompriorite(String nompriorite) {
		this.nompriorite = nompriorite;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Demande> getListdemande() {
		return listdemande;
	}
	public void setListdemande(Set<Demande> listdemande) {
		this.listdemande = listdemande;
	}

}
