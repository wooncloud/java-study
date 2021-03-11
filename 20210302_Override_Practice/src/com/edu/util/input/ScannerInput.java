package com.edu.util.input;

import java.util.Scanner;

/**
 * 면적 계산시 double을 입력받는 클래스
 * 
 * @author wooncloud
 *
 */
public class ScannerInput {

	public static double doubleValueIn() {
		double d = 0;
		System.out.print("실수 값을 입력해 주세요 : ");
		Scanner scan = new Scanner(System.in);
		d = scan.nextDouble();

		return d;
	}
	
	public static String stringValueIn() {
		String str = "";
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();

		return str;		
	}
}
