package com.sushma.secondpro.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table
@Entity
@Component
public class Job {
	@Id
	private String jobid;
	public String getJobid() {
		return jobid;
	}
	public void setJobid(String jobid) {
		this.jobid = jobid;
	}
	private String companyName;
	private String designation;
	private String salary;
	private String requirement;
	private String eventdate;
	private String announcementdate;
	private String lastDatetoApply;
	public String getAnnouncementdate() {
		return announcementdate;
	}
	public void setAnnouncementdate(String announcementdate) {
		this.announcementdate = announcementdate;
	}
	public String getLastDatetoApply() {
		return lastDatetoApply;
	}
	public void setLastDatetoApply(String lastDatetoApply) {
		this.lastDatetoApply = lastDatetoApply;
	}
	public String getEventdate() {
		return eventdate;
	}
	public void setEventdate(String eventdate) {
		this.eventdate = eventdate;
	}
	private String interviewprocess;
	private String joininglocation;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getRequirement() {
		return requirement;
	}
	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}
	public String getInterviewprocess() {
		return interviewprocess;
	}
	public void setInterviewprocess(String interviewprocess) {
		this.interviewprocess = interviewprocess;
	}
	public String getJoininglocation() {
		return joininglocation;
	}
	public void setJoininglocation(String joininglocation) {
		this.joininglocation = joininglocation;
	}
	
	

}
