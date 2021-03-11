package com.min.edu;

public interface IArea {

	public double PI = 3.14;

	public void make();

	void print();

	// interface에서 생성할 수 있는 유일한 기능을 할 수 있는 메서드 선언
	default void message() {
		System.out.println("interface에 사용한 선언된 메소드");
	}

}
