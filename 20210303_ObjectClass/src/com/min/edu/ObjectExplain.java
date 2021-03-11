package com.min.edu;

// 모든 클래스는 java.lang.Object extends
// Object는 기본적으로 자바 클래스의 상위 클래스이기 때문에 명시적으로 작성하지 않음.
public class ObjectExplain {

	public static void main(String[] args) {
		String str1 = new String("홍길동");
		String str2 = "홍길동";
		DTO str3 = new DTO("홍길동");

		equalsSet(str1, str2, str3);
		System.out.println();
		getClassSet(str1, str2, str3);
		System.out.println();
		toStringSet(str1, str2, str3);
		System.out.println();
		hashCodeSet(str1, str2, str3);
		System.out.println();
	}

	private static void equalsSet(String str1, String str2, DTO str3) {
		// 부모한테 요청해서 같은 객체인지 확인해 주세요.
		System.out.println("equals 객체를 비교할때 사용하는 메서드");
		boolean isc1 = str1.equals(str2);
		System.out.println(isc1);

		// 해시코드가 같아도 타입이 달라서 false
		boolean isc2 = str1.equals(str3);
		System.out.println(isc2);

		// 같은 객체끼리 equals이 가능하다.
		// 단 DTO에서도 equals을 오버라이드 해야함.
		DTO str4 = new DTO("홍길동");
		boolean isc3 = str3.equals(str4);
		System.out.println(isc3);

	}

	private static void getClassSet(String str1, String str2, DTO str3) {
		System.out.println("getClass()"); // invocation, reflection
		System.out.println(str1.getClass());
		System.out.println(str2.getClass());
		System.out.println(str3.getClass());

	}

	private static void toStringSet(String str1, String str2, DTO str3) {
		System.out.println("toString()"); // 출력을 해주는 것이 아니라 메모리에 있는 객체를 표현
		System.out.printf("%s:%s:%s\n", str1.toString(), str2.toString(), str3.toString());

		boolean isc12 = (str1.toString() == str2.toString());
		boolean isc23 = (str2.toString() == str3.toString());
		boolean isc13 = (str1.toString() == str3.toString());

		System.out.println(isc12);
		// new로 만든 String은 toString 통해서 new로 만들어짐
		// 하지만 user 객체는 toString 값을 반환 SP
		// 생성된 원래의 형태에 따라서 toString 반환되는 객체가 다르다.
		System.out.println(isc23);
		System.out.println(isc13);

	}

	private static void hashCodeSet(String str1, String str2, DTO str3) {
		System.out.println("hashCode()");
		System.out.println("str1 : " + str1.hashCode());
		System.out.println("str2 : " + str2.hashCode());
		System.out.println("str3 : " + str3.hashCode());
	}

}
