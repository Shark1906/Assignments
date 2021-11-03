package com.javaprograms.basic;
import java.util.Scanner;
public class Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			max=num1;
		}
		else if(num2>num1 && num2>num3)
		{
			max=num2;
		}
		else if(num3>num1 && num3>num2) 
		{
			max=num3;
		}
		System.out.println("largest number :"+max);
		sc.close();
	}

}
