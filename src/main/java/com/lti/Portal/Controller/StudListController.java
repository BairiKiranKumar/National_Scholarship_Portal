package com.lti.Portal.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lti.Portal.Services.StudAppListService;
import com.lti.Portal.pojo.StudentAppListPojo;
@RestController
@RequestMapping("/NationalSchlarshipPortal/")
@CrossOrigin("http://localhost:4200")
public class StudListController
{
	
	@Autowired
	StudAppListService sService;
	@GetMapping("/allstudentapplist")
	public List<StudentAppListPojo>getStudentAppLists()
	{
		return sService.getStudentAppLists();	
	}
	@PostMapping("/studentapplist")
	public boolean addStudentAppList(@RequestBody StudentAppListPojo studentapplist)
	{
		return sService.addStudentAppList(studentapplist);
		
	}
	
	
		
}
