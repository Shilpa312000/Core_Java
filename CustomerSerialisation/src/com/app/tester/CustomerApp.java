package com.app.tester;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.Customer.Customer;
import com.app.CustomerSorting.CustomerDOB_LastName_Comparator;
import com.app.CustomerSorting.CustomerEmailSort;
import com.app.utils.CustomerUtils;
import com.app.utils.customerValidation;

public class CustomerApp {

	
		public static void main(String[] args) {
			try(Scanner sc=new Scanner(System.in)){
				boolean exit=false;
				System.out.println("Enter max number of customer  ");
				List<Customer>customer=CustomerUtils.populateCustomer();
				while(!exit) {
					System.out.println("----------mEnU-------");
					System.out.println("1.Sign up" +" "+ "2.Display Details"+" "+"3.Sign In"+""
							+ " "+"4.Change password"+" "+"5.Delete Customer"+""
							+ ""+"6.sorting by email"+" "+"7.sorting by dob and lastname"+""+"8.Save the file");
					try {
					switch(sc.nextInt()) {
					case 1:
						
							System.out.println("Enter customer details : "+"fname,lname,email,password,reg_amt,dob,services ");
							Customer custSer=customerValidation.validateInput(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next(),customer);
							customer.add(custSer);
							System.out.println("Registration completed!!");
							break;
						
					case 2:
						//display all the details of the customer
						System.out.println("the details are:");
						for(Customer c:customer) {
							System.out.println(c);
							
						}
							break;
							
					case 3:
						System.out.println("Enter email" + " enter password");
						System.out.println(CustomerUtils.checkSignIn(sc.next(), sc.next(), customer));
						System.out.println("Login Sucess!!");
								break;
								
					case 4:
						System.out.println("Enter email and old password");
						
						System.out.println("Enter New Password");
						//change password
						Customer customers=CustomerUtils.checkSignIn(sc.next(), sc.next(), customer);
						customers.setPassword(sc.next());
						System.out.println("password changed!!");
			 			
						break;
					case 5:
						System.out.println("Enter email to unsubscribe");
						CustomerUtils.deleteCustomer(sc.next(),customer);
						System.out.println("Deleted successfully!!");
						break;
						
					case 6:
						System.out.println("customer sorting by email ");
						Collections.sort(customer,new CustomerEmailSort());
						break;
					case 7:
						System.out.println("Customer sorting by dob and lastname ");
						Collections.sort(customer,new CustomerDOB_LastName_Comparator());
						break;
					
					case 8:
						System.out.println("Enter file name , to store customer details");
						CustomerUtils.writeDetails(customer, sc.nextLine());
						System.out.println("data stored ....");
						
						break;
					case 9:
						CustomerUtils.readDetails(sc.nextLine());
						System.out.println("Customer details -");
						customer.forEach((c)-> System.out.println(c));
						break;
						
					case 0:
								exit=true;
								break;
						
					}
				}
				catch(Exception e){
					System.out.println(e);
					sc.nextLine();
				}
				
			}
			
			}
		}

		

	}


