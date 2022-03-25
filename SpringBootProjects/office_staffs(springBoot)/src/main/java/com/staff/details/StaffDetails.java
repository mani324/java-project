package com.staff.details;

public class StaffDetails {
	private int staffId;
	private String staffName,address;
	private double staffSalary;
	public StaffDetails(int staffId, String staffName, String address, double staffSalary) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.address = address;
		this.staffSalary = staffSalary;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getStaffSalary() {
		return staffSalary;
	}
	public void setStaffSalary(double staffSalary) {
		this.staffSalary = staffSalary;
	}
}
