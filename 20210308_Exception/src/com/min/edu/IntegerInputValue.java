package com.min.edu;

import java.util.Scanner;

public class IntegerInputValue {
	
	public int inputVal() {
		int re = 0;
		
		System.out.print("숫자를 입력해 주세요. : ");
		Scanner scan = new Scanner(System.in);
		re = scan.nextInt();
		
		return re;
	}
}
