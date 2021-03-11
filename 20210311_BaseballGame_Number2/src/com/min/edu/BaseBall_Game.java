package com.min.edu;

import java.util.Arrays;

// 선생님이 만든 클래스
public class BaseBall_Game {

	private Computer_Hitter hit;
	private User_Pitcher pit;
	private Baseball_Compare compare;
	
	public BaseBall_Game() {
		hit = new Computer_Hitter();
		pit = new User_Pitcher();
		compare = new Baseball_Compare();
	}

	public void playGame() {
		// 자동생성 computer 공 생성
		int[] hBall = hit.comBall(3);
		System.out.println("컴퓨터의 숫자 : "+Arrays.toString(hBall));
		// 비교판단 클래스에서 hBall을 입력
		compare.setComBall(hBall);
		while(true) {
			int[] uBall = pit.input(3, 1, 9, true);
			System.out.println("입력한 숫자는? "+Arrays.toString(uBall));
			compare.setUserBall(uBall);
			
			int s = compare.strike();
			int b = compare.ball();
			
			System.out.printf("경기의 결과는? %d S %d B\n",s, b);
			
			//종료조건
			if(s == 3) {
				System.out.println("You Win~~~~~~!!!");
				break;
			}
		}
		
		
	}
	
}
