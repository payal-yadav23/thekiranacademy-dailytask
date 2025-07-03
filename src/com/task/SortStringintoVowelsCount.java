package com.task;

import java.util.Scanner;

public class SortStringintoVowelsCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] inputs = new String[5];

		// Taking 5 string inputs
		System.out.println("Enter 5 names:");
		for (int i = 0; i < 5; i++) {
			System.out.print("Input " + (i + 1) + ": ");
			inputs[i] = sc.next().toLowerCase();
		}

		System.out.println("\n--- Vowel Analysis ---");

		for (int i = 0; i < 5; i++) {
			String str = inputs[i];
			String vowels = "";
			int count = 0;

			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels += ch;
					count++;
				}
			}

			System.out.println("\nInput " + (i + 1) + ": " + str);
			System.out.println("Vowels: " + vowels);
			System.out.println("Vowel Count: " + count);
		}

		sc.close();
	}
}
