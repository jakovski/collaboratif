package com.kb2i.dao;

import java.util.List;

import com.kb2i.models.Project;
import com.kb2i.models.User;

public interface ProjectDao {
	
	void save(Project project);
	Project getprojectByid(int id);
	List<User> listemembres(int idprojet);	
}
