package com.javaprograms.basic;

public class Flipcoin {

	public final static int NO_OF_EVENTS =10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tails=0;
		int heads=0;
		for (int i = 0; i < NO_OF_EVENTS; i++) {
			
			double randomNumber = Math.random();
			if(randomNumber < 0.5)
			{
				tails++;
			}
			else
			{
				heads++;
			}
				
		}
	
		double headpercent = (double)heads/NO_OF_EVENTS*100;
		double tailpercent = (double)tails/NO_OF_EVENTS*100;
		System.out.println("HEADPERCENT-"+headpercent+" TAILPERCENT-"+tailpercent);
	

	}

}
