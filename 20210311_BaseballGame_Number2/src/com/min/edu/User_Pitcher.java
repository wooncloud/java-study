package com.min.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

// 숫자를 입력받는다
public class User_Pitcher {

	// 오버로딩, boolean을 arguments로 사용하여 중복이 됐을경우와 아닐경우를 구분함
	// boolean의 값에 따라서 결과를 처리함
	// boolean이 true면 중복허용 false면 중복불가
	public int[] input(int a, int start, int end, boolean choice) {
		int[] inputBall = null; // 오버로딩된 input 메소드에서 배열을 만들어 반환해주기 때문에 이 메소드에서는 연산은 필요 없음
		if(choice) { // true라면 중복허용
			inputBall = input(a,start,end);
		}else {
			while (true) {
				inputBall = input(a, start, end);
				if (arrayCheck(inputBall)) { // arrayCheck 메소드가 true면 중복, false면 중복아님
					System.out.println("중복되었습니다.");
				}else {
					break;
				}
			}
		}
		return inputBall;
	}
	
	
	
	// 배열의 크기와 범위를 가지고 있는 메소드
	public int[] input(int a, int start, int end) { // 배열을 입력받는 메소드(배열의 크기, 시작범위, 끝범위)
		int[] inputBall = new int[a];
		int count = 0; // 입력되는 배열의 index번호로 사용
		// 유효성
		while (true) {
			try {
				System.out.println((count + 1) + "번째 숫자를 입력해주세요");
				Scanner scan = new Scanner(System.in);
				int n = scan.nextInt();
				if(n>=start && n<=end) {
					inputBall[count] = n;
					count++;
				}else {
					System.err.println("범위를 벗어났습니다. 1~9 사이의 숫자를 입력하세요");
				}
				if(count>=a) {
					break;	
				}
			} catch (InputMismatchException e) {
				System.err.println("잘못된 형식으로 입력하셨습니다. 재입력하세요");
			} 
		}
		return inputBall;
	}
	
	public boolean arrayCheck(int[] chkBall) { // int[] 배열안에 중복된 값이 있는지를 체크하는 메소드
		boolean isc = false;
		for (int i = 0; i < chkBall.length; i++) { // 기준이 되는 index 번호
			for (int j = 0; j < chkBall.length; j++) { // 비교할 index 번호
				// 자신의 배열을 확인하기 때문에 같은 index를 비교대상에서 빠져야 함
 				if(i!=j && chkBall[i]==chkBall[j]) {
 					isc = true;
 				}
			}
		}
		return isc;
	}
	
}
