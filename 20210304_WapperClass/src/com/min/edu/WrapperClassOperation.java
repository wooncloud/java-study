package com.min.edu;

public class WrapperClassOperation {

	public static void main(String[] args) {
		
		
		int i1 = 20;
		double d1 = i1; // 형태는 변했지만 자동으로 변함 : promotion
		
		Integer ii1 = 20;
		double d2 = ii1; // auto unboxing
		Double d3 = (double)ii1;
		// auto unboxing -> promotion -> auto boxing
		// Interger -> int -> double -> Double
		System.out.println(d3);
		
		// ---------------------------------------------------
		
		Integer ex1 = 30; // auto boxing
		Object obj = ex1; // upCasting
//		Double ex2 = (Double)obj; // downCasting // ClassCastException
		// 정답 : Object를 원래 형태였던 int로 변경하고 double로 promotion하고 Double에 대입
		Double ex2 = (double)(Integer)ex1;
		// == Double ex2 = (double)(int)(Integer)ex1;
		
		System.out.println(ex2);
	}
	
}
