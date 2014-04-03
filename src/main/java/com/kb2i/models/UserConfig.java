package com.kb2i.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userconfig")
public class UserConfig {
	
	@Id
	@GeneratedValue
	@Column(name="ID_USERCONFIG")
	private int id_userconfig;
	@Column(name="STATUT")
	private boolean statut;
	@Column(name="LANGUE")
	private String langue;
	
	public int getIduserconfig() {
		return id_userconfig;
	}
	public void setIduserconfig(int id_userconfig) {
		this.id_userconfig = id_userconfig;
	}
	public boolean isStatut() {
		return statut;
	}
	public void setStatut(boolean statut) {
		this.statut = statut;
	}
	public String getLangue() {
		return langue;
	}
	public void setLangue(String langue) {
		this.langue = langue;
	}
}
