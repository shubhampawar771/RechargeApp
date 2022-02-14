package com.app.dto;

public class Plan {
	private int planId;
	private String cardName;
	private double amount;
	private int validity;
	private String packegeName;
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public String getCardName() {
		return cardName;
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
	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", cardName=" + cardName + ", amount=" + amount + ", validity=" + validity
				+ ", packegeName=" + packegeName + "]";
	}
	public Plan(int planId, String cardName, double amount, int validity, String packegeName) {
		super();
		this.planId = planId;
		this.cardName = cardName;
		this.amount = amount;
		this.validity = validity;
		this.packegeName = packegeName;
	}
	public Plan() {
		super();
		// TODO Auto-generated constructor stub
	}
}
