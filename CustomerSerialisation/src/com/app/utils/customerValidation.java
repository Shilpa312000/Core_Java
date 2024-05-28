package com.app.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;

import com.app.Customer.Customer;
import com.app.Customer.Plan_cust;
import com.app.CustomerException.customerException;

public class customerValidation {
	public static void validatePlans(String type,double reg_amt) throws customerException {
		Plan_cust servicePlan=Plan_cust.valueOf(type.toUpperCase());
		if(servicePlan.getPlanCost()==reg_amt)
			throw new customerException("Invalid service plan ");
		System.out.println("vali8d service plan");
	}

	public static Customer validateInput(int id,String fname,String lname,String email,String password,double reg_amt,String dob,String services,List<Customer>cust)throws customerException{
		checkForDup(email, password, cust);
		Plan_cust servicePlan=Plan_cust.valueOf(services.toUpperCase());
		LocalDate dob1 = parseDate(dob);
		strongPasswordSet(password);
		checkValidAge(dob);
		return new Customer(id,fname,lname,email,password,reg_amt,dob1,servicePlan);
		
	}

	private static void checkForDup(String email, String password,List<Customer>customer) throws customerException {
//		Customer cust=new Customer(email);
		for(Customer c:customer) {
		if(c.equals(customer))
			throw new customerException("Duplicate email and password");
		}
	}

	private static LocalDate parseDate(String dob) {
		return LocalDate.parse(dob);
	}
	public static LocalDate checkValidAge(String date) throws customerException {  
		 LocalDate birthdate=parseDate(date);
		 int age=Period.between(birthdate, LocalDate.now()).getYears();
		if(age>21) 
			throw new customerException("Age is should be greater than 21!!");
		return birthdate;
	}

	public static void strongPasswordSet(String password) throws customerException {
		String regex="((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})";
		if(!password.matches(regex)) 
		System.out.println("Strong Password is set");	
		throw new customerException("NOT STRONG PASSWORD!!");
		

	}
	}



