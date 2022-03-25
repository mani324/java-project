package com.staff.details;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaffController {
	@GetMapping("/staffs")
	public List<StaffDetails>getDetails()
	{
		List<StaffDetails>sd=new ArrayList<>();
		sd.add(new StaffDetails(5001,"Arunkumar","Chennai Tamilnadu",500000d));
		sd.add(new StaffDetails(5002,"Aasif","Dindigul Tamilnadu",400000d));
		sd.add(new StaffDetails(5003,"Logeswaren","Madurai Tamilnadu",550000d));
		sd.add(new StaffDetails(5004,"Rajesh","Chennai Tamilnadu",480000d));
		sd.add(new StaffDetails(5005,"Sasikumar","Chennai Tamilnadu",500000d));
		return sd;
	}

}
