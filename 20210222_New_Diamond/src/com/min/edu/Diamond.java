package com.min.edu;

public class Diamond {
	int temp = 0;
	int mid = 0;

	public void calDiamond(int n) {
		mid = n / 2;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < Math.abs(mid - i); j++) {
				System.out.print(" ");
			} // 공백

			for (int j = 0; j < (i * 2) + 1; j++) {
				System.out.print("*");
			} // 그림

			System.out.println();

		}
	}
}
