/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.beans;

/**
 *
 * @author zhangqian
 */
public class taskBean {
	private int taskId;
    private int userId;
	private String paperName;
	private String paperDescription;
	private String paperRequirement;
	private int domain;
	private String paperDeadline;

    public taskBean(int userId, String paperName, String paperDeadline, String paperDescription, String paperRequirement, int domain) {
        this.paperName = paperName;
        this.paperDescription = paperDescription;
        this.paperRequirement = paperRequirement;
        this.domain = domain;
        this.paperDeadline = paperDeadline;
    }

    public taskBean() {
    }
    

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

     public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public String getPaperDescription() {
        return paperDescription;
    }

    public void setPaperDescription(String paperDescription) {
        this.paperDescription = paperDescription;
    }

    public String getPaperRequirement() {
        return paperRequirement;
    }

    public void setPaperRequirement(String paperRequirement) {
        this.paperRequirement = paperRequirement;
    }

    public int getDomain() {
        return domain;
    }

    public void setDomain(int domain) {
        this.domain = domain;
    }

    public String getPaperDeadline() {
        return paperDeadline;
    }

    public void setPaperDeadline(String paperDeadline) {
        this.paperDeadline = paperDeadline;
    }
	
    
}
