package com.patriot.projectapplication.dao;

import java.util.ArrayList;
import java.util.Date;

import com.patriot.projectapplication.dto.ProjectDTO;
public interface IProjectDAO {

	public int addProjectDetails(ProjectDTO project) ;
	public ProjectDTO viewProjectDetails(int projectId);
	public ProjectDTO updateProject(int projectId,Date expectedProjectCompletionDate);
	public ArrayList<ProjectDTO> viewAllProjects();
	
}
