package com.csi.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue	
	
	private int custId;
	
	private String custName;
	
	private long custContactNumber;
	
	private double custAccBalance;

	public Customer(String custName, long custContactNumber, double custAccBalance) {
		super();
		this.custName = custName;
		this.custContactNumber = custContactNumber;
		this.custAccBalance = custAccBalance;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public long getCustContactNumber() {
		return custContactNumber;
	}

	public void setCustContactNumber(long custContactNumber) {
		this.custContactNumber = custContactNumber;
	}

	public double getCustAccBalance() {
		return custAccBalance;
	}

	public void setCustAccBalance(double custAccBalance) {
		this.custAccBalance = custAccBalance;
	}
	
	
	
}	