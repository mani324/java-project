package com.mobile.plan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobilePlanController {
	@Autowired
	private MobilePlanService mpService;
	
	@RequestMapping("/mobile")
	public List<MobilePlan>getAllPlans()
	{
		return mpService.getAllPlans();
	}
    @RequestMapping(method=RequestMethod.POST,value="/mobile")
	public void  createMobilePlan(@RequestBody MobilePlan mobile) {
    	mpService.createMobilePlan(mobile);
    	
    }
    @RequestMapping(method=RequestMethod.PUT,value="/mobile/{id}")
	public void updateMobile(@PathVariable int id,@RequestBody  MobilePlan mobile)
	{
	  mpService.updateMobilePlan(id, mobile);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/mobile/{id}")
	public void deleteMobile(@PathVariable int id)
	{
		mpService.deleteMobilePlan(id);
	}
}
