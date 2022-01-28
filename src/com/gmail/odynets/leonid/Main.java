package com.gmail.odynets.leonid;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter year: ");
		Scanner sc = new Scanner(System.in);
		int year;
		year = sc.nextInt();
		int forSure;
		forSure = year % 400;
		int fourNumberSure;
		fourNumberSure = year % 4;
		int hundred;
		hundred = year % 100;

		if (fourNumberSure == 0 && hundred != 0) {
			System.out.println("Leap year! 366 days.");
		} else if (forSure == 0) {
			System.out.println("Leap year! 366 days.");
		} else {
			System.out.println("Not leap year! 365 days.");
		}
	}

}
