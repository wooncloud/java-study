package com.min.min.tsngame;

import java.util.Scanner;

public class Game369_Process {

	/**
	 * 게임의 진행을 처리해주는 메소드
	 */
	public void gameProcess() {
		String ch;
		
		do {
			gamePlay();
			ch = getContinueArg();
		} while (ch.equals("Y"));
	}
	
	
	/**
	 * 
	 * @return String Y/N 게임 한번 더 할지 여부를 반환
	 */
	// 스캔만 받기
	private String getContinueArg() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("게임을 한번 더 하시겠습니끼? Y/N : ");
		
		return scan.nextLine();
	}
	
	
	/**
	 * 게임의 반복숫자를 입력해주는 메소드
	 */
	// 입력받고 출력하고
	private void gamePlay() {
		for (int i = 0; i < 20; i++) {
			int num = i + 1;
			if(checkNum(num)) {
				System.out.println("짝");
			}
			else {
				System.out.println(num);
			}
		}
	}
	
	/**
	 * 게임의 입력된 숫자가 3을 포함하고 있는지 판단해주는 메소드
	 * @param num
	 * @return
	 */
	// 판단만
	private boolean checkNum(int num) {
		boolean isc = false;

		int t = num % 10;
		if (t != 0 & t % 3 == 0) {
			isc = true;
		}

		return isc;
	}

}
