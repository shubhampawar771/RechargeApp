package com.app.dto;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.model.RechargeInfo;
import com.app.model.User;

public class RequestDto {
	Scanner sn=new Scanner(System.in);
	public User registeRequest() {
		System.out.println("Enter your userName:");
		String uname=sn.next();
		System.out.println("Enter your email:");
		String email=sn.next();
		System.out.println("Enter your password:");
		String password=sn.next();
		System.out.println("Enter your mobile:");
		long mobile=sn.nextLong();
		System.out.println("Enter your address:");
		String address=sn.next();
		System.out.println("Enter your role:");
		String role=sn.next();
		return new User(uname, email, password, address, mobile,role);

	}
	public loginDto loginRequest() {
		System.out.println("Enter your userName:");
		String uname=sn.next();
		System.out.println("Enter your password:");
		String password=sn.next();
		return new loginDto(uname,password);
	}
	public RechargeInfo addRecharge() {
		// TODO Auto-generated method stub
		System.out.println("Enter your card Name:");
		String cardname=sn.next();
		System.out.println("enter your amount:");
		double amount=sn.nextDouble();
		System.out.println("Enter your validity:");
		int validity=sn.nextInt();
		System.out.println("Enter your package:");
		String packageName=sn.next();
	RechargeInfo info=new RechargeInfo(cardname, amount, validity, packageName);
		return info;
	}

}
