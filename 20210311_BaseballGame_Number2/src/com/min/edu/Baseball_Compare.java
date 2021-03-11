package com.min.edu;

public class Baseball_Compare {

	private int[] comBall;
	private int[] userBall;
	
	public void setComBall(int[] comBall) {
		this.comBall = comBall;
	}
	public void setUserBall(int[] userBall) {
		this.userBall = userBall;
	}
	
	// 같은 index의 같은 값이라면 strike
	public int strike() {
		int cnt = 0;
		for (int i = 0; i < comBall.length; i++) {
			if(comBall[i] == userBall[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	
	// 다른 index의 같은 값이라면 ball
	public int ball() {
		int cnt = 0;
		for (int i = 0; i < comBall.length; i++) {
			for (int j = 0; j < comBall.length; j++) {
				if(i != j && comBall[i]==userBall[j]) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
}
