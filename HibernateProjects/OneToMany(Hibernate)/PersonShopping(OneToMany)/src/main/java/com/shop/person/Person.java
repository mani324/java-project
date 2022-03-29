package com.shop.person;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Person")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int person_Id;
	private String name;
	
	@OneToMany(targetEntity=Shopping.class,cascade=CascadeType.ALL)
	@JoinColumn(name="person_Id")
	private List<Shopping>shop;
}
