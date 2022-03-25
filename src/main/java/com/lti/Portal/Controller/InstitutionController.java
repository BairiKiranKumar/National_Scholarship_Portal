package com.lti.Portal.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.Portal.Services.InstitutionRegistrationService;
import com.lti.Portal.pojo.InstitutionRegistration;
@RestController
@RequestMapping("/NationalSchlarshipPortal/Institution")
@CrossOrigin("http://localhost:4200")
public class InstitutionController 
{
	@Autowired
	InstitutionRegistrationService iService;
	
	@GetMapping("/AllInstitutionRegistration")
	public List<InstitutionRegistration> getInstitutions()
	{
		return iService.getInstitutions();
	}
	@PostMapping("/InstitutionRegistration")
	public boolean addInstitution(@RequestBody InstitutionRegistration institution) 
	{
		return iService.addInstitution(institution);
		
	}
}
