package com.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.project.entity.Requpdate;
import com.project.entity.Student;

@Component
public class RequpdateDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Requpdate> fetchAll(){
		return entityManager.createQuery("select c from Requpdate c", Requpdate.class).getResultList();
	}
	
}
