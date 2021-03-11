package com.min.edu;

public class Child extends Parents {
	public String name;
	
	public Child() {
		// super();
		this("홍길동"); // 유연성 코딩
	}
	
	public Child(String name) {
		// 생성자는 반드시 부모부터 초기화 해야한다.
		super(); // 부모는 먼저 초기화
		new Parents(); // ★★★ 현재 클래스의 부모가 아닌 단독으로 생성된 객체 ★★★
		this.name = name;
	}

	public void make() {
		System.out.println("child method");
		super.make();
	}

}
