package com.min.edu;

import java.util.Scanner;

public class OrderMain {

	public static void main(String[] args) {
		PassPort myInfo = new PassPort();
		myInfo.name = "홍길동";
		myInfo.age = 100;
		
		myInfo.print();
		
		CoffeeMake.referenceType(myInfo);
		
		myInfo.print();
		
		// ----------------------------------
		
		long initL = 1000;
		byte initB = 77;
		
		System.out.println(initL);
		System.out.println(initB);
		
		CoffeeMake.primitiveType(initL, initB);
		
		System.out.println(initL);
		System.out.println(initB);
	}

	
	
	
	public void regacyMain1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값을 입력해 주세요. : ");
		int i = sc.nextInt();

		System.out.println("입력받은 정수값 : " + i);
	}

	public void regacyMain2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("돈을 입력하세요. : ");
		long cash = sc.nextLong();

		System.out.print("커피를 선택해 주세요. : ");
		byte menu = sc.nextByte();

		CoffeeMake.primitiveType(cash, menu);
	}

}
