package com.hashedin.hu22.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hashedin.hu22.entities.Course;



@Repository
public interface CourseDao extends JpaRepository<Course, Long>{
	

	@Query(value="SELECT * FROM Course WHERE COURSE_CATEGORY = :ct", nativeQuery=true)
	List<Course> filterByCategory(@Param("ct") String category);
	
	@Query(value="SELECT * FROM Course ORDER BY COURSE_PRICE asc", nativeQuery=true)
	List<Course> filterByLowPrice();
	
	@Query(value="SELECT * FROM Course ORDER BY COURSE_PRICE desc", nativeQuery=true)
	List<Course> filterByHighPrice();

	@Query(value="SELECT * FROM Course WHERE COURSE_NAME = :cn", nativeQuery=true)
	List<Course> filterByCourseName(@Param("cn") String courseName);

	@Query(value="SELECT * FROM Course WHERE COURSE_DOMAIN = :cd", nativeQuery=true)
	List<Course> filterByCourseDomain(@Param("cd") String courseDomain);
	
}