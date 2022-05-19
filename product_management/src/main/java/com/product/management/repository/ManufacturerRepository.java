package com.product.management.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.product.management.model.Manufacturer;

public interface ManufacturerRepository extends JpaRepository<Manufacturer,Long>{
	
}
