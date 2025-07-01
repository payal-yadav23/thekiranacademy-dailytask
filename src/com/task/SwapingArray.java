package com.task;

public class SwapingArray {

	public static void main(String[] args) {

		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 100 };

		System.out.println("Swapped Array:");

		for (int i = 0; i < arr.length - 1; i += 2) {
			int a = arr[i];
			int b = arr[i + 1];

			System.out.print(b + " " + a + " , ");
		}
	}
}
