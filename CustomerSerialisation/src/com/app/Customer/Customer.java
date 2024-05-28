package com.app.Customer;

import java.io.Serializable;
import java.time.LocalDate;


public class Customer implements Serializable{
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private double reg_amt;
	private LocalDate dob;
	private Plan_cust services;
	private static int idGenerator;
	public Customer(int id,String fname,String lname,String email,String password,double reg_amt,LocalDate dob,Plan_cust services) {
		super();
		this.fname=fname;
		this.lname=lname;
		this.email=email;
		this.password=password;
		this.reg_amt=reg_amt;
		this.dob=dob;
		this.services=services;
		this.id=++idGenerator;
	}

	
//constructor for email
	public Customer(String email) {
		this.email=email;
//		this.password=password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
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

	public double getReg_amt() {
		return reg_amt;
	}

	public void setReg_amt(double reg_amt) {
		this.reg_amt = reg_amt;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Plan_cust getServices() {
		return services;
	}

	public void setServices(Plan_cust services) {
		this.services = services;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", password="
				+ password + ", reg_amt=" + reg_amt + ", dob=" + dob + ", services=" + services + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		System.out.println("In customer account equals");
		
		if(o instanceof Customer) {
			Customer c=(Customer)o;
			return this.email.equals(c.email);
		}
		
		return false;
		
	}


	}


