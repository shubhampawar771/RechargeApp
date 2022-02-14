package com.app.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.RechargeInfo;
import com.app.model.User;
import com.app.util.UtilityClass;
public class RegisterDao {

	public int register(User user) {
		try {
		Session session=UtilityClass.getSession();
		Transaction tx=session.beginTransaction();
		session.save(user);
		
		tx.commit();
		UtilityClass.closeSession();
		return 1;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public int addRecharge(RechargeInfo info) {
		// TODO Auto-generated method stub
		try {
			Session session=UtilityClass.getSession();
			Transaction tx=session.beginTransaction();
			session.save(info);
			
			tx.commit();
			UtilityClass.closeSession();
			return 1;
			}catch(Exception e) {
				e.printStackTrace();
				return 0;
			}
	}
}
