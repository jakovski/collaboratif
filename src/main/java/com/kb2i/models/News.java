package com.kb2i.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="news")
public class News {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_NEWS")
	private int id_news;
	@Column(name="OBJET")
	private String objet;
	@Column(name="CORPS")
	private String corps;
	@Column(name="DATE_CREATION")
	private Date date_creation;
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumns({
	@JoinColumn(name="USER_ID",referencedColumnName="USER_ID"),
	@JoinColumn(name="PROJECT_ID",referencedColumnName="PROJECT_ID")})
	private Membre membre;	
/***********************************************************/	
	public int getId_news() {
		return this.id_news;
	}
	public void setId_news(int id_news) {
		this.id_news = id_news;
	}
	public String getObjet() {
		return this.objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}
	public String getCorps() {
		return this.corps;
	}
	public void setCorps(String corps) {
		this.corps = corps;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation() {
		Date date=new Date();
		this.date_creation = date;
	}
	public Membre getMembre() {
		return membre;
	}
	public void setMembre(Membre membre) {
		this.membre = membre;
	}

	
}	
