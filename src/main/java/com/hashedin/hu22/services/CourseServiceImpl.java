package com.hashedin.hu22.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.hashedin.hu22.entities.Course;
import com.hashedin.hu22.exceptions.CourseNotExistsException;
import com.hashedin.hu22.repositories.CourseDao;



@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	CourseDao courseDao;

	@Override
	public List<Course> getCourses() {
		return this.courseDao.findAll();
	}

	@Override
	public Course addCourses(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course deleteCourse(long courseId) {
		Course c = null;
		courseDao.deleteById(courseId);;
//		courseDao.delete(entity);
		return c;
	}
	

	@Override
	public Course findById(long courseId) throws CourseNotExistsException {
		Optional<Course> optionalCourse= courseDao.findById(courseId);
		if(optionalCourse.isEmpty()) {
			throw new CourseNotExistsException("course id is invalid: " + courseId);
		}
		return optionalCourse.get();
	}


	@Override
	public List<Course> filterCategory(String category) {
		return courseDao.filterByCategory(category);
	}

	
	@Override
	public List<Course> filterCourse(String priceStatus) {
		
		if(priceStatus.equals("low")) 
			return courseDao.filterByLowPrice();
		else
			return courseDao.filterByHighPrice();
	}

	@Override
	public List<Course> filterCourseName(String courseName) {
		return courseDao.filterByCourseName(courseName);
	}

	@Override
	public List<Course> filterCourseDomain(String courseDomain) {
		return courseDao.filterByCourseDomain(courseDomain);
	}
	
	
}
