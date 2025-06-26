package com.task;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	Scanner sc = new Scanner(System.in);

	public void m1() {

		System.out.println("Enter any  String: ");
		String str1 = sc.next();

		String alpha = "";
		String digit = "";
		String specials = "";

		for (int i = 0; i < str1.length(); i++) {

			char a = str1.charAt(i);

			if (Character.isLetter(a)) {
				alpha = alpha + a;
			} else if (Character.isDigit(a)) {
				digit = digit + a;
			} else {
				specials = specials + a;
			}
		}

		alpha = sortString(alpha);
		digit = sortString(digit);
		specials = sortString(specials);

		System.out.println("Alphabets: " + alpha);
		System.out.println("Digits: " + digit);
		System.out.println("Special Characters: " + specials);

	}

	private String sortString(String str) {

		char[] arr = str.toCharArray();
		Arrays.sort(arr);

		return new String(arr);
	}

}
