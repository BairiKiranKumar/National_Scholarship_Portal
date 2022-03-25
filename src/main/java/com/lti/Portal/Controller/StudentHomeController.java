package com.lti.Portal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.Portal.Services.StudentHomeService;
import com.lti.Portal.pojo.StudentHome;

@RestController
@RequestMapping("/NationalScolarshipPortal/Home")
@CrossOrigin("http://localhost:4200")
public class StudentHomeController 
{
	@Autowired
	StudentHomeService student;
	@PostMapping("/StudentHome")
	public boolean addStudentHome(@RequestBody StudentHome Student) {
		// TODO Auto-generated method stub
		return student.addStudentHome(Student);
	}
	@GetMapping("/AllStudentHome")
	public List<StudentHome> getStudentHome() {
		// TODO Auto-generated method stub
		return student.getStudentHomes();
	}
	@GetMapping("/StudentHome/{Email}")
	public StudentHome validateUser(@PathVariable("Email")String Email)
	{
		
		return student.validateUser(Email);
		//return student.validateLogin(Email);	
	}
}
