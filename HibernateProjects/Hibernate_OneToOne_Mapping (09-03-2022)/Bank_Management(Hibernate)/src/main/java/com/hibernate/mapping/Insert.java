package com.hibernate.mapping;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
 public class Insert {
      
	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try
		{
			User u= new User();
			u.setName("Carmel");
			u.setAddress("Madurai TamilNadu");
			u.setPhone(9075666784l);
			Account acc=new Account();
			acc.setBank_name("ICICI_Bank");
			acc.setBank_Address("Madurai TamilNadu");
			acc.setAmount(100000);
			u.setAccount(acc);
			acc.setUser(u);
			System.out.println("Data Added Successfully.....!!");
			session.persist(acc);
			session.persist(u);
			t.commit();
			session.close();
		}
		catch(HibernateException h)
		{
			System.out.println("Hibernate Error is...."+h);
		}
	}

}
