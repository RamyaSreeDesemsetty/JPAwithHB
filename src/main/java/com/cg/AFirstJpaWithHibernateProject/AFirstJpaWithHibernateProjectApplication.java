package com.cg.AFirstJpaWithHibernateProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.AFirstJpaWithHibernateProject.entity.Courses;
import com.cg.AFirstJpaWithHibernateProject.repository.CoursesRepository;

@SpringBootApplication
public class AFirstJpaWithHibernateProjectApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CoursesRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(AFirstJpaWithHibernateProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Courses course = repository.findById(101L);
		logger.info("Course ->" + course);

		repository.deleteById(103L);
	}

}
