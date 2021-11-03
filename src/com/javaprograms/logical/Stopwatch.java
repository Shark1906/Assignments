package com.javaprograms.logical;

import java.util.Scanner;
import java.time.Duration;
import java.time.Instant;

public class Stopwatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Press Enter to start");
		sc.nextLine();
		Instant start = Instant.now();
		System.out.println("Press Enter to stop");
		sc.nextLine();
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		System.out.println("Time Elapsed : " + timeElapsed + " Milliseconds");
		sc.close();
	}

}
