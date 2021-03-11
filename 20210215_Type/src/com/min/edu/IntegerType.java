package com.min.edu;

public class IntegerType {

	public static void main(String[] args) {
		// byte b1 = 128;
		// System.out.println(b1);
		
		byte b2 = 127;
		byte b3 = -128;
		System.out.printf("%d / %d\n", b2, b3);
		

		// 기능 부여한 Wrapper Class의 멤버필드로 선언이 미리 되어 있음.
		// 기본 타입과 호환 되는 참조타입을 미리 만들어 놨음.
		byte maxB = Byte.MAX_VALUE;
		byte minB = Byte.MIN_VALUE;
		System.out.printf("%d / %d", maxB, minB);
	}

}
