package com.woon.amicable;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int orgNum = scan();

		AmicableNumbers an = new AmicableNumbers();
		int result = an.amicableNumbersProcess(orgNum);

		print(orgNum, result);
	}

	/**
	 * 친화수가 있는지 없는지 판단하고 출력함.
	 * 
	 * @param num
	 * @param result 친화수 메소드 연산 결과
	 */
	private static void print(int num, int result) {

		if (result == -1) {
			System.out.printf("%d의 친화수는 없음", num);
		} else {
			System.out.printf("%d의 친화수는 %d 입니다.", num, result);
		}

	}

	private static int scan() {
		Scanner scan = new Scanner(System.in);
		System.out.print("친화수 구하고 싶은 수를 입력하세요. : ");

		int getNum = scan.nextInt();
		return getNum;
	}
}
