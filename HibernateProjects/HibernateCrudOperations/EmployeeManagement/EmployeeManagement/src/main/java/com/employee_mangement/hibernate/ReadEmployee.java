package com.employee_mangement.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadEmployee {
	public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
			.buildSessionFactory();
	Session s=sf.openSession();
    @SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Employee_id  :");
	Employee emp=(Employee) s.get(Employee.class, scan.nextInt());
	System.out.println("Employee id :"+emp.getEmployee_id());
	System.out.println("Employee name :"+emp.getEmployee_name());
	System.out.println("Employee Salary_id :"+emp.getEmployee_salary_id());
	System.out.println("Employee Salary :"+emp.getEmployee_salary());
	}
	
}
