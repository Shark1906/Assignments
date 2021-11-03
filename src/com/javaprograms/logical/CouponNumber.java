package com.javaprograms.logical;

import java.util.Scanner;

public class CouponNumber {

	static int randomCoupon() {
		return (int)Math.floor(Math.random()*100);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N number of Coupon numbers");
		int N = sc.nextInt();
		int[] coupon = new int[N];
		
		for (int i = 0; i < coupon.length; i++) {
			coupon[i] = randomCoupon();
			for (int j = coupon.length-1; j >= 0 ; j--) {
				if(coupon[i] == coupon[j]) {
					coupon[i] = randomCoupon();
				}
			}
		}
		
		for (int i = 0; i < coupon.length; i++) {
			System.out.print(coupon[i] + " ");
		}
		sc.close();
	}

}
