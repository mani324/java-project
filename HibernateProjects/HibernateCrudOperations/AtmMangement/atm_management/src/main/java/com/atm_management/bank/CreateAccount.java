package com.atm_management.bank;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateAccount {
	public static void main(String[] args) {
	 SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Bank.class)
				.buildSessionFactory();
				Session s=sf.openSession();
				String choice="No";
				@SuppressWarnings("resource")
				Scanner scan=new Scanner(System.in);
				do {
					Transaction tr=s.beginTransaction();
					Bank b=new Bank();
					System.out.println("Enter the User_id :");
					b.setUser_id(scan.nextInt());
					System.out.println("Enter the AccountNumber :");
					b.setAccountNumber(scan.nextInt());
					System.out.println("Enter the AccountHolderName");
					b.setAccountHolderName(scan.next());
					System.out.println("Enter the phone number :");
					b.setPhoneNumber(scan.nextInt());
					s.save(b);
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


	


