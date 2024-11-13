package com.cg.AFirstJpaWithHibernateProject.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.AFirstJpaWithHibernateProject.AFirstJpaWithHibernateProjectApplication;
import com.cg.AFirstJpaWithHibernateProject.entity.Courses;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AFirstJpaWithHibernateProjectApplication.class)

public class CourseRepositoryTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	CoursesRepository repository;

	@Test
	public void contextLoads() {
		Courses course = repository.findById(100L);
		assertEquals("JPA", course.getName());
		logger.info("Test is Running");
	}
}
