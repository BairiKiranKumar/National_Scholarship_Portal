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
import com.lti.Portal.Services.StudentServices;
import com.lti.Portal.pojo.StudentLoginPojo;

@RestController
@RequestMapping("/NationalScolarshipPortal/Student")
@CrossOrigin("http://localhost:4200")
public class StudentController 
{
	public String EmailH="";
	@Autowired
	StudentServices student;
	@GetMapping("/allStudents")
	public List<StudentLoginPojo>getStudent()
	{
		return student.getStudents();
	}
	@PostMapping("/login")
	public boolean addStudent(@RequestBody StudentLoginPojo Student)
	{
		return student.addStudent(Student);
	}
	@GetMapping("/login")
	@ResponseBody
	public ResponseEntity validateLogin(@RequestParam("Email")String Email,@RequestParam("password")String password)
	{
		 EmailH=Email;
		boolean returnValue=student.validateLogin(Email,password);
		if(returnValue)
		return new ResponseEntity(HttpStatus.OK);
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
		//return student.validateLogin(Email,password);	
	}
}
