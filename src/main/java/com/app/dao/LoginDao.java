package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.app.dto.UserProfile;
import com.app.model.RechargeInfo;
import com.app.model.User;

import com.app.dto.UserProfile;
import com.app.dto.loginDto;
import java.sql.PreparedStatement;
import com.app.model.User;

import com.app.dto.UserProfile;
import com.app.dto.loginDto;
import com.app.model.User;

public class LoginDao {
	Connection con=null;
	PreparedStatement pstmt=null;
	public LoginDao(){
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jiotel","root","");
			
		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
public UserProfile login(loginDto user)throws Exception {
	pstmt=con.prepareStatement("select * from user where userName=? and password=?");
	pstmt.setString(1, user.getUserName());
	pstmt.setString(2, user.getPassword());
	ResultSet rs=pstmt.executeQuery();
	UserProfile userProfile=new UserProfile();
	if(rs.next()) {
		userProfile.setName(rs.getString("userName"));
		userProfile.setEmail(rs.getString("email"));
		userProfile.setMobile(rs.getLong("mobile"));
		userProfile.setRole(rs.getString("role"));
		userProfile.setMsg("Welcome to your profile ." + rs.getString("userName")+" login Successfully.");
		userProfile.setFlag(true);
		RechargeInfo recharge=new RechargeInfo();

	//	recharge.Menu();
	}
	else {
		System.out.println("Sorry you are not Register user need to register first");
//		userProfile.setFlag(false);
	}
	return userProfile;
}
}
