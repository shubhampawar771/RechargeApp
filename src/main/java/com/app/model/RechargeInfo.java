package com.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RechargeInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int planId;
	private String cardName;
	private double amount;
	private int validity;
	private String packegeName;
	public String getCardName() {
		return cardName;
	}
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	public String getPackegeName() {
		return packegeName;
	}
	public void setPackegeName(String packegeName) {
		this.packegeName = packegeName;
	}
	public RechargeInfo(String cardName, double amount, int validity, String packegeName) {
		super();
		this.cardName = cardName;
		this.amount = amount;
		this.validity = validity;
		this.packegeName = packegeName;
	}
	public RechargeInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RechargeInfo [planId=" + planId + ", cardName=" + cardName + ", amount=" + amount + ", validity="
				+ validity + ", packegeName=" + packegeName + "]";
		

	}
	public static Object stream() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
