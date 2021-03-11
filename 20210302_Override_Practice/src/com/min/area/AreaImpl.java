package com.min.area;

public abstract class AreaImpl implements IArea {

	protected double x;
	protected double y;

	protected double result;

	// implements이지만, 구현하지 않고
	// 자신의 클래스를 extends한 자식클래스에게
	// 구현을 위임합니다.
	@Override
	public abstract void makeArea();

	// default 메서드도 오버라이드 가능

	// 공통 메서드
	public void printArea() {
		System.out.println("Area Imple 면적의 결과는 ? " + result);
	}
}
