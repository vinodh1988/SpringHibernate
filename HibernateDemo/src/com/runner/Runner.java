package com.runner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Jobs;
import com.model.SessionProvider;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory s=SessionProvider.getSessionFactory();
		Session s1=s.openSession();
		
		Transaction t=s1.beginTransaction();
		
		Jobs j=new Jobs("PM","Project Manager",50000,70000);
		
		s1.save(j);
		
		t.commit();
		
		System.out.println("Row inserted");
		
	}

}