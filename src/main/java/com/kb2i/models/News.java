package com.kb2i.models;

import java.util.Date;

public class News {
	
	private int id_news;
	private String objet;
	private String corps;
	private Date date_creation;
	//private User creepar;
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
	
}	
