package com.product.management.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name="Manufacturer")
public class Manufacturer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="manufacturer_id")
	private Long mfId;
	private String manufacturerName;
	private String countryOfOrigin;
	@OneToMany(mappedBy="manufacturer",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	
	@JsonManagedReference
	private List<Product>product;
	public Manufacturer(String manufacturerName, String countryOfOrigin) {
		super();
		this.manufacturerName = manufacturerName;
		this.countryOfOrigin = countryOfOrigin;
	}

	
}