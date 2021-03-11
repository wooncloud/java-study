package com.min.edu;

import java.util.Scanner;

public class Diamond {

	public void printDiamond() {

		int cnt = getCnt();

		for (int i = 0; i < cnt; i++) {

			if (i < (cnt / 2)) {
				for (int j = 0; j < (cnt / 2) - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (2 * i) + 1; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < i - (cnt / 2); j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < ((cnt - i) * 2) - 1; j++) {
					System.out.print("*");
				}
			}

			System.out.println();
		}
	}
	
	private int getCnt() {
		Scanner scan = new Scanner(System.in);
		System.out.print("층수 입력 : ");
		return scan.nextInt();
	}
}
