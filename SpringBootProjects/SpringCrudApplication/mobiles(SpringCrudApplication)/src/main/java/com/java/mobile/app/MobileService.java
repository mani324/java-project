package com.java.mobile.app;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileService {
		@Autowired
		public MobileRepository mobileRepository;

		public List<Mobile> getAllDetails()
		{
			List<Mobile> mobiles = new ArrayList<>();
			mobileRepository.findAll().forEach(mobiles::add);
			return mobiles;
		}
		public void createMobile(Mobile mobile) {
			mobileRepository.save(mobile);	
		}
		
		public void updateMobile(int id, Mobile mobile) {
			mobileRepository.save(mobile);	
		}
		
		public void deleteMobile(int id) {
			mobileRepository.deleteById(id);	
		}
	
	}



