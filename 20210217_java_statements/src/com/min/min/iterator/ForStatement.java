package com.min.min.iterator;

public class ForStatement {

	public static void main(String[] args) {

		int sum = 0, i = 0;
		for (; i < 10; i++) {
			sum += (i + 1);
			System.out.printf("%d번째 누적 진행값 : %d\n", i, sum);
		}

		System.out.printf("%d번째 최종값 : %d", i, sum);
	}
}