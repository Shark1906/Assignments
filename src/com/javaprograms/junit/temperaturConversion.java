package com.javaprograms.junit;

import java.util.Scanner;

public class temperaturConversion {
	public static final int CELCIUS = 1;
	public static final int FARENHIET = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Celsius to Fahrenheit");
		System.out.println("Enter 2 for Fahrenheit to Celsius");
		int option = sc.nextInt();
		double input;
		double output;
		
		
		switch (option) {
		case CELCIUS:
			System.out.println("Enter the temperature in Celcius");
			input = sc.nextDouble();
			output = (input * 9/5) + 32;
			System.out.println(input + " deg. Celcius : " + output + " deg. Farenhiet");
			break;

		case FARENHIET:
			System.out.println("Enter the temperature in Farenhiet");
			input = sc.nextDouble();
			output = (input - 32) * 5/9;
			System.out.println(input + " deg. Farenhiet : " + output + " deg. Celcius");
			break;
			
		default:
			break;
		}
		sc.close();
	}
}
