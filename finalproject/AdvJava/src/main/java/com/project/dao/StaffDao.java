package com.project.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.project.entity.Requpdate;
import com.project.entity.Staff;
import com.project.entity.Student;

@Component
public class StaffDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void add(Staff staff) {
		entityManager.persist(staff);
	}
	
	public boolean isStaffPresent(String email, String password) {
		Query query = entityManager.createQuery("select count(c) from Staff c where c.email = :em and c.password = :pw");
		query.setParameter("em", email);
		query.setParameter("pw", password);
		Long count = (Long) query.getSingleResult();
		if(count == 1)
			return true;
		return false;
	}
	
	public Staff fetch(String email) {
		Query query = entityManager.createQuery("select c from Staff c where c.email = :em");
		query.setParameter("em", email);
		Staff staff = (Staff) query.getSingleResult();
		return staff;
	}
}
