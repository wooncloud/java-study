package com.min.edu;

import java.util.InputMismatchException;

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
			}
			// ArithmeticException과 InputMismatchException은 동등 클래스
			// 상위의 계층구조를 입력하면 모두 처리하기 때문에 사용이 금지된다. Unreachable Code
			catch (ArithmeticException | InputMismatchException e) {
//				e.printStackTrace();

				// java.lang.ArithmeticException
				System.out.println(e.toString());
			} 
//			catch (InputMismatchException e) { 
//				// java.util.InputMismatchException
//				System.out.println(e.toString());
//			}
			finally {
				System.out.println("잘 입력이 되었습니다.");
			}
		}

		return result;
	}
}
