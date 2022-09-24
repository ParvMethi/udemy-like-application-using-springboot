package com.hashedin.hu22.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private long userId;
	private String userName;
	private String userFName;
	private String userLName;
	private String userAbout;
	private String userType;
	private String userExperience;
	
	private String userRole;
	private String userDomain;
	
	public User(long userId, String userName, String userFName, String userLName, String userAbout, String userType,
			String userExperience,  String userRole, String userDomain) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userFName = userFName;
		this.userLName = userLName;
		this.userAbout = userAbout;
		this.userType = userType;
		this.userExperience = userExperience;
		
		this.userRole = userRole;
		this.userDomain = userDomain;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserFName() {
		return userFName;
	}

	public void setUserFName(String userFName) {
		this.userFName = userFName;
	}

	public String getUserLName() {
		return userLName;
	}

	public void setUserLName(String userLName) {
		this.userLName = userLName;
	}

	public String getUserAbout() {
		return userAbout;
	}

	public void setUserAbout(String userAbout) {
		this.userAbout = userAbout;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserExperience() {
		return userExperience;
	}

	public void setUserExperience(String userExperience) {
		this.userExperience = userExperience;
	}

	

	

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserDomain() {
		return userDomain;
	}

	public void setUserDomain(String userDomain) {
		this.userDomain = userDomain;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userFName=" + userFName + ", userLName="
				+ userLName + ", userAbout=" + userAbout + ", userType=" + userType + ", userExperience="
				+ userExperience + ", userRole=" + userRole + ", userDomain=" + userDomain + "]";
	}
	
	
	
}
