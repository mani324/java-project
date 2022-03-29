package com.atm_management.bank;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
	public class DeleteAccount {
		public static void main(String[] args) {
			SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Bank.class)
					.buildSessionFactory();
			Session s=sf.openSession();
			Transaction tr=s.beginTransaction();
			@SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter User_id to Delete :");
			Bank b=(Bank)s.get(Bank.class, scan.nextInt());
			if(b != null) {
				s.delete(b);
				s.flush();
				tr.commit();
				System.out.println("Data Deleted Succesfully");
			}
			else {
				System.out.println("Invalid User_id....Enter correct one!! ");
			}
	        s.close();
	        sf.close();

	}
	}

