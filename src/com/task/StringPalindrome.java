package com.task;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String: ");

		String input = sc.nextLine();
		String reverse = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);
		}

		if (reverse.equals(input)) {
			System.out.println("String is palindrome..");
		} else {
			System.out.println("String is not palindrome..");
		}

	}

}
