package com.app.bean;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ActivePlan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String planName;
	private String cardName;
	private double amount;
	private long mobileNo;
	private LocalDate activePlanDate;
	private LocalDate expireDate;
	private int validity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getActivePlanDate() {
		return activePlanDate;
	}
	public void setActivePlanDate(LocalDate activePlanDate) {
		this.activePlanDate = activePlanDate;
	}
	public LocalDate getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public ActivePlan(int id, String planName, String cardName, double amount, long mobileNo, LocalDate activePlanDate,
			LocalDate expireDate, int validity) {
		super();
		this.id = id;
		this.planName = planName;
		this.cardName = cardName;
		this.amount = amount;
		this.mobileNo = mobileNo;
		this.activePlanDate = activePlanDate;
		this.expireDate = expireDate;
		this.validity = validity;
	}
	@Override
	public String toString() {
		return "ActivePlan [id=" + id + ", planName=" + planName + ", cardName=" + cardName + ", amount=" + amount
				+ ", mobileNo=" + mobileNo + ", activePlanDate=" + activePlanDate + ", expireDate=" + expireDate
				+ ", validity=" + validity + "]";
	}
	public ActivePlan() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}
