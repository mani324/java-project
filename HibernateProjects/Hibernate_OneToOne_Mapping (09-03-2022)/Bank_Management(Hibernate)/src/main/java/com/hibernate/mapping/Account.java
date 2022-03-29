package com.hibernate.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Account_Details")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int transaction_id;
	private String bank_name,bank_Address;
	private int amount;
	@OneToOne(targetEntity=User.class)
	private User user;
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getBank_Address() {
		return bank_Address;
	}
	public void setBank_Address(String bank_Address) {
		this.bank_Address = bank_Address;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
