package com.min.min.iterator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("피보나치 수열 길이를 입력하세요. : ");
		int cnt = scan.nextInt();

		System.out.println("1번째 값 : " + a);
		System.out.println("2번째 값 : " + b);
		
		for (int i = 0; i < cnt - 2; i++) {
			c = a + b;
			a = b;
			b = c;
			
			System.out.printf("%d번째 값 : %d\n", i + 2, c);
		}
	}
}