package com.woon.edu;

public class Practice2 {

	public static void main(String[] args) {
		int cnt = 5;

		for (int i = 0; i < cnt; i++) {
			int temp = i + 1;
			
			for (int j = 0; j < cnt - temp; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < (temp * 2) - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
