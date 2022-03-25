package com.lti.Portal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lti.Portal.Services.ApplyingForSchemeService;
import com.lti.Portal.pojo.AcademicDetails;
import com.lti.Portal.pojo.BasicDetails;
import com.lti.Portal.pojo.ContactDetails;
import com.lti.Portal.pojo.FeeDetails;
import com.lti.Portal.pojo.OtherDetails;
import com.lti.Portal.pojo.SubmitDetails;
import com.lti.Portal.pojo.TenthDetails;
import com.lti.Portal.pojo.TwelthDetails;


@RestController
@RequestMapping("/NationalScholarshipPortal/Scheme")
@CrossOrigin("http://localhost:4200")
public class ApplyingForSchemeController {
	@Autowired
	ApplyingForSchemeService aService;
	      @GetMapping("/AllAcademicDetails")
	      public List<AcademicDetails> getAcademicDetails(){
	    	  return aService.getAcademicDetails();
	      }
	      @PostMapping("/AcademicDetails")
	      public boolean addAcademicDetails(@RequestBody AcademicDetails academicDetails) {
	    	  return aService.addAcademicDetails(academicDetails);
	      }
	      @GetMapping("/AllBasicDetails")
	      public List<BasicDetails> getBasicDetails(){
	    	  return aService.getBasicDetails();
	      }
	      @PostMapping("/BasicDetails")
	      public boolean addBasicDetails(@RequestBody BasicDetails basicDetails) {
	    	  return aService.addBasicDetails(basicDetails);
	      }
	      @GetMapping("/AllContactDetails")
	      public List<ContactDetails> getContactDetails(){
	    	  return aService.getContactDetails();
	      }
	      @PostMapping("/ContactDetails")
	      public boolean addContactDetails(@RequestBody ContactDetails contactDetails) {
	    	  return aService.addContactDetails(contactDetails);
	      }
	      @GetMapping("/AllFeeDetails")
	      public List<FeeDetails> getFeeDetails(){
	    	  return aService.getFeeDetails();
	      }
	      @PostMapping("/FeeDetails")
	      public boolean addFeeDetails(@RequestBody FeeDetails feeDetails) {
	    	  return aService.addFeeDetails(feeDetails);
	      }
	      @GetMapping("/AllOtherDetails")
	      public List<OtherDetails> getOtherDetails(){
	    	  return aService.getOtherDetails();
	      }
	      @PostMapping("/OtherDetails")
	      public boolean addOtherDetails(@RequestBody OtherDetails otherDetails) {
	    	  return aService.addOtherDetails(otherDetails);
	      }
	      @GetMapping("/AllTenthDetails")
	      public List<TenthDetails> getTenthDetails(){
	    	  return aService.getTenthDetails();
	      }
	      @PostMapping("/TenthDetails")
	      public boolean addTenthDetails(@RequestBody TenthDetails tenthDetails) {
	    	  return aService.addTenthDetails(tenthDetails);
	      }
	      @GetMapping("/AllTwelthDetails")
	      public List<TwelthDetails> getTwelthDetails(){
	    	  return aService.getTwelthDetails();
	      }
	      @PostMapping("/TwelthDetails")
	      public boolean addTwelthDetails(@RequestBody TwelthDetails twelthDetails) {
	    	  return aService.addTwelthDetails(twelthDetails);
	      }
	      @GetMapping("/AllSubmitDetails")
	      public List<SubmitDetails> getSubmitDetails(){
	    	  return aService.getSubmitDetails();
	      }
          @PostMapping("/SubmitDetails")
          public boolean addSubmitDetails(@RequestBody SubmitDetails submitDetails) {
        	  return aService.addSubmitDetails(submitDetails);
          }
}
