package model;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactoryObj = 
			buildSessionFactoryObj();

//	Create the SessionFactory Object from the Standard 
//	Configuration File (Hibernate.cfg.xml)
	@SuppressWarnings("deprecation")
	public static SessionFactory buildSessionFactoryObj() {
		// TODO Auto-generated method stub
	try {
			sessionFactoryObj = new Configuration()
					.configure()
					.buildSessionFactory();
		}catch(ExceptionInInitializerError exceptionObj){
				exceptionObj.printStackTrace();
		}
		return sessionFactoryObj;
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactoryObj;
	}
}
