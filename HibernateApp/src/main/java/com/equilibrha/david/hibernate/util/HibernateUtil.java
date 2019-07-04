package com.equilibrha.david.hibernate.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {
	//Creamos el SessionFactory vacio
	private static SessionFactory sessionFactory = null; 
	
	static {
		
		try {
			
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			ServiceRegistry serviceRegistry;
			serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
	    } 
	    catch (HibernateException ex) {
	    	
	    	ex.printStackTrace();
	    	throw new RuntimeException("Error SessionFactory : "  + ex.getMessage(), ex);
		    
	    }
	}
	
	public static SessionFactory getSessionFactory() {
    	return sessionFactory; 
    }
}
