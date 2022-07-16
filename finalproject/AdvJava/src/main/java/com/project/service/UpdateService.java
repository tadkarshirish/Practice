package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.dao.RequpdateDao;
import com.project.entity.Requpdate;
import com.project.entity.Student;

@Component
public class UpdateService {
	
	@Autowired
	private RequpdateDao requpdateDao;
	
	public List<Requpdate> Requested() {
		return requpdateDao.fetchAll();
	}
	
}
