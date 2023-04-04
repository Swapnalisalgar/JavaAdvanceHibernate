package com.Hibernatecrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SelectStudent {
	
	public static void main(String[] args) {
		
		//1. Create Configuration Object
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		/*
		 * StandardServiceRegistry ssr = new
		 * StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		 * Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		 */
		
		//2. Create Session Factory Object
		SessionFactory sessionFactory = config.buildSessionFactory();
		//SessionFactory sessionFactory = meta.getSessionFactoryBuilder().build();
		
		//3. Open the Session
		Session session = sessionFactory.openSession();
		
		//4. Begin the Transaction
		session.beginTransaction();
		
		Object obj= session.get(StudentVO.class, new Integer(9));
		
		StudentVO stu =(StudentVO)obj;
		System.out.println(stu.getRno());
		System.out.println(stu.getFname());
		//System.out.println(stu.getLname());
		
		//8. Close the session
		session.close();
		sessionFactory.close();
		
	}

}
