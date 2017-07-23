package com.patriot.projectapplication.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.patriot.projectapplication.dto.ProjectDTO;
@Service
public interface IProjectService {

	public int addProjectDetails(ProjectDTO project) ;
	public ProjectDTO viewProjectDetails(int projectId);
	public ProjectDTO updateProject(int projectId,Date expectedProjectCompletionDate);
	public ArrayList<ProjectDTO> viewAllProjects();
	
	
}
