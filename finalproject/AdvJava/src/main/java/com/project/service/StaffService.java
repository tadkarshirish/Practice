package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.dao.StaffDao;
import com.project.dao.StudentDao;
import com.project.entity.Requpdate;
import com.project.entity.Staff;
import com.project.entity.Student;

@Component
public class StaffService {

	@Autowired
	private StaffDao staffDao;
	
	public Staff login(String email, String password) {
		if(staffDao.isStaffPresent(email, password))
			return staffDao.fetch(email);
		else
			throw new StaffServiceException("Email/Password incorrect!");
	}

	
}
