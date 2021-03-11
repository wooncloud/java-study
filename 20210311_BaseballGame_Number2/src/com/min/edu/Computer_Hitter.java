package com.min.edu;

public class Computer_Hitter {

	// 배열을 생성하여 반환하는 메소드
	public int[] comBall(int a) {
		int[] ball = new int[a];
		int idx = 0; // 현재 입력되어야 할 배열의 index 번호
		while(true) {
			int r = randomNum();
			if(!check(ball, r)) { // int[] ball 과 랜덤숫자 r을 비교해서 중복이 아니라면 if(!) 연산진행
				ball[idx] = r;
				idx++;
			}
			if(idx>=a) {
				break;
			}
		}
		return ball;
	}
	
	
	// 랜덤 숫자를 반환하는 메소드, 1~9 까지
	public int randomNum() {
		return (int)(Math.random()*9)+1;
	}
	
	// 배열을 비교해서 중복값 여부를 판단하는 메소드
	// 중복이 있다면 true, 없으면 false
	public boolean check(int[] arr, int num) { // 비교대상, 비교값
		boolean isc = false;
		for (int i = 0; i < arr.length; i++) { // 배열의 index 번호
			if(arr[i]==num) {
				isc = true;
			}
		}
		return isc;
	}
	
}
