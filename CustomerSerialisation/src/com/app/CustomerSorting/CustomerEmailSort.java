package com.app.CustomerSorting;

import java.util.Comparator;

import com.app.Customer.Customer;

public class CustomerEmailSort implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		System.out.println("In compare email ");
		return c1.getEmail().compareTo(c2.getEmail());
	}

}
