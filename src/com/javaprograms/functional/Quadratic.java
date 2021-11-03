package com.javaprograms.functional;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a=sc.nextDouble();
		System.out.println("Enter the value of b");
		double b = sc.nextDouble();
		System.out.println("Enter the value of c");
		double c = sc.nextDouble();
		
		double delta = Math.pow(b, b)-4*a*c;
		double root1 = (-b+Math.sqrt(delta))/(2*a);
		double root2 = (-b-Math.sqrt(delta))/(2*a);
		
		System.out.println("Root 1 of x : "+root1);
		System.out.println("Root 2 of x : "+root2);
		
		sc.close();
	}

}
