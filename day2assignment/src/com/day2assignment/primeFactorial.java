package com.day2assignment;

public class primeFactorial {
	public static void main(String[] args) {
		int number = 14;
		for(int i = 2; i< number; i++) {
	        while(number%i == 0) {
	           System.out.println(i+" ");
	           number = number/i;
	        }
	     }
	     if(number > 2 && number < 100) {
	        System.out.println(number);
	     }
	     else {
	    	 System.out.println("Invalid number");
	     }
	}
}
