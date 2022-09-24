package com.hashedin.hu22.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hashedin.hu22.entities.Course;
import com.hashedin.hu22.services.CourseService;


@CrossOrigin("*")
@RestController
public class MyControllerCourse {

	@Autowired
	private CourseService courseService;
	
	
	//Get All Courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	
	
	//Get a particular course
	@GetMapping("/courses/{courseId}")
	public ResponseEntity<Course> getCourse(@PathVariable("courseId") String courseId) {
		try {
			Course course = courseService.findById(Long.parseLong(courseId));
			return ResponseEntity.of(Optional.of(course));
		}
		catch(Exception e){

			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
	}
	
	
	//Posting a course
	@PostMapping(value="/courses")
	public ResponseEntity<Course> addCourses(@RequestBody Course course) {
		Course c = null;
		try {
			c = courseService.addCourses(course);
			return ResponseEntity.status(HttpStatus.CREATED).body(course);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
//		return ResponseEntity.ok().body(this.courseService.addCourses(course));
	}
	
	
	//Deleting particular course
	 @DeleteMapping("/courses/{courseId}")
	 public Course deleteCourse(@PathVariable String courseId) {
	    return this.courseService.deleteCourse(Long.parseLong(courseId));
	//      return ResponseEntity.ok().body(this.courseService.deleteCourse(Long.parseLong(courseId)));
	 }
	 
	 
	 //filter by price low and price high
	 @GetMapping("/courses/filterPrice")
	 public List<Course> filterCourse(@RequestParam String priceStatus){
		
		 return this.courseService.filterCourse(priceStatus);
	 }
	 
	 
	 //filter by categories of courses
	 @GetMapping("/courses/filterCategory")
	 public List<Course> filterCategory(@RequestParam String category){
		 return this.courseService.filterCategory(category);
	 }
	 
	  
	 //filter by name of courses
	 @GetMapping("/courses/filterCourseName")
	 public List<Course> filterCourseName(@RequestParam String courseName){
		 return this.courseService.filterCourseName(courseName);
	 }
	 
	 
	 //filter by recommendation
	 @GetMapping("/courses/filterCourseDomain")
	 public List<Course> filterCourseDomain(@RequestParam String courseDomain){
		 return this.courseService.filterCourseDomain(courseDomain);
	 }
	
}
