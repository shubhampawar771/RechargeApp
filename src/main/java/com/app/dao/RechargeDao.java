package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.app.dto.Plan;
import com.app.dto.UserProfile;
import com.app.model.RechargeInfo;
import com.app.model.User;
import com.app.util.UtilityClass;
import com.app.dto.UserProfile;
import com.app.dto.loginDto;
import java.sql.PreparedStatement;
import com.app.model.User;

import com.app.dto.UserProfile;
import com.app.dto.loginDto;
import com.app.model.User;

public class RechargeDao {

public List<RechargeInfo> plans()throws Exception {
	
	
	
	Session session=UtilityClass.getSession();
	Transaction tx=session.beginTransaction();
Query<RechargeInfo> query=session.createQuery("from RechargeInfo");

	return query.list();
}

public List<RechargeInfo> airtelPlans() {
	// TODO Auto-generated method stub
	Session session=UtilityClass.getSession();
	Transaction tx=session.beginTransaction();
Query<RechargeInfo> query=session.createQuery("from RechargeInfo where cardName='airtel'");

	return query.list();
}

public List<RechargeInfo> bsnlPlans() {
	// TODO Auto-generated method stub
	Session session=UtilityClass.getSession();
	Transaction tx=session.beginTransaction();
Query<RechargeInfo> query=session.createQuery("from RechargeInfo where cardName='bsnl'");

	return query.list();
}

public List<RechargeInfo> jioPlans() {
	Session session=UtilityClass.getSession();
	Transaction tx=session.beginTransaction();
Query<RechargeInfo> query=session.createQuery("from RechargeInfo where cardName='jio'");

	return query.list();
}

public List<RechargeInfo> viPlans() {
	Session session=UtilityClass.getSession();
	Transaction tx=session.beginTransaction();
Query<RechargeInfo> query=session.createQuery("from RechargeInfo where cardName='vi'");

	return query.list();
}
}
