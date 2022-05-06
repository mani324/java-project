package com.product.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.management.exception.ResourceNotFoundException;

import com.product.management.model.Product;
import com.product.management.repository.ProductRepository;

@Service
public class ProductService {
	  @Autowired
      public ProductRepository productRepository;
	  
	  public List<Product>getAllProduct()
	  {
		  return productRepository.findAll();
	  }
	  
	  public Product getProductById(Long id)
	  {
			return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not found with id :"+id));
      }
	  
      public void createProduct(Product product)
      {
    	 productRepository.save(product);
      }
      
      public void updateProduct(Long id,Product product)
      {
    	  Product pro=productRepository.findById(id).get();
    	  pro.setProductCode(product.getProductCode());
    	  pro.setDescription(product.getDescription());
    	  pro.setPrice(product.getPrice());
    	  productRepository.save(pro);
      }
      
      public void deleteProduct(Long id)
      {
    	  productRepository.deleteById(id);
      }
}
