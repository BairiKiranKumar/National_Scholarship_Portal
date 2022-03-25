package com.lti.Portal.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.lti.Portal.Services.InstitutionLoginService;
import com.lti.Portal.pojo.InstitutionLogin;
@RestController
@RequestMapping("//NationalSchlarshipPortal/Institution")
@CrossOrigin("http://localhost:4200")
public class InstitutionLoginController
{
	@Autowired
	InstitutionLoginService instlogin;
	
	@GetMapping("/AllInstitutionLogin")
	public List<InstitutionLogin>getInstitutionLogin()
	{
		return instlogin.getInstitutionLogins();
	}
	@PostMapping("/InstitutionLogin")
	public boolean addInstitutionLogin(@RequestBody InstitutionLogin institutionlogin)
	{
		return instlogin.addInstitutionLogin(institutionlogin);	
	}
	@GetMapping("/InstitutionLogin")
	@ResponseBody
	public ResponseEntity validateLogin(@RequestParam("loginid")String loginid,@RequestParam("password")String password)
	{
		boolean returnValue=instlogin.validateLogin(loginid,password);
		if(returnValue)
		return new ResponseEntity(HttpStatus.OK);
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
		//return student.validateLogin(Email,password);	
	}	
}

