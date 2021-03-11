package com.min.edu.calc;

public class TypeCalcuration {

	public void numberCal() {
		byte b2 = 1;
		byte b3 = 127;
		
		// 자바의 기본연산은 int로 되기 때문에 캐스팅을 해줘야한다.
		byte bSum1 = (byte)(b2 + b3);
		System.out.println(bSum1);
		
		// ------------------------
		
		byte b4 = 2;
		byte b5 = 127;
		int iSum = b4 + b5;
		System.out.println(iSum);
		
		// ------------------------
		
		byte biSum = (byte)(b4 + b5);
		System.out.println(biSum);
	}

}
