package com.lti.Portal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.Portal.Services.InstituteHomeService;
import com.lti.Portal.pojo.InstituteHomePojo;

@RestController
@RequestMapping("/NationalScolarshipPortal/InstituteHome")
@CrossOrigin("http://localhost:4200")
public class InstituteHomeController 
{
	@Autowired
	InstituteHomeService institute;
	@PostMapping("/InstituteHome")
	public boolean addInstituteHome(InstituteHomePojo Institute) {
		// TODO Auto-generated method stub
		return institute.addInstituteHome(Institute);
	}

	@GetMapping("/AllInstituteHome")
	public List<InstituteHomePojo> InstituteHomes() 
	{
		// TODO Auto-generated method stub
		return institute.InstituteHomes();
	}
	@GetMapping("/InstituteHome/{institution}")
	public InstituteHomePojo validateUser(@PathVariable("institution") String Institution)
	{
		// TODO Auto-generated method stub
		return institute.validateUser(Institution);
	}
	
}
