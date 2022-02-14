package com.app.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UtilityClass {
	private static SessionFactory factory;
	static {
		try {
//			Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
//			factory=configuration.buildSessionFactory();

			factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	static ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	static Session session = null;

	public static Session getSession() {
		try {
			if(threadLocal.get()==null) {
				session=factory.openSession();
				return session;	
			}
			else {
				 return threadLocal.get();
			}
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}
	public static void closeSession() {
		try {
			session.close();   
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
