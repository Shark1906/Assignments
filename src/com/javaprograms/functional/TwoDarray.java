package com.javaprograms.functional;

import java.util.Scanner;

public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Rows");
		int row = sc.nextInt();
		System.out.println("Enter No. of Coloumns");
		int coloumn = sc.nextInt();

		int[][] twodarray = new int[row][coloumn];

		for (int i = 0; i < twodarray.length; i++) {
			for (int j = 0; j < twodarray[i].length; j++) {
				System.out.println("Enter element for [" + i + "][" + j + "] position");
				int element = sc.nextInt();
				twodarray[i][j] = element;
			}

		}

		for (int i = 0; i < twodarray.length; i++) {
			for (int j = 0; j < twodarray[i].length; j++) {
				System.out.print(twodarray[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
