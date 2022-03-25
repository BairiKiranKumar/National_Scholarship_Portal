package com.lti.Portal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.lti.Portal.Services.AdminLoginService;
import com.lti.Portal.pojo.AdminLoginPojo;

@RestController
@RequestMapping("/NationalSchlarshipPortal/Admin")
@CrossOrigin("http://localhost:4200")
public class AdminLoginController 
{
	@Autowired
	AdminLoginService Adm;
	
	@PostMapping("/Adminlogin")
	public boolean addAdmin(AdminLoginPojo Admin) 
	{
		// TODO Auto-generated method stub
		return Adm.addAdmin(Admin);
	}
    @GetMapping("/AllAdmins")
	public List<AdminLoginPojo> getAdmin() 
	{
		// TODO Auto-generated method stub
		return Adm.getAdmins();
	}
	@GetMapping("/Adminlogin")
	@ResponseBody
	public ResponseEntity validateLogin(@RequestParam("admin")String Email,@RequestParam("password")String password)
	{
		boolean returnValue=Adm.validateLogin(Email,password);
		if(returnValue)
		return new ResponseEntity(HttpStatus.OK);
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
		//return student.validateLogin(Email,password);	
	}
}
