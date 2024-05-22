package com.app.Functionalstreams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test1 {
public  static void main(String[]args) {
	int[]data= {1,2,3,4,5,-100,89,76};
	//attach IntStream to the array
	//display the array using functional IntStream api
//	public static IntStream(int[]array){
//		
//	}
	Arrays.stream(data).forEach(i->System.out.println(i+" "));
	System.out.println();
	//display the even element using stream
	System.out.println("Even numbers:-");
	Arrays.stream(data).filter(i->i%2==0)
	.forEach(i->System.out.println(i+" "));
	
	//display all the
}
}
