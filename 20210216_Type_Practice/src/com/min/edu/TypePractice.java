package com.min.edu;

/**
 * 
 * @author Woon
 *
 */
public class TypePractice {

	/**
	 * (char) 65 -> 'A'
	 */
	public void intToChar() {
		// 정수 int type으로 65의 리터럴 값을 가지고 있는 변수
		int n = 65;

		// code point의 타입 int
		// char c = 65; 하면 그냥 들어감.
		char c = (char) n;
		System.out.println("65는 유니코드 표에서 \t" + c + "\n");
		// System.out.printf("65는 유니코드 표에서 \t %c \n", c);
	}

	/**
	 * (int)'A', 'A' + 0 => 65
	 */
	public void charToInt() {
		char c = 'A';
		int i = c; // promotion

		System.out.printf("A의 코드포인트 int 값 : %d\n", i);

		// c가 int연산을 위해서 codepoint값으로 변경 => 0더하면 65가 나옴
		int cal = c + 0;
		System.out.println("'A' + 0 = \t" + cal);
	}

	/**
	 * char A를 유추해서 char C를 찾아주세용.
	 */
	public void charToIntToChar() {
		// 유니코드 표의 구성을 알고 있느냐?
		char a = 'A';
		int sum = a + 2; // promotion
		char c = (char) sum; // casting

		// 리터럴 + 리터럴 = 리터럴
		// (리터럴은 stack에서 공간을 가지고 있지 않기 때문에 결과 값도 리터럴)
		// char c = 65 + 2;

		System.out.println("char To Int To Char : \t" + c);
	}

	/**
	 * '9' - '0' => 9
	 */
	public void charNumToIntNum() {
		char zero = '0';
		char nine = '9';
		
		System.out.printf("0 : %d \t 9 : %d \n", (int)zero, (int)nine);
		System.out.println("0 : " + (int)zero + "\t 9 : " + (int)nine);
		
		int cal = zero - nine;
		System.out.println("'0' - '9' = " + cal);
		
		System.out.printf("실수 %f", 3.14f);
		System.out.printf("정수 %d", 10);
		System.out.printf("문자열 %s", "안녕하세요");
		System.out.printf("문자형 %c", '$');
		System.out.printf("한줄내림 %n");
	}
	
	/**
	 * 숫자형 char를 숫자로 계산할 때 문제점이 있음.<br>
	 * 숫자인지 특수문자 letter인지 알수가 없다.<br>
	 * 자동으로 판단해서 결과를 반환해주는 메소드를 미리 만들어 놓음.<br>
	 * Character.getNumericValue(char 값)
	 */
	public void characterMethod() {
		char c1 = '1';
		char c2 = 'A';
		char c3 = 'a';
		char c4 = 'Z';
		
		// Character 클래스 : Wapper 클래스
		int c1Convertion = Character.getNumericValue(c1);
		int c2Convertion = Character.getNumericValue(c2);
		int c3Convertion = Character.getNumericValue(c3);
		int c4Convertion = Character.getNumericValue(c4);
		
		System.out.println(c1Convertion);
		System.out.println(c2Convertion);
		System.out.println(c3Convertion);
		System.out.println(c4Convertion);
	}
}
