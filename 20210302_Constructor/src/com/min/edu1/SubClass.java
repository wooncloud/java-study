package com.min.edu1;

public class SubClass extends SuperClass {


	public SubClass() {
		// TODO 002 : 부모의 생성자를 호출함.
		super();
	} // TODO 003 : 자식의 생성자 완료


	// 부모를 생성하기 전에는 자식이 생성될 수 없다.
	// 따라서 무조건 부모의 생성자가 가장 맨 앞의 연산이어야 한다.
	public SubClass(String name) {
		this();
		// super();
	}
	
	// 부모를 생성하기 전에는 자식이 생성될 수 없다.
		// 따라서 무조건 부모의 생성자가 가장 맨 앞의 연산이어야 한다.
		public SubClass(int n) {
			// TODO 005 
			super(10);
		}
}
