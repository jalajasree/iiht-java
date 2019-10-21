package com.Course.Management.CourseManagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String userName;
	@Column
	private String password;

  //private Course course;
	
  public Admin() 
  {
	  super();
  }

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

	/*
	 * public Course getCourse() { return course; }
	 * 
	 * public void setCourse(Course course) { this.course = course; }
	 */
@Override
public String toString() {
	return "Student [password="
			+ password + ",user Name="+userName+"]";
}
}
