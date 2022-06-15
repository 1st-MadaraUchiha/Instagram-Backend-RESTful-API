package com.instagramproject.Model;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Status {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int statusId;
	private int userId;
	private String path;
	@Transient
	private String userName;
	private Timestamp timeStamp;
	
	public Status(int statusId, int userId, String path, String userName, Timestamp timeStamp) {
		super();
		this.statusId = statusId;
		this.userId = userId;
		this.path = path;
		this.userName = userName;
		this.timeStamp = timeStamp;
	}
	
	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Timestamp getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}
}
