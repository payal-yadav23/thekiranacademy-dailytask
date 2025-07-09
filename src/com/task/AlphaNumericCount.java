package com.task;

import java.util.Scanner;

public class AlphaNumericCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any alphaNumeric String: ");
		String str = sc.next();
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= '0' && ch <= '9') {
				sum += ch - '0';
			}
		}

		System.out.println("Sum of digits Numbers: " + sum);
	}
}
