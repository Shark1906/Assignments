package com.javaprograms.basic;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		if(number>0 && number<31) {
			
		for(int i=1; i<=number; i++) {
		System.out.println((int)Math.pow(2,i));	
		}
		}
		sc.close();
	}

}
