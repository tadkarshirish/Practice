package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.dao.StudentDao;
import com.project.entity.Requpdate;
import com.project.entity.Student;

@Component
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	public void register(Student student) {
		if(studentDao.isStudentPresent(student.getEmail()))
			throw new StudentServiceException("Student already registered!");
		else
			studentDao.add(student);
			//sendConfirmationMail(customer);
	}
	
	public Student login(String email, String password) {
		if(studentDao.isStudentPresent(email, password))
			return studentDao.fetch(email);
		else
			throw new StudentServiceException("Email/Password incorrect!");
	}

	public void Requpdate(Requpdate requpdate) {
			studentDao.add(requpdate);
			 
	}
	
	public List<Student> adminLogin() {
			return studentDao.fetchAll();
	}
	
	public List<Student> registeredCustomers() {
		return studentDao.fetchAll();
	}
	
	public void deletid(int id)
	{
		studentDao.Delete(id);
	}
	
//	public void updateT(int Rollno , String Course) {
//		System.out.print("service");
//		studentDao.UpdateVal(Rollno,Course);
//		
//}
	
//	public void updateT(int Rollno , String Course) {
//		System.out.print("service");
//	studentDao.UpdateSt(student);
		
}
	
	

