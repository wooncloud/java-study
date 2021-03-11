package com.min.edu1;

/**
 * 개발자님 숫자를 두개 입력받아서 두 값의 몫을 반환하는 프로그램 하나만 만들어 주세요.
 */
public class ExceptionPractice {

	public int sasungProgram() {
		int result = 0;

		while (true) {
			try {
				System.out.println("정수만 입력해 주세요. 2번");
				IntegerInputValue iv = new IntegerInputValue();
				result = iv.inputVal() / iv.inputVal();
				break;
			} catch (ArithmeticException e) {
				System.out.println(e.toString());
			}
		}

		return result;
	}
}
