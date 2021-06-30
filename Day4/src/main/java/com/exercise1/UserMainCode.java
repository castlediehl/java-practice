package com.exercise1;

import java.util.Scanner;

public class UserMainCode {

	public int checkCharacters() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = scan.nextLine();
		scan.close();

		// find string length
		int n = s1.length();

		// find first character
		char first = s1.charAt(0);

		// find last character
		char last = s1.charAt(n - 1);

		// compare first and last characters of string, disregard case
		if (Character.toLowerCase(first) == Character.toLowerCase(last)) {
			System.out.println("Valid");
			return 1;
		}
		System.out.println("Invalid");
		return -1;

	}
}
