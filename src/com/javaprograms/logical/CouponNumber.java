package com.javaprograms.logical;

import java.util.Scanner;

public class CouponNumber {
	static int[] coupon;

	static int randomCoupon() {
		return (int)Math.floor(Math.random()*100);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N number of Coupon numbers");
		int N = sc.nextInt();
		coupon = new int[N];
		int count = 0;
		
		while(count != coupon.length) {
			int random = randomCoupon();
			if (!isPresent(random)) {
				coupon[count] = random;
				count++;
			}
		}
		
		for (int i = 0; i < coupon.length; i++) {
			System.out.print(coupon[i] + " ");
		}
		sc.close();
	}

	static boolean isPresent(int num) {
		for (int i = 0; i < coupon.length; i++) {
			if(coupon[i] == num) {
				return true;
			}
		}
		return false;
	}

}
