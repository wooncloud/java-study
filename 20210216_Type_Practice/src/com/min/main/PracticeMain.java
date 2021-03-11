package com.min.main;

import com.min.edu.TypePractice;

public class PracticeMain {

	public static void main(String[] args) {
		// TypePractice 객체의 주소가 들어있다.
		TypePractice tp = new TypePractice();
		
		// int n = 10;
		// System.out.println("n을 출력한다. \t" + n);
		// System.out.println("tp의 주소를 출력한다. \t" + tp);
		
		tp.intToChar();

		tp.charToInt();
		
		tp.charToIntToChar();
		
		tp.charNumToIntNum();
		
		tp.characterMethod();
	}
}
