package com.product.management.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@Entity
@Builder
@AllArgsConstructor
@Table(name="Product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long productId;
	private String productCode;
	private String productName;
	private String description;
	private double price;
	@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name = "manufacturer_id")
	@JsonBackReference
	private Manufacturer manufacturer;
	public Product(String productCode, String productName, String description, double price) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.description = description;
		this.price = price;
	}
	
  
}
