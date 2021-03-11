package com.min.main;

import com.min.edu.MethodClass;

public class StaticCall_Main {

	public static void main(String[] args) {
		
		// 클래스명.static멤버
		System.out.println(MethodClass.newCnt);
		
		// 잘못된 방법 : 경고가 발생되니 static 호출 방법으로 호출해야함.
		MethodClass mc = new MethodClass();
		System.out.println(mc.newCnt); // 객체명.static멤버
		
		
		// ----------------------------------------
		
		new MethodClass(); // newCnt + 1
		System.out.println(MethodClass.newCnt);
		
		new MethodClass(); // newCnt + 1
		System.out.println(MethodClass.newCnt);		
	}
}
