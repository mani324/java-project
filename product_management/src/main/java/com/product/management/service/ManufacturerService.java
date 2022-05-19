package com.product.management.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.management.exception.ResourceNotFoundException;
import com.product.management.model.Manufacturer;
import com.product.management.repository.ManufacturerRepository;

@Service
public class ManufacturerService {
	@Autowired
	public ManufacturerRepository manufacturerRepository;
	 
	public List<Manufacturer>getAllManufacturer()
	{
		return manufacturerRepository.findAll();
	}
	public Manufacturer getManufacturerById(Long mfId)
	{
		return manufacturerRepository.findById(mfId).orElseThrow(() -> new ResourceNotFoundException("Manufacturer not found with id :"+mfId));
	}
	public void createManufacturer(Manufacturer manufacturer)
	{
		manufacturerRepository.save(manufacturer);
		
	}
	
    public void updateManufacturer(Long id,Manufacturer manufacturer)
    {
    	Manufacturer manu=manufacturerRepository.findById(id).get();
    	manu.setManufacturerName(manufacturer.getManufacturerName());
    	manu.setCountryOfOrigin(manufacturer.getCountryOfOrigin());
    	manufacturerRepository.save(manu);
    }
    
    public void deleteManufacturer(Long id)
    {
    	manufacturerRepository.deleteById(id);
    }
}
