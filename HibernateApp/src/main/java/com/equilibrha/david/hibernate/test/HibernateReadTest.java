package com.equilibrha.david.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.equilibrha.david.hibernate.models.HbEmployeeWriteReadModel;
import com.equilibrha.david.hibernate.util.HibernateUtil;

public class HibernateReadTest {

	public static void main(String[] args) {
		
		List<?> queryResult = null;
		
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        
        Query q = session.createQuery("From HbEmployeeWriteReadModel ");
        
        List<HbEmployeeWriteReadModel> resultList = q.list();
        
        for (HbEmployeeWriteReadModel next : resultList) {
            System.out.println("--------------------------------------");
            System.out.println("Employee Id: " + next.getEmployeeID());
            System.out.println("Employee Name: " + next.getEmployeeName());
            System.out.println("Employee Surname: " + next.getEmployeeSurname());
            System.out.println("Employee Birthdate: " + next.getBirthDate());
            System.out.println("--------------------------------------");
        }
		
	}
	
}
