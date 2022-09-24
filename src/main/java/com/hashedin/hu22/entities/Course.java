package com.hashedin.hu22.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	

	@Id
	private long courseId;
	private long coursePrice;
	private String courseName;
	private String courseCategory;
	private String courseAuthor;
	private String courseDomain;
//	private List<String> courseReviews;
	private int courseRating;
	
	public Course(long courseId, long coursePrice, String courseName, String courseCategory, String courseAuthor,
			String courseDomain,  int courseRating) {
		super();
		this.courseId = courseId;
		this.coursePrice = coursePrice;
		this.courseName = courseName;
		this.courseCategory = courseCategory;
		this.courseAuthor = courseAuthor;
		this.courseDomain = courseDomain;
		
		this.courseRating = courseRating;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public long getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(long coursePrice) {
		this.coursePrice = coursePrice;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCategory() {
		return courseCategory;
	}

	public void setCourseCategory(String courseCategory) {
		this.courseCategory = courseCategory;
	}

	public String getCourseAuthor() {
		return courseAuthor;
	}

	public void setCourseAuthor(String courseAuthor) {
		this.courseAuthor = courseAuthor;
	}

	public String getCourseDomain() {
		return courseDomain;
	}

	public void setCourseDomain(String courseDomain) {
		this.courseDomain = courseDomain;
	}

	

	public int getCourseRating() {
		return courseRating;
	}

	public void setCourseRating(int courseRating) {
		this.courseRating = courseRating;
	}
	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", coursePrice=" + coursePrice + ", courseName=" + courseName
				+ ", courseCategory=" + courseCategory + ", courseAuthor=" + courseAuthor + ", courseDomain="
				+ courseDomain + ", courseRating=" + courseRating + "]";
	}
	
	
}

