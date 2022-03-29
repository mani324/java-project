package com.hibernate.mapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User_details")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int user_id;
private String name,Address;
private long phone;
@OneToOne(targetEntity=Account.class,cascade=CascadeType.ALL)
private Account account;
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public Account getAccount() {
	return account;
}
public void setAccount(Account account) {
	this.account = account;
}

}
