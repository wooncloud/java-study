package com.min.edu2;

public class IntegerCal {

	public static int addCalX(int a, int b, int c, int d) {
		return a + c;
	}

	public static int addCalY(int a, int b, int c, int d) {
		return b + d;
	}

	// overloading
	public static int addCal(int a, int b) {
		return a + b;
	}

//	public static int addCal(VariableObject vo1, VariableObject vo2) {
//		return vo1.y + vo2.y;
//	}

	// ----------------------------------------------------------

	// 생성자를 통한 문제점 해결
	// 1. 인스턴스 변수로 되어 있기 때문에 pass by reference에 의해 값이 변경
	// -> 멤버필드를 private 생성자 오버로딩을 통해 단 1회 입력이 되도록 함.
	// 2. 연산을 처리하기 위해서 x와 y를 따로
	// 이유는 반환이 두개일 수 없디 때문에.
	// -> 연산을 VariableObject에 담아서 가져옴
	public static VariableObject calculation(VariableObject vo1, VariableObject vo2) {
		return new VariableObject(vo1.getX() + vo2.getX(), vo1.getY() + vo2.getY());
	}
}
