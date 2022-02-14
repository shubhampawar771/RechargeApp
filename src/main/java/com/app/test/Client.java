package com.app.test;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.app.bean.ActivePlan;
import com.app.dao.ActivePlanDao;
import com.app.dao.LoginDao;
import com.app.dao.RechargeDao;
import com.app.dao.RegisterDao;
import com.app.dto.Plan;
import com.app.dto.RequestDto;
import com.app.dto.UserProfile;
import com.app.dto.loginDto;
import com.app.model.RechargeInfo;
import com.app.model.User;

public class Client {
	static long mobileNo=0;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		RequestDto request = new RequestDto();
		RegisterDao dao = new RegisterDao();
		String choice = "";
		do {
			System.out.println("Welcome to My Recharge Application");
			System.out.println("press 1. Register");
			System.out.println("press 2. Login");
			System.out.println("-------------------------------------------");
			System.out.println("Enter your choice");
			int key = sn.nextInt();
			switch (key) {
			case 1:
				User user = request.registeRequest();
			
				int i = dao.register(user);
				if (i == 1) {
					System.out.println("Data Register successfully..!");
				} else {
					System.out.println("Sorry user not register..!");
				}
				break;
			case 2:
				loginDto dto = request.loginRequest();
				LoginDao loginDao = new LoginDao();
				UserProfile profile = loginDao.login(dto);
				
					if(profile!=null&& profile.getRole().equalsIgnoreCase("admin")) {
						RechargeInfo info=request.addRecharge();
						if(info!=null) {
							int res=dao.addRecharge(info);
							if (res == 1) {
								System.out.println("Plan added  successfully..!");
							} else {
								System.out.println("Sorry plan not add something went wrong..!");
							}
						}
					System.out.println(info);
						
				}else {
					RechargeDao rechargeDao=new RechargeDao();
					List<RechargeInfo> plans=rechargeDao.plans();
					System.out.println("Plan Name\tSimCard Company\tamount\tvalidity");
					for(RechargeInfo plan:plans) {
						System.out.println(plan.getPackegeName()+"\t"+plan.getCardName()+"\t"+plan.getAmount()+"\t"+plan.getValidity());
						
					}
					System.out.println("--------------------Select Sim--------------------------------");
					System.out.println("Enter your Mobile Number:");
					mobileNo=new Scanner(System.in).nextLong();
					int planId;
					System.out.println("Enter your Card Company:");
					String company=new Scanner(System.in).next();
					switch(company.toLowerCase()) {
					case "airtel":
						List<RechargeInfo> airtelPlans=rechargeDao.airtelPlans();
						System.out.println("Plan Id\tPlan Name\tSimCard Company\tamount\tvalidity");
						StringBuilder sb=new StringBuilder("Bill Recipt....");
						for(RechargeInfo plan:airtelPlans) {
							sb.append((plan.getPackegeName()+"\t"+plan.getCardName()+"\t"+plan.getAmount()+"\t"+plan.getValidity()));
							System.out.println(plan.getPlanId()+"\t"+plan.getPackegeName()+"\t"+plan.getCardName()+"\t"+plan.getAmount()+"\t"+plan.getValidity());
						}
						long count=airtelPlans.stream().count();
						System.out.println("\nNumber of Airtel plans available:" +count);
						System.out.println("\nEnter your plan id:");
						planId=sn.nextInt();
						ActivePlanDao dao1=new ActivePlanDao();
						ActivePlan plan=dao1.activePlan(planId,mobileNo,company.toLowerCase());
						System.out.println("Your recharge is Successful with plan:"+plan);
						try {
							File file = new File("E:/Symbi/IoStreamtxt file/Receipt.txt");
							FileWriter fw = new FileWriter(file,true);
						
						fw.write(sb.toString());
						
						fw.close();
						
						}
						catch(Exception e) {
							e.getStackTrace();
						}
						
						break;
					case "bsnl":
						List<RechargeInfo> bsnlPlans=rechargeDao.bsnlPlans();
						System.out.println("Plan Name\tSimCard Company\tamount\tvalidity");
						StringBuilder sb2=new StringBuilder("Bill Recipt....");
						for(RechargeInfo plan2:bsnlPlans) {
							sb2.append((plan2.getPackegeName()+"\t"+plan2.getCardName()+"\t"+plan2.getAmount()+"\t"+plan2.getValidity()));
							System.out.println(plan2.getPlanId()+"\t"+plan2.getPackegeName()+"\t"+plan2.getCardName()+"\t"+plan2.getAmount()+"\t"+plan2.getValidity());
						}
						long count1=bsnlPlans.stream().count();
						System.out.println("\nNumber of Bsnl plans available:" +count1);
						System.out.println("\nEnter your plan id:");
						planId=sn.nextInt();
						ActivePlanDao dao2=new ActivePlanDao();
						ActivePlan plan2=dao2.activePlan(planId,mobileNo,company.toLowerCase());
						System.out.println("Your recharge is Successful with plan:"+plan2);
						try {
							File file = new File("E:/Symbi/IoStreamtxt file/Receipt.txt");
							FileWriter fw = new FileWriter(file,true);
						
						fw.write(sb2.toString());
						
						fw.close();
						
						}
						catch(Exception e) {
							e.getStackTrace();
						}
						break;
					case "jio":
						List<RechargeInfo> jioPlans=rechargeDao.jioPlans();
						System.out.println("Plan Name\tSimCard Company\tamount\tvalidity");
						StringBuilder sb3=new StringBuilder("Bill Recipt....");
						for(RechargeInfo plan3:jioPlans) {
							sb3.append((plan3.getPackegeName()+"\t"+plan3.getCardName()+"\t"+plan3.getAmount()+"\t"+plan3.getValidity()));
							System.out.println(plan3.getPlanId()+"\t"+plan3.getPackegeName()+"\t"+plan3.getCardName()+"\t"+plan3.getAmount()+"\t"+plan3.getValidity());
						}
						long count2=jioPlans.stream().count();
						System.out.println("\nNumber of Jio plans available:" +count2);
						System.out.println("\nEnter your plan id:");
						planId=sn.nextInt();
						ActivePlanDao dao3=new ActivePlanDao();
						ActivePlan plan3=dao3.activePlan(planId,mobileNo,company.toLowerCase());
						System.out.println("Your recharge is Successful with plan:"+plan3);
						try {
							File file = new File("E:/Symbi/IoStreamtxt file/Receipt.txt");
							FileWriter fw = new FileWriter(file,true);
						
						fw.write(sb3.toString());
						
						fw.close();
						
						}
						catch(Exception e) {
							e.getStackTrace();
						}
						break;
					case "vi":
						List<RechargeInfo> viPlans=rechargeDao.viPlans();
						System.out.println("Plan Id\tPlan Name\tSimCard Company\tamount\tvalidity");
						StringBuilder sb4=new StringBuilder("Bill Recipt....");
						for(RechargeInfo plan4:viPlans) {
							sb4.append((plan4.getPackegeName()+"\t"+plan4.getCardName()+"\t"+plan4.getAmount()+"\t"+plan4.getValidity()));
							System.out.println(plan4.getPlanId()+"\t"+plan4.getPackegeName()+"\t"+plan4.getCardName()+"\t"+plan4.getAmount()+"\t"+plan4.getValidity());
						}
						long count3=viPlans.stream().count();
						System.out.println("\nNumber of vi plans available:" +count3);
						System.out.println("\nEnter your plan id:");
						planId=sn.nextInt();
						ActivePlanDao dao4=new ActivePlanDao();
						ActivePlan plan4=dao4.activePlan(planId,mobileNo,company.toLowerCase());
						System.out.println("Your recharge is Successful with plan:"+plan4);
						try {
							File file = new File("E:/Symbi/IoStreamtxt file/Receipt.txt");
							FileWriter fw = new FileWriter(file,true);
						
						fw.write(sb4.toString());
						
						fw.close();
						
						}
						catch(Exception e) {
							e.getStackTrace();
						}
						break;
					}
					
				}
				
				break;		
			default:
				System.out.println("Invalid Request");
				break;
			}
			System.out.println("Thank you for Using Recharge app");
			System.out.println("Do you want to continue?(Y/N)");
			choice = sn.next();
		} while (choice.equalsIgnoreCase("y"));
			
	}

}
