package com.javaprograms.logical;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 1 ;
		int NO_OF_TERMS = 10;
		
		for (int i = 0; i < NO_OF_TERMS; i++) {
			
			System.out.println(num1);
			int num3=num2+num1;
			num1=num2;
			num2=num3;
			
		}
	}

}
