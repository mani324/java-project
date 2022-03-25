package com.employee_mangement.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateEmployee {
	public static void main(String args[]) {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session s=sf.openSession();
		String choice="No";
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		do {
			Transaction tr=s.beginTransaction();
			Employee emp=new Employee();
			System.out.println("Enter the Employee_id :");
			emp.setEmployee_id(scan.nextInt());
			System.out.println("Enter the Employee_name :");
			emp.setEmployee_name(scan.next());
			System.out.println("Enter the Employee_salary_id :");
			emp.setEmployee_salary_id(scan.nextInt());
			System.out.println("Enter the Employee_salary :");
			emp.setEmployee_salary(scan.nextInt());
			System.out.println("Enter the Employee_emil :");
			emp.setEmployee_email(scan.next());
			s.save(emp);
			s.flush();
			tr.commit();
			System.out.println("Data Stored Successfully");
			System.out.println("Add Additional Data on employee_data  y/n");
			choice=scan.next();
			}
		while(choice.equalsIgnoreCase("y") | choice.equalsIgnoreCase("yes"));
		     s.close();
		     sf.close();
		
	}
	
    
	
}
