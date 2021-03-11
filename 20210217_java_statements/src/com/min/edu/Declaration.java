package com.min.edu;

import java.util.Scanner;

public class Declaration {
	
	public byte b;
	public short s;
	public int i;
	public long l;
	public float f;
	public double d;
	public boolean bool;
	public char c;
	public int saveInt = 20210217;
	public Scanner scanner;
	
	
	// ------------------------------------------
	
	// 메소드 선언
	// 접근제한자 리턴타입 메소드명 () {}
	public void testDecla() {
		// local variable에서의 변수 혹은 객체의 선언은 반드시 값을 입력해야 한다.
		// 이유는 초기화하는 기능이 없기 때문에
		// 사용되는 시점이 객체를 생성하고 메소드를 실행했을 경우에만 동작
		int a;		// 기본타입 선언 (타입)(변수명)
		Scanner s;	// 참조타입 선언 (타입)(객체명)
		
		// System.out.println(a);
	}
	
}
