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

import com.product.management.model.Product;
import com.product.management.service.ProductService;

@RestController
public class ProductController {
     @Autowired
	private ProductService productService;
     
     @GetMapping("/product")
     public List<Product>getAllProduct()
     {
    	 return productService.getAllProduct();
     }
     @GetMapping("/product/{id}")
     public Product getProductById(@PathVariable Long id)
     {
    	 return productService.getProductById(id);
     }
     @PostMapping("/product")
     public void createProduct(@RequestBody Product product)
     {
    	 productService.createProduct(product);
     }
     
     @PutMapping("/product/{id}")
     public void updateProduct(@PathVariable Long id,@RequestBody Product product)
     {
    	 productService.updateProduct(id, product);
     }
     
     @DeleteMapping("/product/{id}")
     public void deleteProduct(@PathVariable Long id)
     {
    	 productService.deleteProduct(id);
     }
}
