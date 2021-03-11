package com.min.edu;

import java.util.Scanner;

public class WapperClass {
	
	public static void main(String[] args) {
		// 참조타입의 형변환
		// 예전의 wrapper Class의 사용
		// heap에서 stack으로 값으로 가져오는 방법
//		Integer i = new Integer(40);
		Double d = new Double(1.0);
		double dv = d.doubleValue();
		System.out.println(dv);
		System.out.println(d.hashCode());
		System.out.println(System.identityHashCode(d));
		
		Double di = 1.0;
		System.out.println(di.hashCode());
		System.out.println(System.identityHashCode(di));
		
		System.out.println(di == dv); // auto unboxing
//		System.out.println(di & dv); // double이라서 실수는 bit 연산을 할 수 없다.
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		Integer i1 = 10;
		Integer i2 = 12;
		System.out.println(i1 & i2); // auto unboxing
	}
	
}
