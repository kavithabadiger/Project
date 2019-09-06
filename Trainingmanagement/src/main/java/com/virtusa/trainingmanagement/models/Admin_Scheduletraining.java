package com.virtusa.trainingmanagement.models;

import java.sql.Date;

public class Admin_Scheduletraining {
	private String trainingid;
	public String getTrainingid() {
		return trainingid;
	}
	public void setTrainingid(String trainingid) {
		this.trainingid = trainingid;
	}
	public String getTrainingtitle() {
		return trainingtitle;
	}
	public void setTrainingtitle(String trainingtitle) {
		this.trainingtitle = trainingtitle;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	private String trainingtitle;
	private String domain;
	private Date startdate;
	private Date enddate;
	private String venue;
	

}
