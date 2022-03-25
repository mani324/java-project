package com.atm_management.bank;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class ReadAccount {

public static void main(String[] args) 
{
	SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Bank.class)
			.buildSessionFactory();
	Session s=sf.openSession();
    @SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the User_id :");
	Bank b=(Bank) s.get(Bank.class, scan.nextInt());
	System.out.println(" user_id :"+b.getUser_id());
	System.out.println("AccountHolder name :"+b.getAccountHolderName());
	System.out.println("AccountNumber:"+b.getAccountNumber());
	System.out.println("phone_number :"+b.getPhoneNumber());
	}
	
}



