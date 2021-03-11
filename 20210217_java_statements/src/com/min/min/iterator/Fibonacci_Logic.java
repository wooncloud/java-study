package com.min.min.iterator;

import java.util.Scanner;

/**
 * 피보나치 수열 만들기<br>
 * 초기값으로 주어진 두개의 수를 합한 값을 다시 이전의 마지막 수와 더해서 진행되는 수열
 */
public class Fibonacci_Logic {

	public static void main(String[] args) {

		System.out.println("피보나치 수열의 갯수를 적어주세요.");
		Scanner scan = new Scanner(System.in);
		int inNum = scan.nextInt();

		int num1 = 1;
		int num2 = 2;
		int num3 = 0;
		
		System.out.printf("%d\t %d\t", num1, num2);

		for (int i = 0; i < inNum - 3; i++) {
			num3 = num1 + num2;
			
			System.out.printf("%d\t", num3);
			
			num1 = num2;
			num2 = num3;
		}
	}
}