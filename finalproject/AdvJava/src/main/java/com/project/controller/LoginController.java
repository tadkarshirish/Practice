package com.project.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.dao.StudentDao;
import com.project.entity.Requpdate;
import com.project.entity.Staff;
import com.project.entity.Student;
import com.project.service.StaffService;
import com.project.service.StudentService;
import com.project.service.StudentServiceException;
import com.project.service.UpdateService;

@Controller
public class LoginController {

	@Autowired
	private StudentService studentService;
	@Autowired
	private StaffService staffService;
	@Autowired
	private UpdateService updateService;
	
	@Autowired
	private StudentDao studentdao;
	
	@RequestMapping("/StudentList.cdac")
	public String registeredCustomers(Map<String,Object> model) {
		List<Student> list = studentService.registeredCustomers();
		for(Student st :list)
			System.out.println(st.getName());
		model.put("listOfStudent", list);		
		return "list.jsp";
	}
	
	@RequestMapping("/Deletlist.cdac")
	public String DeleteStudent(HttpServletRequest request,Map<String,Object> model) {
		int id = Integer.parseInt(request.getParameter("id"));
		
		studentService.deletid(id);
		List<Student> list = studentService.registeredCustomers();
		for(Student st :list)
			System.out.println(st.getName());
		model.put("listOfStudent", list);		
		return "list.jsp";
	}
	
	
	@RequestMapping("/UpdationList.cdac")  // to access list
	public String Requested(Map<String,Object> model) {
		List<Requpdate> list = updateService.Requested();
		for(Requpdate st :list)
			System.out.println(st.getRollno());
		model.put("listOfStudent", list);		
		return "updaterequest.jsp";
	}
	
	
	@RequestMapping("/slogin.cdac")
	public String login(HttpServletRequest request, HttpSession session, Map model) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		session.setAttribute("email", email);
		
		try {
			Student student  = studentService.login(email, password);
			model.put("studentData", student);
			session.setAttribute("student", student);
			
			return "StudentHome.jsp";
		}
		catch(StudentServiceException e) {
			model.put("message", e.getMessage());
			return "Studentlogin.jsp";
		}
	}

	@RequestMapping("/stafflogin.cdac")
	public String stafflogin(HttpServletRequest request, HttpSession session, Map model) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		session.setAttribute("email", email);
		
		try {
			Staff staff  = staffService.login(email, password);
			model.put("staffData", staff);
			return "StaffHome.jsp";
		}
		
		
		catch(StudentServiceException e) {
			model.put("message", e.getMessage());
			return "Student.jsp";
		}
	}
	
	
	
	@RequestMapping("/register.cdac")
	public String register(HttpServletRequest request) throws ParseException
	{
	 Student student = new Student();

	 student.setName(request.getParameter("Fullname"));
	 student.setEmail(request.getParameter("email"));
	 student.setMobileNumber(request.getParameter("mobileNumber"));
	 student.setPassword(request.getParameter("password"));
	 student.setPincode(request.getParameter("pincode"));
	 student.setBirthday(request.getParameter("Birthday"));
	 student.setCourse(request.getParameter("course"));
	 student.setAddmissionDate(java.time.LocalDate.now());
	
		try {
			studentService.register(student);
			return "Studentlogin.jsp";
		}
		catch(StudentServiceException e) {
			
			return "register.jsp";
		}
		
		
	}
	
	
	@RequestMapping("/Requpdate.cdac")
	public String requpdate(HttpServletRequest request,HttpSession session) throws ParseException
	{
	
	Student student =(Student) session.getAttribute("student");
	
	int roll=Integer.parseInt(request.getParameter("rollno"));
	String value=request.getParameter("UpdateValue");
	String cat = request.getParameter("UpdateSection");
	
	
	if(cat.equals("Course")) {
	student.setCourse(value);
	studentdao.UpdateSt(student);

		try {
			return "StudentHome.jsp";
			}
		catch(StudentServiceException e) {
			
			return "StudentHome.jsp";
			}
		}
	else if(cat.equals("Email")) {
			student.setEmail(value);
			studentdao.UpdateSt(student);
		
		try {
			return "StudentHome.jsp";
			}
		catch(StudentServiceException e) {
			return "StudentHome.jsp";
			}
	}
	
	else if(cat.equals("Mobileno")) {
		student.setMobileNumber(value);
		studentdao.UpdateSt(student);
		
		try {	
			return "StudentHome.jsp";
			}
		catch(StudentServiceException e) {	
			return "StudentHome.jsp";
		}
	}
	return "StudentHome.jsp";
		
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("email");
		return "login.jsp";
	}


}
