package com.min.edu;

public class ForMain {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = new int[3];
		int[] a3 = new int[] { 1, 2, 3, 4 };

		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}

		for (int i : a1) {
			System.out.println(i);
		}
	}

}
