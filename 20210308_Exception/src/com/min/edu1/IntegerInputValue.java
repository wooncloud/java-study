package com.min.edu1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerInputValue {

	public int inputVal() {
		int re = 0;

		while (true) {
			try {
				System.out.print("숫자를 입력해 주세요. : ");
				Scanner scan = new Scanner(System.in);
				re = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.err.println("잘못된 입력값 입니다.");
			}
		}

		return re;
	}
}
