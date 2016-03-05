package com.lxl.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

import com.lxl.vo.Userlogin;


public class TestForHibernate {

	/**
	 * @param args
	 */
	@Test
	public void createTable(){
		Configuration cfg = new Configuration().configure();
		SchemaExport se = new SchemaExport(cfg);
		se.create(true,true);
	}
	@Test
	public static void add(){
		Configuration cfg = new Configuration().configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
		ServiceRegistry service = ssrb.build();
		SessionFactory factory = cfg.buildSessionFactory(service);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Userlogin us = new Userlogin();
		us.setUserpassword("2");
		
		try{
			session.save(us);
			tx.commit();
		}catch(Exception e){
			tx.rollback();
		}finally{
			session.close();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
