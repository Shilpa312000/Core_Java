package com.Exception;

public class Account {
private float bal;
 public Account(float bal) {
	 this.bal=bal;
 }
@Override
public String toString() {
	return "bal=" + bal;
}
public float getBal() {
	return bal;
}
public void setBal(float bal) {
	this.bal = bal;
}
public void deposit(float amt) {
	this.bal+=amt;
	System.out.println("Total balance:"+amt);
}
public void withdraw(float amt)throws AccountException {
	if(amt>this.bal) {
		throw new AccountException("Balance is insufficent");
		
	}
	this.bal-=amt; 
}
}
