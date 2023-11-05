package com.ex.CourseCatalog.Beans;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity//used to create a entity...
public class Catalog {
	@Id
	int courseId;
	String courseName;
	@Transient
	List<Rating> rating;
	@Transient
	List<Enrolled> enrolled;
	
	public List<Rating> getRating() {
		return rating;
	}
	public void setRating(List<Rating> rating) {
		this.rating = rating;
	}
	public List<Enrolled> getEnrolled() {
		return enrolled;
	}
	public void setEnrolled(List<Enrolled> enrolled) {
		this.enrolled = enrolled;
	}
	
	public Catalog(int courseId, String courseName, List<Rating> rating, List<Enrolled> enrolled) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.rating = rating;
		this.enrolled = enrolled;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Catalog() {
		super();
	}
	

}
