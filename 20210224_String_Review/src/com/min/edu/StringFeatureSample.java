package com.min.edu;

public class StringFeatureSample {

	/**
	 * 생성관련<br>
	 * new를 통해서 객체를 생성 / 문자열을 대입<br>
	 * 공통점은 : 객체다<br>
	 * 다른점 : heap에 생성이 되고 문자열은 SP에 생성이 된다<br>
	 */
	public void string01() {
		String str1 = "rainbow";
		String str2 = new String("rainbow");

		// 확인하는 방법
		// == : 기본타입(값), 참조타입(주소)
		System.out.println("같은 객체인가요?"); // SP에 있는 문자열 객체와 Heap에 있는 문자열 객체를 확인함
		System.out.println(str1 == str2); // false
	}

	/**
	 * 사용되는 문자열이 sp에 생성이 되어 있다면 다음 생성되는 문자열은 생성이 아닌 생성되어 있는 문자열을 사용한다.
	 */
	public void string02() {
		String str1 = "Cloud";
		String str2 = "Cloud";

		// 참조타입은 객체를 생성하면 항상 새로운 주소(reference)와 고유값(hashcode)를 갖는다.
		System.out.println("같은 SP객체를 사용하고 있을까?"); // SP에 있는 문자열 객체 둘을 보고 같은지 확인
		System.out.println(str1 == str2); // true
	}

	/**
	 * 기본 타입 설명을 위한 byte 예시
	 */
	public void byte01() {
		// 기본타입에서 리터럴과 값
		byte b1 = 127;
		byte b2 = 126 + 1;

		byte c1 = 127;
		byte c2 = 1;
		byte c = (byte) (c1 + c2);

		// -128(10000000) + 127(01111111) = -1
		byte ct = (byte) (128 + c1);

		// 2진수로 : 11111111 (맨 앞은 부호비트) -> -1
		byte ct2 = (byte) 255;

		System.out.println(ct); // -1
		System.out.println(ct2); // -1
	}

	/**
	 * 문자열 합치기<br>
	 * 연산자를 통해서 진행<br>
	 * 어떠한 타입이든 문자열을 만나는 순간 보여지는 그대로 문자열이 된다. 기본타입과 같이 SP의 객체의 Concatenation와 담겨있는
	 * 객체의 Concatenation과 다르다.
	 */
	public void string03() {
		String str1 = "Happy";
		String str2 = "NewYear";

		String strC1 = "HappyNewYear";
		String strC2 = str1 + str2; // 객체에 담겨 있는 Concatenation
		String strC3 = "Happy" + "NewYear"; // SP에 있는 Concatenation

		System.out.println("strC1과 strC3는 SP의 객체를 Concatenation"); // SP에 있는 객체를 확인
		System.out.println(strC1 == strC3); // true
		System.out.println("strC2과 strC3는 SP의 객체를 Concatenation"); // heap에 있는 객체와 SP에 있는 객체를 확인
		System.out.println(strC2 == strC3); // false
		// 즉, 기본타입과 같이 SP의 객체의 Concatenation와 담겨있는 객체의 Concatenation과 다르다.
	}

	/**
	 * hashcode는 객체 생성되면 고유한 값
	 */
	public void string04() {
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();

		// 객체가 생성된 물리적인 위치와 hashcode가 출력된다.
		System.out.println(a1); // toString()의 생략형, toString()과 같다.
		System.out.println(a1.toString()); // System.out.println(a1);와 같음.

		System.out.println("\n객체의 hashcode는 모두 다르다.");
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());

		// ----------------------------------

		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");

		// str1와 str1.toString()은 같다.
		System.out.println("\nstr1와 str1.toString()은 같다.");
		System.out.println(str1);
		System.out.println(str1.toString());

		// String 클래스가 hashcode도 재정의를 해서 모든 string 객체는 같다.
		System.out.println("\nString 클래스가 hashcode도 재정의를 해서 모든 string 객체는 같다.");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());

		// 원래 heap의 특징인 고유한 hashcode를 알고 싶다면?
		// System.identityHashCode(x)를 사용한다.
		System.out.println("\n원래 heap의 특징인 고유한 hashcode를 알고 싶다면?");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));

		System.out.println("같은 string pool객체를 가르키는 str1과 str2는 서로 같지만, str3는 heap영역에 있는 객체이기 때문에 str1과 str3는 다르다.");
		System.out.println(str1 == str2); // 대입으로 만들어짐 같은 SP 객체를 바라봄
		System.out.println(str1 == str3 && str2 == str3); // 대입연산자 new로 만들어진 객체는 주소가 다르다.

		// java.lang.String 의 intern()을 통해서 사용되고 있는 문자열을 SP에서 사용함.
		System.out.println("\njava.lang.String 의 intern()을 사용하면 SP의 문자열을 비교한다!");
		System.out.println(str1.intern() == str2.intern());
		System.out.println(str1.intern() == str3.intern());

		// toString()
		// 원래 toString()은 java.lang.Object의 메소드로 객체를 출력하면 객체의 위치와 @16진수 hashcode를 출력
		// String은 부모에게 확장된(extends)된 toString()을 재정의하여 자신이 가지고 있는 문자열 값을 출력
		System.out.println("\ntoString()을 사용하면 자신의 객체의 값만 알려줄 뿐, 실질적으로 같은 값이 아니다. (객체가 다르기 때문)");
		System.out.println(str1.toString() == str2.toString());
		System.out.println(str1.toString() == str3.toString());

		String toStr3 = str3.toString();
		System.out.println("\ntoStr3는 str3의 객체를 가르키기 때문에 toStr3와 str3는 같다.");
		System.out.println(System.identityHashCode(toStr3));
		System.out.println(System.identityHashCode(str3));
	}

	/**
	 * 참조타입의 초기화 : null<br>
	 * 값이 들어가있지 않은 상태이면서 contatenation이 발생하는 ""<br>
	 * ""이 값인지 sp에서만 존재하는 것인지 확인해보자
	 */
	public void string05() {
		String str = " 값";
		String a = null;
		String blank_whitespace = " "; // codepoint : 32
		String blank = ""; // SP에 있는 객체

		System.out.println(a + str); // null 값
		System.out.println(a + blank_whitespace);
		System.out.println(a + 1);

		System.out.println(blank_whitespace.hashCode()); // 유니코드의 codepoint
		System.out.println(System.identityHashCode(blank_whitespace)); // 실제 hashcode
	}
}
