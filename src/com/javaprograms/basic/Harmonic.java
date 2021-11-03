package com.javaprograms.basic;

public class Harmonic {
	
	public static void main(String[] args) {
	
	int nth_term = 32;
	double har_num=0;
	
	for(int i=1; i<=nth_term; i++) {
		double temp=(double)1/i;
		har_num+=temp;
	}
	System.out.println(har_num);
	}

}
