package com.baseball.game;

import java.util.Arrays;

public class GameMain {

	public static void main(String[] args) {
		int a = 4;
		int start = 1;
		int end = 9;
		String result = "";
		int playCount = 0;

		UserPitcher pitcher = new UserPitcher();
		Catcher catcher = new Catcher(a, start, end);

//		System.out.println(Arrays.toString(catcher.getRandomBall()));

		System.out.println("[ == BaseBall Game == ]");
		
		do {
			System.out.println();
			System.out.printf("\n[ -- %d번째 게임 -- ] \n", ++playCount);
			int[] userBall = pitcher.input(a, start, end, false); // 중복허용
			System.out.printf("내가 입력한 번호 : %s\n", Arrays.toString(userBall));

			result = catcher.compare(userBall);
			System.out.printf("결과 : %s", result);
		} while (result.indexOf("3S") == -1);
		
		System.out.println(" -- 축하합니다. -- ");
	}

}
