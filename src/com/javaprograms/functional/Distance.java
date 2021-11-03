package com.javaprograms.functional;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of X");
		int x = sc.nextInt();
		System.out.println("Enter value of Y");
		int y = sc.nextInt();
		
		double euclidean_dist=Math.sqrt(Math.pow(x, x)+Math.pow(y, y));
		System.out.println("Euclidean Distance from origin(0,0) : "+euclidean_dist);
		
		sc.close();
	}

}
