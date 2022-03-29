package com.shop.person;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Store {
	
	void fetchShopping()
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		 try
	       {
			 Transaction tr=session.beginTransaction();
	    	  Person p=new Person();
	    	  p.setName("Vimal");
	    	  
	    	  Shopping shop1=new Shopping();
	    	  shop1.setShop_Name("Royal Supermarket");
	    	  shop1.setShop_Location("chennai Tamilnadu");
	    	  shop1.setItem("Fruits");
	    	  
	    	  Shopping shop2=new Shopping();
	    	  shop2.setShop_Name("Vijaya Mall");
	    	  shop2.setShop_Location("Chennai Tamilnadu");
	    	  shop2.setItem("Perfume");
	    	  
	    	  Shopping shop3=new Shopping();
	    	  shop3.setShop_Name("Poorvika Mobiles");
	    	  shop3.setShop_Location("Chennai Tamilnadu");
	    	  shop3.setItem("Mobile");
	    	  
	    	  Shopping shop4=new Shopping();
	    	  shop4.setShop_Name("Balaji Bhavan");
	    	  shop4.setShop_Location("Chennai Tamilnadu");
	    	  shop4.setItem("Emerald Dal");
	    	  ArrayList<Shopping>sp=new ArrayList<>();
	    	  sp.add(shop1);
	    	  sp.add(shop2);
	    	  sp.add(shop3);
	    	  sp.add(shop4);
	    	  p.setShop(sp);
	    	  session.save(p);
	    	  tr.commit();
	    	  session.close();
	    	  System.out.println("Data added sucessfully......!!!!");
	       }
	       catch(HibernateException h)
	       {
	    	   System.out.println("Hibernate Error is......!!"+h);
	       }
		}
public static void main(String args[])
{
	Store fs=new Store();
	fs.fetchShopping();
}
}