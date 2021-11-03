package com.javaprograms.basic;

import java.util.Scanner;

public class Alphabet {

	static String[] vowel = { "a", "e", "i", "o", "u" };
	static String[] consonent = { "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v",
			"w", "x", "y", "z" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Alphabet");
		String ch = sc.next();

		for (int i = 0; i < vowel.length; i++) {
			if (vowel[i].equalsIgnoreCase(ch)) {
				System.out.println(ch + " is Vowel");
			}
		}

		for (int i = 0; i < consonent.length; i++) {
			if (consonent[i].equalsIgnoreCase(ch)) {
				System.out.println(ch + " is Consonent");
			}
		}
		sc.close();

	}

}
