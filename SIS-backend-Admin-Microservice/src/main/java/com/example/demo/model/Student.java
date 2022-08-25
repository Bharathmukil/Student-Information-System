package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "First_name")
	private String first_name;
	
	@Column(name = "Last_name")
	private String last_name;
	
	@Column(name = "Class")
	private int cls;
	
	@Column(name = "PhNo")
	private long phNo;
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "Age")
	private int age;	
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "Email")
	private String email;
	
	
	public Student() {
		
	}

	public Student(String first_name, String last_name, int cls, String gender, int age, String address,
			String email, long phNo) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.cls = cls;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.email = email;
		this.phNo = phNo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public int getCls() {
		return cls;
	}


	public void setCls(int cls) {
		this.cls = cls;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	
	
	
	
}
