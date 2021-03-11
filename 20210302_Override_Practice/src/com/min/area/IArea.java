package com.min.area;

/**
 * 면적 계산을 위한 구현해야 할 메소드의 선언 집합<br>
 * 선언된 메소드의 집합 : interface<br>
 * 선언된 메소드 : 추상 메소드 (abstract method)<br>
 * 
 * @author wooncloud
 */
public interface IArea {

	// 고정 변수
	public final double PI = 3.14;

	// 면적 계산이라면 이러한 메소드들의 집합체 강제 구현
	public void makeArea();

	// 공통으로 사용할 수 있는 메소드
	// default 메소드는 인터페이스에서 무조건 구현해야 한다.
	default void printArea(double result) {
		System.out.println("default 면적의 결과는?" + result);
	}

}
