package com.edu.util.input;

import java.util.Scanner;

/**
 * 빅데이터 UI 필요 라이브러리의 입력 기능 집합
 * @author Woo Seong Ho
 * @since 2021.02.22
 * @version 1.0b
 */
public class ScanInputInterger {
	
	/**
	 * Scanner 객체를 이용하여 int를 입력 받음.
	 * @return 입력받은 정수값
	 */
	public static int intergerValueIn() {
		int num = 0;

		System.out.print("정수를 입력해 주세요. : ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		return num;
	}
}
