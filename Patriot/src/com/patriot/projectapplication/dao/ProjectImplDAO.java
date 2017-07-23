package com.patriot.projectapplication.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.patriot.projectapplication.dto.ProjectDTO;


@Component
@Repository
@Transactional


public class ProjectImplDAO implements IProjectDAO{

	
	@PersistenceContext
	private EntityManager manager;
	
	
		


	
	
		@Override
		public int addProjectDetails(ProjectDTO project)
				{
			// TODO Auto-generated method stub
			manager.persist(project);
			return 1;
		
		}







		@Override
		public ProjectDTO viewProjectDetails(int projectId) {
			// TODO Auto-generated method stub
			ProjectDTO project;
			project=manager.find(ProjectDTO.class, projectId);
			
			return project;
		}







		@Override
		public ProjectDTO updateProject(int projectId,
				Date expectedProjectCompletionDate) {
			// TODO Auto-generated method stub
			
		ProjectDTO project  ;
		int result=manager.createQuery("Update ProjectDTO set expectedProjectCompletionDate='"+expectedProjectCompletionDate+"'where projectId='"+projectId+"'").executeUpdate();
		project=manager.find(ProjectDTO.class, projectId);

			return project;
		}







		@Override
		public ArrayList<ProjectDTO> viewAllProjects() {
			// TODO Auto-generated method stub
			
			
			ArrayList<ProjectDTO> projectlist=(ArrayList<ProjectDTO>) manager.createQuery("select a from ProjectDTO a",ProjectDTO.class).getResultList();
			
			
			return projectlist;
		}
	
	}

