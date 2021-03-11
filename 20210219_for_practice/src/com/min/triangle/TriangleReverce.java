package com.min.triangle;

public class TriangleReverce {

	public void generateTriangle() {

		int cnt = 4;
		for (int i = 0; i < cnt; i++) {

			for (int j = 0; j < (cnt - i); j++) {
				System.out.print("@");
			}

			System.out.println();

		}
	}
}