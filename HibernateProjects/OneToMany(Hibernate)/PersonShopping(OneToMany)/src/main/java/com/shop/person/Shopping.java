package com.shop.person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Shopping")
public class Shopping {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	
	private int shop_Id;
	private String shop_Name,shop_Location,item;
}
