package com.Course.Management.CourseManagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
  private Integer courseId;
	@Column
 private String courseName;
	@Column
  private Integer duration;
	@Column
  private Double fee;
public Integer getCourseId() {
	return courseId;
}
public void setCourseId(Integer courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public Integer getDuration() {
	return duration;
}
public void setDuration(Integer duration) {
	this.duration = duration;
}
public Double getFee() {
	return fee;
}
public void setFee(Double fee) {
	this.fee = fee;
}
public Course() {
	super();
}
@Override
public String toString() {
	return "Student [courseid=" +courseId + ", coursename=" + courseName + ", duration=" + duration + ", fee="
			+ fee + "]";
}
  
}
