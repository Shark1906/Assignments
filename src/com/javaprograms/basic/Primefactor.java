package com.javaprograms.basic;

public class Primefactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 42;
		int count=0;
		
		for(int i=2; i<=num; i++) 
		{
			if(num%i==0) 
			{
				for(int j=1; j<=i; j++) 
				{
				if(i%j==0) 
				{
					count++;
				}
				}
			}
			
			if(count==2) 
			{
			 System.out.println("Prime factors of "+num+":"+i);	
			}
			count=0;
		}

	}

}
