package com.kb2i.managed;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ProjectBean implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> selectedusers;
	private Map<String, String> users;
	private List<String> selectedroles;
	private String[] rolesmember;
	

	public ProjectBean(){
		
		users = new HashMap<String, String>();
		users.put("mohamed", "mohamed");
		users.put("jakob", "jakob");
		users.put("Rached", "Rached");
		
		rolesmember=new String[3];
		rolesmember[0]="Manager";
		rolesmember[1]="Developer";
		rolesmember[2]="Reporter";
	
	}

	public List<String> getSelectedroles() {
		return selectedroles;
	}

	public void setSelectedroles(List<String> selectedroles) {
		this.selectedroles = selectedroles;
	}


	public List<String> getSelectedusers() {
		return selectedusers;
	}

	public void setSelectedusers(List<String> selectedusers) {
		this.selectedusers = selectedusers;
	}

	public Map<String, String> getUsers() {
		return users;
	}

	public void setUsers(Map<String, String> users) {
		this.users = users;
	}
	
	public String[] getRolesmember() {

		return rolesmember;
	}

	public void setRolesmember(String[] rolesmember) {
		this.rolesmember = rolesmember;
	}
		
}
