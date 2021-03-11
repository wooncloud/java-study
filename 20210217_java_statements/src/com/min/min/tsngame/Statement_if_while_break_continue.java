package com.min.min.tsngame;

public class Statement_if_while_break_continue {

	public static void main(String[] args) {
		for (int i = 3; i < 11; i++) {
			if(i % 2 == 1) {
				System.out.println("★" + i);
			}
			else if (i % 4 == 0) {				
				System.out.println("♠" + i);
			}
			else {
				System.out.println("♥" + i);
			}
		}
	}
	
	public void whileMethod() {
		int a = 0; // 누적변수
		while (true) {
			System.out.println(++a);

			if (a == 100) {
				System.out.println("도착");
				break;
			}
		}
	}
}