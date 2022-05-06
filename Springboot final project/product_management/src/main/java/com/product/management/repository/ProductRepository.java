package com.product.management.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.management.model.Product;
@Repository
public interface ProductRepository  extends JpaRepository <Product,Long>{

	

}
