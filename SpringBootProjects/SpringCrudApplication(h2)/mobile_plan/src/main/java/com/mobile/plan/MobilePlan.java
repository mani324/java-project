package com.mobile.plan;

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
@Table(name="mobile")
public class MobilePlan {
	@Id
	private int id;
	private String operatorName;
	private long phoneNumber;
	private String plan;
	private String benifits;
}
