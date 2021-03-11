package com.min.edu;

public class Diamond_IF {

	int temp = 0;
	int mid = 0;

	public void calDiamond(int n) {
		mid = n / 2;
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < mid - temp; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < (temp * 2) + 1; j++) {
				System.out.print("*");
			}

			if (chkStage(i, mid)) {
				temp++;
			} else {
				temp--;
			}

			System.out.println();
		}

	}

	private boolean chkStage(int i, int mid2) {
		boolean isc = false;

		if (i < mid2) {
			isc = true;
		}

		return isc;
	}

}
