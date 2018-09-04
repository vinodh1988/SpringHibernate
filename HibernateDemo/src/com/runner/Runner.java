package com.runner;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Jobs1;
import com.model.SessionProvider;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory s=SessionProvider.getSessionFactory();
		Session s1=s.openSession();
		
		/*Transaction t=s1.beginTransaction();
		
		Jobs j=new Jobs("SE","Software Engineer",30000,90000);
		s1.update(j);
	    j.setMax_salary(80000);
	    s1.update(j);
	    j.setJob_title("System Engineer");
	    s1.update(j);
		s1.delete(j);
		t.commit();
		
		System.out.println("Row Updated");*/
		
		Query q=s1.createQuery("from Jobs1 where min_salary>7000 order by job_title");
		
		List<Jobs1> l=q.list();
		
		for(Jobs1 x:l)
			System.out.println(x.getJob_title());
		
	}

}
