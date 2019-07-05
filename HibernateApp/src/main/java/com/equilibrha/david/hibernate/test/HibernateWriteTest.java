package com.equilibrha.david.hibernate.test;

import java.util.Date;
import org.hibernate.Session;

import com.equilibrha.david.hibernate.models.HbEmployeeWriteReadModel;
import com.equilibrha.david.hibernate.util.HibernateUtil;

public class HibernateWriteTest {

	public static void main(String[] args) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
  
        session.beginTransaction();
        
        HbEmployeeWriteReadModel employee = new HbEmployeeWriteReadModel(02,"MIGUEL", "RAMIREZ BRETÓN", new Date());
        
        session.save(employee);
        
        session.getTransaction().commit();
    }
    

}
