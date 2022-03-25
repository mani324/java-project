package com.atm_management.bank;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

	public class UpdateAccount {
			public static void main(String[] args) {
				SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Bank.class)
						.buildSessionFactory();
				Session s=sf.openSession();
				Transaction tr=s.beginTransaction();
				@SuppressWarnings("resource")
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter user_id to Update :");
				Bank b=(Bank)s.get(Bank.class, scan.nextInt());
				if(b != null) {
					System.out.println("Enter new PhoneNumber to update :");
					b.setPhoneNumber(scan.nextInt());
					s.update(b);
					tr.commit();
					System.out.println("phone number updated Succesfully");
				}
				else {
					System.out.println("Invalid user_id....Enter correct one!! ");
				}
	            s.close();
	            sf.close();
		}

	}



