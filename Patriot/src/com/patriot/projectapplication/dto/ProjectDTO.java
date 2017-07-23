package com.patriot.projectapplication.dto;




import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Component
@Entity

public class ProjectDTO {

	
	@Id
	private int projectId;
	
	private String projectName; 
	private String clientName;
	private Date commensementDate;
	private Date expectedProjectCompletionDate;
	private Date actualProjectCompletionDate=null;
	private int numberOfTeammembers;
	private String statusOfproject;
		public ProjectDTO() {
		super();
	}
		public int getProjectId() {
			return projectId;
		}
		public void setProjectId(int projectId) {
			this.projectId = projectId;
		}
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public String getClientName() {
			return clientName;
		}
		public void setClientName(String clientName) {
			this.clientName = clientName;
		}
		public Date getCommensementDate() {
			return commensementDate;
		}
		public void setCommensementDate(Date commensementDate) {
			this.commensementDate = commensementDate;
		}
		public Date getExpectedProjectCompletionDate() {
			return expectedProjectCompletionDate;
		}
		public void setExpectedProjectCompletionDate(Date expectedProjectCompletionDate) {
			this.expectedProjectCompletionDate = expectedProjectCompletionDate;
		}
		public Date getActualProjectCompletionDate() {
			return actualProjectCompletionDate;
		}
		public void setActualProjectCompletionDate(Date actualProjectCompletionDate) {
			this.actualProjectCompletionDate = actualProjectCompletionDate;
		}
		public int getNumberOfTeammembers() {
			return numberOfTeammembers;
		}
		public void setNumberOfTeammembers(int numberOfTeammembers) {
			this.numberOfTeammembers = numberOfTeammembers;
		}
		public String getStatusOfproject() {
			return statusOfproject;
		}
		public void setStatusOfproject(String statusOfproject) {
			this.statusOfproject = statusOfproject;
		}
	
	
	
	
	
	
}
