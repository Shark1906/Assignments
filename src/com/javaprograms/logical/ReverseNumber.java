package com.javaprograms.logical;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int sum = 0;
		
		while (number>0) {
			int temp = number % 10;
			sum = (sum*10) + temp;
			number = number/10;	
		}
		
		System.out.println(sum);
		sc.close();
	}

}
