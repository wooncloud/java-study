package com.min.nine;

public class NineNine {

	public static void main(String[] args) {

		for (int i = 1; i < 9; i++) {
			System.out.println((i + 1) + "단");

			for (int j = 0; j < 9; j++) {
				int num1 = i + 1;
				int num2 = j + 1;

				System.out.printf("\t%d X %d = %d\n", num1, num2, num1 * num2);
			}

			System.out.println();
		}
	}
}