package com.app.CustomerSorting;

import java.util.Comparator;

import com.app.Customer.Customer;

public class CustomerDOB_LastName_Comparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		System.out.println("In comapre date and lastname ");
		int retval=o1.getDob().compareTo(o2.getDob());
		if(retval==0) {
			if(o1.getLname()==o2.getLname())
				return 1;
			if(o1.getLname().equals(o2.getLname()))  
				return 0;
			return -1;
		}
		return retval;
	}

}
