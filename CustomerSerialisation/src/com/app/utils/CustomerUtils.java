package com.app.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.app.Customer.Customer;
import com.app.Customer.Plan_cust;
import com.app.CustomerException.customerException;

public class CustomerUtils {
public static List<Customer>populateCustomer(){

	int index;
	List<Customer> customers = new ArrayList<>(
			Arrays.asList(new Customer(1,"shilpa","kale","shilpakale@gmail.com","fgvh13342",3000,LocalDate.parse("1998-09-19"),Plan_cust.DIAMOND),
	new Customer(2,"shital","kale","shitalkale@gmail.com","lokljkj1432",4000,LocalDate.parse("2000-09-19"),Plan_cust.PLATINUM),
	new Customer(3,"vikram","Batra","shilpakale@gmail.com","jfdh121",5000,LocalDate.parse("1996-09-19"),Plan_cust.SILVER)));
	
	customers.forEach(s -> System.out.println(s));
	index=0;
	return customers;
	
}

public static List<Customer> populateMap(List<Customer> 
list1) {
	List<Customer> customers = new ArrayList<>();
	//declarative (FP) 
	list1.forEach(s ->s.getEmail());
	return list1;

}

public static Customer checkSignIn(String email,String password,List<Customer>custList) throws customerException {
	//create customer instance--wrapping email
	Customer c=new Customer(email);
	int index = custList.indexOf(c);
	if(index == -1)
		throw new  customerException("Invalid email,Login failed!!");
	Customer customer=custList.get(index);
	customerValidation.strongPasswordSet(password);
	if(customer.getPassword().equals(password))
	
return customer;
throw new customerException("Invalid password,Login failed!!");
	
}

public static String deleteCustomer(String email, List<Customer> custList) throws customerException {
	//removal by primary key use remove(index) or remove(object)
	int index=custList.indexOf(new Customer(email));
	if(index == -1)
		throw new customerException("Invalid email can't delete!!");
	return "Remove details of"+custList.remove(index).getFname();	
}

public static void writeDetails(List<Customer> customer, String filename) throws IOException {
	
	try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
		out.writeObject(customer);// serialization
	} 
	
}

@SuppressWarnings("unchecked")
public static List<Customer> readDetails(String filename) throws  IOException, ClassNotFoundException {
	try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
		return (List<Customer>)in.readObject();
	}
	
}


}
