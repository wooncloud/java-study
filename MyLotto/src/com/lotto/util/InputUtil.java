package com.lotto.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtil {

	public int inputInt() {
		int value = 0;

		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				value = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.err.println("[정수로 다시 입력하세요.]");
			}
		}
		return value;
	}

	public int[] inputLottoLine() {
		int[] oneLine = new int[6];

		for (int i = 0; i < oneLine.length;) {
			System.out.printf("> %d번째 번호 입력 : ", i + 1);
			int tmp = inputInt();
			
			// 범위 외 숫자인가?
			if (!(tmp > 0 && tmp < 46)) {
				System.err.println("\n[범위 외 숫자입니다. 다른 숫자를 입력하세요. (범위 : 1~45)]");
			}
			// 중복이 있는지 확인
			else if (Compare.containCheck(oneLine, tmp)) {
				System.err.println("\n[이미 있는 숫자입니다. 다른 숫자를 입력하세요.]");
			} else {
				oneLine[i] = tmp;
				i++;
			}
		}

		oneLine = SortArray.sort(oneLine);
		return oneLine;

	}
}
