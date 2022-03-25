package com.java.mobile.app;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="MobileDetails")
public class Mobile {
	@Id
	private int id;
	private int serialNumber;
	private String mobileName;
	private int version;
	private int releaseYear;
}
