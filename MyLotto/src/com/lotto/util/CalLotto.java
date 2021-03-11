package com.lotto.util;

public class CalLotto {
	public static int calMoney(int money) {
		int gameCnt = 0;

		if (money < 1000) {
			System.err.println("[ 금액이 부족합니다. 안녕히 가세요. ^^ ]\n");
		} else {
			printChange(money);
			gameCnt = getGameCnt(money);
		}

		return gameCnt;
	}

	private static void printChange(int money) {
		System.out.printf("[잔돈 : %d원 입니다.]\n\n", money % 1000);
	}

	private static int getGameCnt(int money) {
		return money / 1000;
	}
}
