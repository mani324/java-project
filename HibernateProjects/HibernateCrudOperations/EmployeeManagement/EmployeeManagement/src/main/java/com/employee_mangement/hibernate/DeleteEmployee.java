package com.employee_mangement.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class DeleteEmployee {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter employee_id to Delete :");
		Employee emp=(Employee)s.get(Employee.class, scan.nextInt());
		if(emp != null) {
			s.delete(emp);
			s.flush();
			tr.commit();
			System.out.println("Data Deleted Succesfully");
		}
		else {
			System.out.println("Invalid Employee_id....Enter correct one!! ");
		}
        s.close();
        sf.close();

}
}