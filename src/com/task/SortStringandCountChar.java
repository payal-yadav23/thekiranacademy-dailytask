package com.task;

import java.util.Scanner;

public class SortStringandCountChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter password: ");
		String str = sc.next();
		char ch;
		String alpha = "";
		String digit = "";
		String specials = "";

		for (int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);

			if (Character.isLetter(ch)) {
				alpha += ch;

			} else if (Character.isDigit(ch)) {
				digit += ch;
			} else {
				specials += ch;
			}
		}
		int a1 = alpha.length();
		int d1 = digit.length();
		int s1 = specials.length();
		System.out.println("Alphabets: " + alpha + " -> Count: " + a1);
		System.out.println("Digits: " + digit + "  -> Count: " + d1);
		System.out.println("Special Characters: " + specials + " -> Count: " + s1);

	}

}
