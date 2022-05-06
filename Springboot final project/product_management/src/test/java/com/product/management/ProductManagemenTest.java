package com.product.management;
import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.product.management.model.Manufacturer;
import com.product.management.model.Product;
import com.product.management.repository.ManufacturerRepository;
import com.product.management.repository.ProductRepository;


@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductManagemenTest {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ManufacturerRepository manufacturerRepository;
    @Test
    @Order(1)
    @Rollback(value=false)
	public void testSaveProduct()
	{
		Product product=Product.builder()
				.productId(1L)
				.productCode("SM300027")
				.productName("Samsung LED-TV")
				.description("4K UHD,DOULBY ATMOS")
				.price(76000.00d)
				.build();
		productRepository.save(product);
		Assertions.assertThat(product.getProductId()).isGreaterThan(0);
	}
    @Test
    @Order(2)
   
    public void testGetProduct()
    {
    	Product product=productRepository.findById(1L).get();
    	Assertions.assertThat(product.getProductId()).isEqualTo(1L);
    	
    }
    @Test
    @Order(3)
    public void testGetAllProduct()
    {
    	List<Product>product=productRepository.findAll();
    	Assertions.assertThat(product.size()).isGreaterThan(0);
    }
    @Test
    @Order(4)
    @Rollback(value=false)
    public void testUpdateproduct()
    {
    	Product product=productRepository.findById(1L).get();
    	product.setProductCode("SM370009");
    	product.setProductName("Samsung Note 10");
    	product.setDescription("1080p Amoled Display,60 watts fast charger");
    	product.setPrice(89999.00d);
    	Product pUpdated=productRepository.save(product);
    	Assertions.assertThat(pUpdated.getProductCode()).isEqualTo("SM370009");
    	Assertions.assertThat(pUpdated.getProductName()).isEqualTo("Samsung Note 10");
    	Assertions.assertThat(pUpdated.getDescription()).isEqualTo("1080p Amoled Display,60 watts fast charger");
    	Assertions.assertThat(pUpdated.getPrice()).isEqualTo(89999.00d);
    		
    }
    @Test
    @Order(5)
    @Rollback(value=false)
    public void testDeleteProduct()
    {
    	Product product=productRepository.findById(1L).get();
    	productRepository.delete(product);
    	Product product1=null;
    	Optional<Product>optionalProduct=productRepository.findById(1L);
    	if(optionalProduct.isPresent())
    	{
    		product1=optionalProduct.get();
    	}
    	Assertions.assertThat(product1).isNull();
    }
    @Test
    public void testSaveManufacturer()
    {
    	Manufacturer manufacturer=Manufacturer.builder()
    			      .mfId(1L)
    			      .manufacturerName("Samsung Electronics")
    			      .countryOfOrigin("South Korea")
    			      .build();
    	manufacturerRepository.save(manufacturer);
    			      
    }
    
    
}
