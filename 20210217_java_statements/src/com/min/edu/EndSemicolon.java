package com.min.edu;

/**
 * 문법의 종료
 */
public class EndSemicolon {
	
	// instance 변수, default 접근제한자
	// End_Semicolon이 instance화 할 때 instance변수로 사용되고, default 접근제한자를 가지고 있다.
	// int 타입의 a라는 변수명에 100의 값을 가진 멤버필드 변수
	// default 접근제한자에 의해 instance 했을 경우 같은 package 내에서만 사용가능
	// 즉 package가 다른곳에서 instance를 했을 경우 사용하지 못함.
	int a = 100;
	
	
	
	// TODO 01. 기능은 반드시 메소드 블럭 내에 있어야 한다.
	// System.out.println("what?");
	
	// TODO 02. 연산영역
	// 연산을 호출(연산 선언)할 수 있는 영역
	{
		
	}
	
	// 메소드는 구현이 되어 있어야 한다. { ... }
	// 접근제한자	리턴타입	메소드명	()	{}
//	public void semicolon();
	public void semicolon() {
		System.out.println("what?");
		
		// int a = 10		X
		// int a = 10();	X
		int a = 10;
		
		// 앞에 선언한 타입을 뒤에있는 모든 변수가 같은 타입으로 선언이 된다.
		int b, c, d = 100; 
		
		// The local variable b may not have been initialized
		// local variable은 초기화 하지 않으면 사용을 할수가 없다.는 공간만 할당 : 출력하면 오류
	}
}
