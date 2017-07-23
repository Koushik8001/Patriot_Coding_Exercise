package com.patriot.projectapplication.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.patriot.projectapplication.dto.ProjectDTO;
import com.patriot.projectapplication.service.ProjectImplService;




@Controller
@Component
public class ProjectManagementController {
	@Autowired
	ProjectImplService projectservice;
	
	//Add
	@RequestMapping(value="getEmployeeRegister")
	String addEmployeeDetailsPage(){
		
		return "addProject";
		
	}
	
	
	
	@RequestMapping(value="Register")
	ModelAndView addProject(@ModelAttribute("project")ProjectDTO prj,BindingResult result) 
	
	{
		ModelAndView model= new ModelAndView();
		//model.setViewName("emp");
		System.out.println(prj.getExpectedProjectCompletionDate());
		int addresult= projectservice.addProjectDetails(prj);
		model.setViewName("Sucess");
		
		
		return model;

	}
	
	
	
	
	//View
	
	@RequestMapping(value="View")
	public String viewProject(){
		
		return "ViewProject";
	}
	
	
	@RequestMapping(value="viewProject")
	ModelAndView getView(@RequestParam("ProjectId")int projectId)
	{
		ProjectDTO p=projectservice.viewProjectDetails(projectId);
		ModelAndView model=new ModelAndView();
		model.setViewName("ViewSucess");
		model.getModelMap().addAttribute("project",p);
		return model;
			
	}
	
	
	
	
	//ViewAll
	
	
	
	@RequestMapping(value="ViewAllProjects")
	public String viewAllProjects(){
		
		return "ViewAllProjects";
	}
	
	@RequestMapping(value="viewAllProjects")
	ModelAndView getViewAll()
	{
		
		ArrayList<ProjectDTO> projectList= new ArrayList<ProjectDTO>();
		 projectList=projectservice.viewAllProjects();
		ModelAndView model=new ModelAndView();
		model.setViewName("ViewAllSucess");
		model.getModelMap().addAttribute("projectList",projectList);
		return model;
			
	}
	
	
	
	
	
	
	
	
//Update
	
	@RequestMapping(value="Update")
	public String updateProject(){
		
		return "UpdateProject";
		
	}
	
	@RequestMapping(value="update")
	ModelAndView getUpdate(@RequestParam("ProjectId")int projectId,@RequestParam("expectedProjectCompletionDate")Date expectedProjectCompletionDate) {
		
	ProjectDTO pr= projectservice.updateProject(projectId,expectedProjectCompletionDate);
	ModelAndView model=new ModelAndView();
	model.setViewName("UpdateSucess");
	model.getModelMap().addAttribute(pr);
	return model;
	}

	
	
	
	
	
	
	

	
	
}
