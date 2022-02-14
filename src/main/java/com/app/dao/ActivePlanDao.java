package com.app.dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.app.bean.ActivePlan;
import com.app.model.RechargeInfo;
import com.app.util.UtilityClass;

public class ActivePlanDao {
	
public ActivePlan activePlan(int planId, long mobileNo,String choice) {
	// TODO Auto-generated method stub
	Session session=UtilityClass.getSession();
	Transaction tx=session.beginTransaction();
Query<RechargeInfo> query=session.createQuery("from RechargeInfo where planId="+planId+" and cardName = '"+choice+"'");
RechargeInfo rechargeInfo=query.list().get(0);
if(rechargeInfo!=null) {
ActivePlan plan=new ActivePlan();
LocalDate ld=LocalDate.now();
plan.setActivePlanDate(ld);
plan.setAmount(rechargeInfo.getAmount());
plan.setCardName(rechargeInfo.getCardName());
plan.setExpireDate(ld.plusDays(rechargeInfo.getValidity()));
plan.setMobileNo(mobileNo);
plan.setValidity(rechargeInfo.getValidity());
plan.setPlanName(rechargeInfo.getPackegeName());
session.save(plan);
tx.commit();
session.close();
	return plan;
}else {
	System.out.println("Enter plan not avilabe for this sim");
	return null;
}
}

}
