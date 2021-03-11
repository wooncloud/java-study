package com.min.edu;

public interface IArea {
	
	double PI = 3.14;
	
	// 인터페이스 함수 리펙터 하려면?
	public double areaCal(double x, double y);
	
	// 디폴트 메소드
	default void print(double res) {
		System.out.println(res);
	}
}
