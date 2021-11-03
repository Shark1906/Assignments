package com.javaprograms.basic;
import java.util.Scanner;
public class Swapnumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1");
		int number1=sc.nextInt();
		System.out.println("Enter number2");
		int number2=sc.nextInt();
		System.out.println("Before Swaping Number1:"+number1+" Number2:"+number2);
		
		int temp=number1;
		number1=number2;
		number2=temp;
		
		System.out.println("After Swaping Number1:"+number1+" Number2:"+number2);
		sc.close();
	}

}
