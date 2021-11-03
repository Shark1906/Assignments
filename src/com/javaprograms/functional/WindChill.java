package com.javaprograms.functional;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Farenhiet");
		double t = sc.nextDouble();
		System.out.println("Enter the speed of wind");
		double v = sc.nextDouble();
		
		double w = (35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16));
		System.out.println("WindChill : "+w);
		
		sc.close();

	}

}
