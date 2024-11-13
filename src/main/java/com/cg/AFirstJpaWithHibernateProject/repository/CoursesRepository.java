package com.cg.AFirstJpaWithHibernateProject.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.AFirstJpaWithHibernateProject.entity.Courses;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CoursesRepository {
	@Autowired
	EntityManager em;

	public Courses findById(Long id) {
		return em.find(Courses.class, id);
	}

	public void deleteById(Long id) {
		Courses course = findById(id);
		em.remove(course);
	}
}
