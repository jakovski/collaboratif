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
@Table(name="demandeType")
public class DemandeType {
	
	@Id
	@GeneratedValue
	@Column(name="ID_TYPE")
	private int id_typeDemande;
	@Column(name="NOM_TYPE")
	private String nomtype;
	@Column(name="DESCRIPTION")
	private String description;
	@OneToMany(mappedBy="demandeType")
	private Set<Demande> listdemande = new HashSet<Demande>(); 

/*****************************************************************************/	
	public int getId_typeDemande() {
		return id_typeDemande;
	}
	public void setId_typeDemande(int id_typeDemande) {
		this.id_typeDemande = id_typeDemande;
	}
	public String getNomtype() {
		return nomtype;
	}
	public void setNomtype(String nomtype) {
		this.nomtype = nomtype;
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
