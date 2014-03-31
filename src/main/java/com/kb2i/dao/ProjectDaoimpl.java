package com.kb2i.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kb2i.models.Project;
import com.kb2i.models.User;

@Repository
public class ProjectDaoimpl implements ProjectDao,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SessionFactory sessionFactory;
	
	@Autowired
	private Project project;
	
	
	@Autowired
	public ProjectDaoimpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	
	public Session currentseSession(){
		return  this.sessionFactory.getCurrentSession();
	}
	
	public Project getProject() {
		return project;
	}


	public void setProject(Project project) {
		this.project = project;
	}


	@Transactional
	public void save(Project project) {
		currentseSession().save(project);
	}
	
	@Transactional
	public Project getprojectByid(int id) {
		
		return this.project=(Project) currentseSession().get(Project.class,id);
	}
	
	@Transactional 
	public List<User> listemembres(int idprojet) {
		
		return null;
	}

	

}
