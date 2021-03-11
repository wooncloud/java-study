package com.min.edu;

import java.util.Arrays;

public class Process {

	public void playGame(int a) { // a : 배열크기(야구게임 숫자갯수) , 숫자의 범위는 1~9로 고정(up.input(a, 1, 9, boolean)
		// 랜덤 숫자
		Computer_Hitter ch = new Computer_Hitter();
		int[] comBall = ch.comBall(a);
		
		// 입력한 횟수
		int cnt = 0;
		
		while (true) {
			User_Pitcher up = new User_Pitcher();
			int[] userBall = up.input(a, 1, 9, false); // 숫자의 범위는 1~9로 고정
			// 비교
			Baseball_Compare compare = new Baseball_Compare();
			compare.setComBall(comBall);
			compare.setUserBall(userBall);
			int strike = compare.strike();
			int ball = compare.ball();
			// 출력
			System.out.printf("%dS %dB\n", strike, ball);
			cnt++;
			if(strike == a) {
				System.out.println("정답입니다.");
				break;
			}
			if(cnt == 9) {
				System.err.println("기회 9번 다 사용했습니다. 정답맞추기 실패");
				System.out.println("정답은 : "+Arrays.toString(comBall));
				break;
			}
		}
		System.out.println("총 횟수 : "+cnt);
		
	}
	
	
}
