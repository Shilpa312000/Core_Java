package com.Exception;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1=new Account(10000);
		try
		{
			System.out.println(acc1);
			acc1.withdraw(11000);
		}
		catch(AccountException e) {
			System.out.println(e.getMessage());
			
		}
		finally
		{
			System.out.println(acc1);
		}
		}
	}


