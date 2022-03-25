package com.lti.Portal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.Portal.Services.StudentRegistrationService;
import com.lti.Portal.pojo.StudentRegistrationPojo;

@RestController
@RequestMapping("/NationalSchlarshipPortal/Student")
@CrossOrigin("http://localhost:4200")
public class StudentRegistrationController 
{
	@Autowired
	StudentRegistrationService student;
	
	@GetMapping("/AllStudentRegistration")
	public List<StudentRegistrationPojo>getStudentregistration()
	{
		return student.getStudentregistrations();
	}
	@PostMapping("/StudentRegistration")
	public boolean addStudentregistration(@RequestBody StudentRegistrationPojo Student)
	{
		return student.addStudentregistration(Student);
	}
}
