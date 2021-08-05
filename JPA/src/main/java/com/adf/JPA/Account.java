package com.adf.JPA;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "findAccountNo", query = "Select ac from Account ac")
public class Account {
	
	@Id
	private int acc_id;
	private long acc_no;
	private String name;
	private String type;
	private int balance;
	private int fee;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(int acc_id, long acc_no, String name, String type, int balance, int fee) {
		super();
		this.acc_id = acc_id;
		this.acc_no = acc_no;
		this.name = name;
		this.type = type;
		this.balance = balance;
		this.fee = fee;
	}
	
	public int getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	@Override
	public String toString() {
		return "Account [acc_id=" + acc_id + ", acc_no=" + acc_no + ", name=" + name + ", type=" + type + ", balance="
				+ balance + ", fee=" + fee + "]";
	}
}
