package com.javaprograms.basic;

public class Quotientremainder {

	public static void main(String[] args) {
		
		int divisor=5;
		int dividend=47;
		int remainder;
		int quotient;
		
		remainder=dividend%divisor;
		quotient=dividend/divisor;
		System.out.println("Remainder : "+remainder);
		System.out.println("Quotient : "+quotient);
	}

}
