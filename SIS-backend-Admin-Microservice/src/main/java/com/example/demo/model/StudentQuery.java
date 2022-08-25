package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "Query")
public class StudentQuery {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "StudId")
	private int studId;
	
	@Column(name = "StudName")
	private String studName;
	
	@Column(name = "Title")
	private String title;
	
	@Column(name = "Description")
	private String desc;
	
	@Column(name = "Response")
	private String response;
	
	@Column(name = "isResponded")
	private boolean isResponded;
	
	public StudentQuery() {
		
	}

	public StudentQuery(int studId, String studName, String title, String desc, String response, boolean isResponded) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.title = title;
		this.desc = desc;
		this.response = response;
		this.isResponded = isResponded;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public boolean isResponded() {
		return isResponded;
	}

	public void setResponded(boolean isResponded) {
		this.isResponded = isResponded;
	}
	
}
