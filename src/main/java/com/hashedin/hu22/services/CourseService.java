package com.hashedin.hu22.services;

import java.util.List;

import com.hashedin.hu22.entities.Course;



public interface CourseService {
	public List<Course>getCourses();

	public Course addCourses(Course course);

	public Course deleteCourse(long courseId);

	public Course findById(long courseId);

	public List<Course> filterCourse(String priceStatus);

	public List<Course> filterCategory(String category);

	public List<Course> filterCourseName(String courseName);

	public List<Course> filterCourseDomain(String courseDomain);


}
