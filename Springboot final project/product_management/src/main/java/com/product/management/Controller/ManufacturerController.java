package com.product.management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.management.model.Manufacturer;
import com.product.management.service.ManufacturerService;

@RestController
public class ManufacturerController {
    @Autowired
	private ManufacturerService manufacturerService;
	
    @GetMapping("/manufacturer")
    public List<Manufacturer>getAllManufacturer()
    
    {
    	return manufacturerService.getAllManufacturer();
    }
    
    @GetMapping("/manufacturer/{id}")
    public Manufacturer getManufacturerById(@PathVariable Long id)
    {
    	return manufacturerService.getManufacturerById(id);
    }
    
    @PostMapping("/manufacturer")
    public void createManufacturer(@RequestBody Manufacturer manufacturer)
    
    {
    	manufacturerService.createManufacturer(manufacturer);
    }
    
    @PutMapping("/manufacturer/{id}")
    public void updateManufacturer(@PathVariable Long id,@RequestBody Manufacturer manufacturer)
    
    {
    	manufacturerService.updateManufacturer(id, manufacturer);
    }
    
    @DeleteMapping("/manufacturer/{id}")
    public void deleteManufacturer(@PathVariable Long id)
    
    {
    	manufacturerService.deleteManufacturer(id);
    }
    
}
