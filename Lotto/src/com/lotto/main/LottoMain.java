package com.lotto.main;

import java.util.Scanner;

import com.hong.compare.Compare;

public class LottoMain {

	public static void main(String[] args) {
		// 당첨번호 뽑기
		WinningNumbers wn = new WinningNumbers();
		for (int i = 0; i < wn.getWinningNumbers().length; i++) {
			System.out.print(wn.getWinningNumbers()[i] + "\t");
		
		}
		System.out.println(" + "+wn.getBonus());
		
		//-------------------------------------------
		
		System.out.println("돈내세요 돈!");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		int games = money/1000;
		System.out.println("총 " + games + "장을 사셨습니다.");
		
		// -----------------------------------------
		
		
		int autoCnt = 0;
		while (true) {
			System.out.println("자동을 몇번 하시겠습니까?");
			autoCnt = scan.nextInt();
			if(autoCnt <= games) {
				System.out.println("자동 : " + autoCnt);
				break;
			}
			else {
				System.out.println("아니 돈 더 내든가..");
			}
		}
		
		// -------------------------------------
		// 자동, 수동 횟수 얻기
		// 수동 횟수 얻기
		int manualCnt = games - autoCnt;
		System.out.println("수동"+manualCnt+"장이요.");
		
		// -------------------------------------
		// 수동으로 숫자 받고
		// manualNumbers : 수동으로 받은 숫자들
		String[] manualNumbers = new String[manualCnt];
		for (int i = 0; i < manualCnt; i++) {
			 manualNumbers[i] = scan.next();
		}
		
		for (int i = 0; i < manualNumbers.length; i++) {
			System.out.println(manualNumbers[i]);
		}

		// -------------------------------------
		// 자동으로 숫자 뽑고
		// sutoNumbers : 자동으로 받은 값
		String[] autoNumbers = new String[autoCnt];
		for (int i = 0; i < autoNumbers.length; i++) {
			
			for (int j = 0; j < 6; j++) {
				// 랜덤으로 숫자 뽑기
				int random = (int)(Math.random() * 45) + 1;
				// autoNumbers + random +  
				// 1
				// 1 2
				// 1 2 3
				autoNumbers[i] = autoNumbers[i] + random + " ";
			}
			
		}
		
		
		// 당첨번호와 비교
		// 결과
		
	}

}
