package com.app.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class User {
@Id 
@GeneratedValue
private int id;
private String userName;
private String email;
private String password;
private String address;
private long mobile;
private String role;

public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public User( String userName, String email, String password, String address, long mobile, String role) {
	super();

	this.userName = userName;
	this.email = email;
	this.password = password;
	this.address = address;
	this.mobile = mobile;
	this.role = role;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User [id=" + id + ", userName=" + userName + ", email=" + email + ", password=" + password + ", address="
			+ address + ", mobile=" + mobile + ", role=" + role + "]";
}


}
