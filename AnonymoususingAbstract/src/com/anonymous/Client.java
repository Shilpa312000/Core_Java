package com.anonymous;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmaticops a1=new Arithmaticops() {

			@Override
			public void calculate(int num1, int num2) {
				// TODO Auto-generated method stub
				System.out.println("the adddition of numbers is:"+(num1+num2));
			}
			
			@Override
			public void test() {
				System.out.println("addition is displayed");
				
			}
			
		};
		a1.calculate(12, 20);
		a1.test();
	}

}
