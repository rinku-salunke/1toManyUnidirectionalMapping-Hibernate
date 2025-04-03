package com.client;

import org.hibernate.Session;

import com.config.HibernateUtil;
import com.model.Department;
import com.model.Employee;

public class Test {

public static void main(String[] args) {
	
	
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	Employee e=new Employee();
	
	e.setEid(1);
	e.setEname("ll");
	
	Department d=new Department();
	
	d.setDid(101);
	
	d.setDname("HR");
	
	d.getE().add(e);
	
	
	session.save(d);
	
	session.beginTransaction().commit();
	
}
	
}
