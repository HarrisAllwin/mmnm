package com.wipro.ips.service;

import com.wipro.ips.entity.Applicant;

public class ProfileEvaluator {
	private int JobId;
	private String JobName;;
	private String requiredSkill;
	private int expMinExperience;
	private int expMaxExperience;

	public int getJobId() {
		return JobId;
	}

	public void setJobId(int jobId) {
		JobId = jobId;
	}

	public String getJobName() {
		return JobName;
	}

	public void setJobName(String jobName) {
		JobName = jobName;
	}

	public String getRequiredSkill() {
		return requiredSkill;
	}

	public void setRequiredSkill(String requiredSkill) {
		this.requiredSkill = requiredSkill;
	}

	public int getExpMinExperience() {
		return expMinExperience;
	}

	public void setExpMinExperience(int expMinExperience) {
		this.expMinExperience = expMinExperience;
	}

	public int getExpMaxExperience() {
		return expMaxExperience;
	}

	public void setExpMaxExperience(int expMaxExperience) {
		this.expMaxExperience = expMaxExperience;
	}

public Applicant createObject(char referralType, int applicantId, String applicantName, 
		int yrsOfExp, String skills, double expSalary,String referralInfo){
	
	super()
}
}
