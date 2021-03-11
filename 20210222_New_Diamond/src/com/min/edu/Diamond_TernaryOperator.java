package com.min.edu;

public class Diamond_TernaryOperator {
	int temp = 0;
	int mid = 0;

	public int ternaryOperator(int n) {

//		if (n > 5) {
//			System.out.println("안녕하세요 5 이하 님");
//		} else {
//			return 100;
//		}

		temp = (n > 5) ? 20 : 40;
		return temp;
	}

	// -------------------------------------

	public void Diamond(int n) {
		mid = n / 2;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < mid - temp; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < temp * 2 + 1; j++) {
				System.out.print("*");
			}

			System.out.println();

			
			if (check(i, mid)) {
				temp++;
			} else {
				temp--;
			}
		}
	}

	private boolean check(int i, int mid2) {
		return (i < mid2) ? true : false;
	}

}
