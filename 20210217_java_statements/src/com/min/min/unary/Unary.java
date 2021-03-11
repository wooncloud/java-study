package com.min.min.unary;

public class Unary {

	public static void main(String[] args) {
		int a = 1;
		
		// 아래 내용 다 같은것.
		a = a + 1;
		a += 1;
		a++;
		++a;
		
		// -----------------------------
		// a = 1로 다시 초기화
		a = 1;
		System.out.println(a++);	// 1 출력 후 2로 증가
		System.out.println(++a);	// 3으로 증가 후 3출력
		System.out.println(a++);	// 3출력 후 4증가
		System.out.println(a--);	// 4 출력 후 3감소
		System.out.println(--a);	// 2감소 후 2출력
		System.out.println(a--);	// 2출력 후 1감소
		System.out.println(a);		// 1
	}
}