package entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
		
		StudentVO obj = new StudentVO();
		obj.setRollno(15);
		obj.setFname("aaru");
		obj.setAge(24);
		obj.setMobno("9822478307");
		
		//6. Save the object into DB
		
		Integer val= (Integer)session.save(obj);
		
		//7. Commit the transaction
		session.getTransaction().commit();
		
		//8. Close the session
		session.close();
		sessionFactory.close();
		
		
		System.out.println("Saved Student Roll no is - "+val);
		
	}
}
