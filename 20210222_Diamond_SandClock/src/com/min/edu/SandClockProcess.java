package com.min.edu;

public class SandClockProcess {
	public void sandUp(int stage) {
		for (int i = 0; i < stage; i++) {
			int dec = stage - i;

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < (dec * 2) - 1; j++) {
				System.out.print("*");
			}

			System.out.println();

		}
	}

	public void sandDown(int stage) {
		for (int i = 1; i < stage; i++) {
			int temp = i + 1;

			for (int j = 0; j < stage - temp; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < (2 * i) + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public void printSandClock(int stage) {
		sandUp(stage);
		sandDown(stage);
	}
}
