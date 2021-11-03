package com.javaprograms.logical;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if(number%i==0) {
				sum+=i;
			}	
		}
		
		if(sum==number) {
			System.out.println(number+" is a perfect number");
		}
		else {
			System.out.println(number+" is not a perfect number");
		}
		sc.close();
	}

}
