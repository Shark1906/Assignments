package com.javaprograms.junit;

import java.util.Scanner;

public class dayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		int d = sc.nextInt();
		System.out.println("Enter the month");
		int m = sc.nextInt();
		System.out.println("Enter the year");
		int y = sc.nextInt();
		
		int y0 = y - ((14 - m) / 12);
		int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		
		switch (d0) {
		case 1:
			System.out.println("MONDAY");
			break;
		
		case 2:
			System.out.println("TUESDAY");
			break;
		
		case 3:
			System.out.println("WEDNESDAY");
			break;
		
		case 4:
			System.out.println("THURSDAY");
			break;
		
		case 5:
			System.out.println("FRIDAY");
			break;
		
		case 6:
			System.out.println("SATURDAY");
			break;
		
		default:
			System.out.println("SUNDAY");
			break;
		}
		
		sc.close();
	}
}
