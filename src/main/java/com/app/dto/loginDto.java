package com.app.dto;

public class loginDto {
	private String userName;
	private String password;
	private String role;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public loginDto(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
		
	}
	public loginDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "loginDto [userName=" + userName + ", password=" + password + ", role=" + role + "]";
	}  
	
}
