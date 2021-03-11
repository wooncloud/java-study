package com.min.edu;

public class OverloadClass extends OverloadSuper {

	private String name = "놀부";

	/**
	 * 멤버필드를 출력해줌
	 */
	public void print() {
		System.out.println(name);
	}

	// 접근제한자, 반환타입, static, final 등
	// 전혀 상관없이 같은 이름의 메소드는 같이 존재할 수 없다.
//	void print() {
//
//	}

	protected void print(int age) {
		System.out.println(name + age);
	}

	// default는 인터페이스만 쓸수 있는 예약어이다. 
	/* default */ String print(String addr) {
		return name + addr;
	}
	
	// 오버라이드
	public void superMake() {
	}
	
	// 오버라이드는 모든 형태가 같아야 한다.
//	protected void superMake() {
//	}
	
	// 오버로드
	public void superMake(int a) {
		
	}
}
