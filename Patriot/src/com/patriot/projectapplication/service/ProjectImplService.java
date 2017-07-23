package com.patriot.projectapplication.service;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.patriot.projectapplication.dao.IProjectDAO;
import com.patriot.projectapplication.dao.ProjectImplDAO;
import com.patriot.projectapplication.dto.ProjectDTO;

@Service
@Component
public class ProjectImplService implements IProjectService{
	
	
	
	@Autowired
	private IProjectDAO empdao;
	















	public IProjectDAO getEmpdao() {
		return empdao;
	}
















	public void setEmpdao(IProjectDAO empdao) {
		this.empdao = empdao;
	}
















	@Override
	public int addProjectDetails(ProjectDTO project) {
		// TODO Auto-generated method stub
		int result=empdao.addProjectDetails(project);
		return  result;
	}
















	@Override
	public ProjectDTO viewProjectDetails(int projectId) {
		// TODO Auto-generated method stub
		
		ProjectDTO result=empdao.viewProjectDetails(projectId);
		return result;
	}
















	@Override
	public ProjectDTO updateProject(int projectId, Date expectedProjectCompletionDate) {
		// TODO Auto-generated method stub
		
		ProjectDTO result= empdao.updateProject(projectId, expectedProjectCompletionDate);
		
		return result;
	}
















	@Override
	public ArrayList<ProjectDTO> viewAllProjects() {
		// TODO Auto-generated method stub
		
		ArrayList<ProjectDTO> result=empdao.viewAllProjects();
		return result;
		
	}
	
	




	
	
	

}
