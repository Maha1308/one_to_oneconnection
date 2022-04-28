package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {
	laptop lop=new laptop();
	lop.setLid(1);
	lop.setLname("hp");
	lop.setLprice(45000);
 
	Student sob=new Student();
	sob.setRollno(12);
	sob.setName("jeeva");

	Configuration conn=new Configuration().configure().addAnnotatedClass(laptop.class).addAnnotatedClass(Student.class);	
	ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
	SessionFactory sf=conn.buildSessionFactory(reg);
	Session sess=sf.openSession();
	Transaction tx=sess.beginTransaction();
	
	sess.save(lop);
	sess.save(sob);
	
	tx.commit();

	
	}

}
