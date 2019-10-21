package com.Course.Management.CourseManagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
  private Integer studentId;
	@Column
  private String studentName;
	@Column
  private String email;
	@Column
  private String mobile;
	@Column
  private String userName;
	@Column
  private String password;
public Integer getStudentId() {
	return studentId;
}
public void setStudentId(Integer studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
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
public Student() {
	super();
}
@Override
public String toString() {
	return "Student [sid=" +studentId + ", sname=" + studentName + ", email=" + email + ", mobile=" + mobile + ", password="
			+ password + ",user Name="+userName+"]";
}
}
