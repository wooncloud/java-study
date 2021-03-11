package com.min.edu;

/**
 * 메모리의 영역<br>
 * method area : method가 있다 / static 영역이 있다. / 한번만 올라간다 <br>
 * stack : 변수, 리터럴, 연산, LIFO (후입선출) <br>
 * heap : 객체, sp, 생성자
 */
public class Test {

	public final static int A;

	static { 
		A = 10;
		System.out.println("난 static 이다.");
	}
	
	{ 
		System.out.println("난 연산자 블럭이다.");
		print();
	}
	
	public Test() { 
		System.out.println("난 생성자이다.");
	}
	
	public void print() {
		System.out.println("난 일반 메소드이다.");
	}
}
