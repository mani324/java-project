package com.employee_mangement.hibernate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Employee_Data")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Employee_ID")
	private int employee_id;
	@Column(name="Employee_Name")
	private String employee_name;
	@Column(name="EmployeeSalary_ID")
	private int employee_salary_id;
	@Column(name="Employee_salary")
	private int employee_salary;
	@Column(name="Employee_email")
	private String employee_email;
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public int getEmployee_salary_id() {
		return employee_salary_id;
	}
	public void setEmployee_salary_id(int employee_salary_id) {
		this.employee_salary_id = employee_salary_id;
	}
	public int getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(int employee_salary) {
		this.employee_salary = employee_salary;
	}
	public String getEmployee_email() {
		return employee_email;
	}
	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_salary_id="
				+ employee_salary_id + ", employee_salary=" + employee_salary + ", employee_email=" + employee_email
				+ "]";
	}
}
