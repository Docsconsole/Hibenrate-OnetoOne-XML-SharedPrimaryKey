package com.docsconsole.tutorials.hibernate5.client;

import org.hibernate.Session;

import com.docsconsole.tutorials.hibernate5.entity.Employee;
import com.docsconsole.tutorials.hibernate5.entity.EmployeeDetails;
import com.docsconsole.tutorials.hibernate5.utils.HibernateUtils;

public class MainClient {
	
	
	public static void main(String[] args) {
		System.out.println("the main method");

		Session session = HibernateUtils.getSessionFactory().openSession();

		// obtains the session
		session.beginTransaction();

		// creates a new product
		Employee employee = new Employee();
		employee.setEmpName("Dan");
		employee.setEmpSal(new Long(100000));
		
		// creates product detail
		EmployeeDetails empDet = new EmployeeDetails();
		empDet.setEmpPhoneNum(new Long("9976453111"));
				
		// Save employee
        session.saveOrUpdate(employee);
        empDet.setEmployee(employee);
		
       // Save employee
        session.saveOrUpdate(empDet);

		session.getTransaction().commit();
		session.close();
	}
}
