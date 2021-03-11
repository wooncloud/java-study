package com.min.util;

import java.util.Scanner;

public class InputVal {

	public static int resultInt() {
		int n = 0;

		while (true) {
			try {
				System.out.println("정수를 입력해 주세요.");
				java.util.Scanner scan = new Scanner(System.in);
				n = scan.nextInt();
				break;
			} catch (Exception e) {
				System.err.println(e.toString());
				System.out.println("숫자만 입력하세요.");
			}
		}
		return n;
	}

}
