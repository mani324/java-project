package com.mobile.plan;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobilePlanService {
	@Autowired
	public MobilePlanRepository planRepository;
	
	public List<MobilePlan>getAllPlans()
	{
		List<MobilePlan>plans=new ArrayList<>();
		planRepository.findAll().forEach(plans::add);
		return plans;
	}
    public void createMobilePlan(MobilePlan mobile) {
    	planRepository.save(mobile);
    	
    }
    public void updateMobilePlan(int id,MobilePlan mobile) {
    	planRepository.save(mobile);
    	
    }
    public void deleteMobilePlan(int id)
    {
    	planRepository.deleteById(id);
    }
    
    
}
