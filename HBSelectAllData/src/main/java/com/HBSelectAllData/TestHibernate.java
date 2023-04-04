package com.HBSelectAllData;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class TestHibernate {
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
		
		//5. Create Object of Class to save
		
		Criteria criteria = session.createCriteria(StudentVO.class);
		List students = criteria.list();

		Iterator itr = students.iterator();
		while (itr.hasNext()) {

			StudentVO emp = (StudentVO) itr.next();
			System.out.println("RollNo. "+emp.getRollno()+" Name "+emp.getFname()+" Age  "+emp.getAge()+" MobNo. "+emp.getMobno());
			
		}
		System.out.println("Get All Data from Table");
		
		//8. Close the session
		session.close();
		sessionFactory.close();
		
	}
}
