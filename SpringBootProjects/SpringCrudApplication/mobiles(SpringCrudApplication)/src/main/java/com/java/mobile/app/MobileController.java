package com.java.mobile.app;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileController {
	@Autowired
	private MobileService mobileService;
	
	@RequestMapping("/mobile")
	public List<Mobile>getAllDetails()
	{
	return mobileService.getAllDetails();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/mobile")
	public void createMobile(@RequestBody Mobile mobile)
	{
		mobileService.createMobile(mobile);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/mobile/{id}")
	public void updateMobile(@PathVariable int id,@RequestBody Mobile mobile)
	{
		mobileService.updateMobile(id,mobile);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/mobile/{id}")
	public void deleteMobile(@PathVariable int id)
	{
		mobileService.deleteMobile(id);
	}
}