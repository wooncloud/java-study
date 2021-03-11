package com.min.edu; // 패키지

// import 영역
import java.util.Date;

// WordExplain 클래스
public class WordExplain {

	// 멤버필드 영역 ---
	public String name;	// 문자열을 담는 공개된 variable
	private int age; // 정수를 담는 비공개된 variable
	public static String address = "서울"; // 문자열을 담는 공개된 static variable
	// --- 멤버필드 영역

	// WordExplain 생성자
	public WordExplain() {

	}

	// 멤버 메소드 영역 ---
	// parameter인 money를 출력하는 메소드
	public void make(int money) {
		Date today = new Date();
		System.out.println(money);
	}

	
	// instance화로 공개되어 있음. 반환타입 int(정수) 값을 준다.
	public int play() {
		int n = 10; // local variable
		
		// 멤버필드의 내용을 가지고 올 수 있기 때문에 name을 사용할 수 있다.
		System.out.println(name);
		
		for (int i = 0; i < 10; i++) {
			
		}

		return n; // 반환
	}
	// --- 멤버 메소드 영역 끝 

	// 메인 함수
	public static void main(String[] args) {
		
	}
}
