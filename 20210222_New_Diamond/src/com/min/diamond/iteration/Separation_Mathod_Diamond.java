package com.min.diamond.iteration;

public class Separation_Mathod_Diamond {

	public static int n = 4;

	public static void iterationMethod() {

		for (int i = 1; i < n; i++) {
			shapeMethod(i);
		}

		for (int i = n; i > 0; i--) {
			shapeMethod(i);
		}
	}

	public static void shapeMethod(int i) {
		
		for (int j = 0; j < (n - i); j++) {
			System.out.print(" ");
		}
		for (int j = 0; j < (2 * i) - 1; j++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
}
