package com.instagramproject.Model;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int postId;
	private int userId;
	private String post;
	private Timestamp timeStamp;
	@Transient
	private String userName;
	private String path;
	private int likeCounts;
	
	public Post(int postId, int userId, String post, Timestamp timeStamp, String userName, String path,
			int likeCounts) {
		super();
		this.postId = postId;
		this.userId = userId;
		this.post = post;
		this.timeStamp = timeStamp;
		this.userName = userName;
		this.path = path;
		this.likeCounts = likeCounts;
	}
	public Post() {
		// TODO Auto-generated constructor stub
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public Timestamp getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public int getLikeCounts() {
		return likeCounts;
	}
	public void setLikeCounts(int likeCounts) {
		this.likeCounts = likeCounts;
	}
	
	
}
