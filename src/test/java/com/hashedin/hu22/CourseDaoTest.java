//package com.hashedin.hu22;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.hashedin.hu22.entities.Course;
//import com.hashedin.hu22.repositories.CourseDao;
//
//import antlr.collections.List;
//
//public class CourseDaoTest {
//	
//	
//	@Autowired
//	private CourseDao courseDao;
//	@Test
//	void filterByCategory() {
//		Course course = new Course(10, 100, "Java", "Dev", "Parv", "", 4);
//		courseDao.save(course);
//		
//		List<Course> actualResult = courseDao.filterByCategory("Dev");
//		
//		assertThat(actualResult)
//	}
//	
//}
