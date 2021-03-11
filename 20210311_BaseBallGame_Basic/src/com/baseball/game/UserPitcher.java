package com.baseball.game;

import java.util.InputMismatchException;
import java.util.Scanner;

// 사용자가 키보드로 입력한 숫자를 받는다.
public class UserPitcher {

	// boolean을 arguments로 사용하여 중복이 됐을경우와 아닐경우를 구분함.
	// boolean값에 따라서 결과를 처리함.
	// true면 중복허용 / false 중복 비허용
	public int[] input(int a, int start, int end, boolean ch) {
		// null 오버로딩됨 input 메소드에서 배열을 만들어 반환해주기 때문에 이 메소드에서는 연산
		int[] inputBall = input(a, start, end);

		if (!ch) {
			while (true) {

				if (arrCheck(inputBall)) {
					System.out.println("중복이 되었습니다.");
				} else {
					// 중복이 없을 경우 만들어진 inputBall을 while문을 중지시키고 반환
					break;
				}
			}
		}

		return inputBall;
	}

	// 배열의 크기와, 범위를 가지고 있는 메소드
	public int[] input(int a, int start, int end) { // 배열의 크기, 시작범위, 끝범위
		int[] inputBall = new int[a];
		int count = 0; // 입력되는 배열의 index 번호로 사용.
		// 유효성

		int n = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {
			try {
				System.out.println((count + 1) + "번째 숫자를 입력해 주세요.");
				n = scan.nextInt();

				if (n >= start && n <= end) {
					inputBall[count] = n;
					count++;
				} else {
					System.err.println("범위를 벗어났습니다.");
				}

				if (count >= a) {
					break;
				}
			} catch (InputMismatchException e) {
				System.err.println("잘못된 형식으로 입력 되었습니다. 다시 입력해 주세요.");
			}
		}

		return inputBall;
	}

	private boolean arrCheck(int[] checkBall) {
		boolean isc = false;

		for (int i = 0; i < checkBall.length; i++) { // 기준이 되는 index 번호
			for (int j = 0; j < checkBall.length; j++) { // 비교할 index 번호
				// 자신의 배열을 확인하기 때문에 같은 index를 비교대상에서 빠져야 함.

				if (i != j && checkBall[i] == checkBall[j]) {
					isc = true;
				}
			}
		}

		return isc;
	}
}
