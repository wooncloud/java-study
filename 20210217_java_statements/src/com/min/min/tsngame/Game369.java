package com.min.min.tsngame;

public class Game369 {

	public static void main(String[] args) {
		Game369_Process game = new Game369_Process();
		
		// 로직구성 0을 제외한 3 6 9 가 false 출력되는 test => 단위테스트
//		boolean check = process.checkNum(6);
//		System.out.println(check);
		
		game.gameProcess();
	}
	
	
//	
//	public static boolean check(int digit) {
//		boolean flag = false;
//		
//		if(digit % 3 == 0 && digit != 0) {
//			flag = true;
//		}
//		else {
//			flag = false;
//		}
//		
//		return flag;
//	}
//	
//	public void regacy() {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("몇번까지? : ");
//		int inNum = scan.nextInt();
//		
//		for (int i = 0; i < inNum; i++) {
//			int num = i + 1;
//			int digit3 = num / 100;
//			int digit2 = num / 10;
//			int digit1 = num % 10;
//			
//			
//			if(check(digit3)) {
//				System.out.print("쨕!");
//				
//				if(check(digit2)) {
//					System.out.print("쨕!");
//					
//					if (check(digit1)) {
//						System.out.print("쨕!");
//					}
//				}
//			}
//			else if(digit1 % 3 == 0 && digit1 != 0) {
//				System.out.print("쨕!");
//			}
//			else {
//				System.out.print(num);
//			}
//			
//			System.out.println();
//		}
//
//	}

}
