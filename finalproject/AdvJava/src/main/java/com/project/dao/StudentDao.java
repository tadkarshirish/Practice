package com.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.project.entity.Requpdate;
import com.project.entity.Student;

@Component
public class StudentDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Transactional
	public void add(Student student) {
		entityManager.persist(student);
	}
	
	
	
	@Transactional
	public void add(Requpdate requpdate) {
		entityManager.persist(requpdate);
	}
	
	public boolean isStudentPresent(String email) {
		Query query = entityManager.createQuery("select count(c) from Student c where c.email = :em");
		query.setParameter("em", email);
		Long count = (Long) query.getSingleResult();
		if(count == 1)
			return true;
		return false;
	}
	
	public boolean isStudentPresent(String email, String password) {
		Query query = entityManager.createQuery("select count(c) from Student c where c.email = :em and c.password = :pw");
		query.setParameter("em", email);
		query.setParameter("pw", password);
		Long count = (Long) query.getSingleResult();
		if(count == 1)
			return true;
		return false;
	}

	public Student fetch(String email) {
		Query query = entityManager.createQuery("select c from Student c where c.email = :em");
		query.setParameter("em", email);
		Student student = (Student) query.getSingleResult();
		return student;
	}
	
	public List<Student> fetchAll(){
		return entityManager.createQuery("select c from Student c", Student.class).getResultList();
	}
	

	@Transactional
	public void Delete(int id) {
		Query query = (Query) entityManager.createQuery("select u from Student u where u.id = :id");
		query.setParameter("id", id);
			Student student = (Student)query.getSingleResult();
			entityManager.remove(student);
	
	}
	
	@Transactional
	public void UpdateSt(Student student) {
		System.out.print("dao");
		entityManager.merge(student);
		//Query query = (Query) entityManager.createQuery("select c from Student c where c.email=:em");
		//query.setParameter("em", student.getEmail());
		//Student st=(Student) query.getSingleResult();
		//st.setCourse(student.getCourse());
		//int id=student.getId();
		
	}

				
}
	

