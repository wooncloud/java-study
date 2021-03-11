package com.min.edu;

public class StringMain {

	public static void main(String[] args) {
		// 생성되는 String의 객체를 확인해보자.

		String str1 = "JAVA"; // StringPool에 생성되는 객체 R01 H0A(H01)
		String str2 = "JAVA"; // StringPool에 생성되는 객체 R01 H0A(H01)

		// == 은 참조타입에서 주소를 비교
		// 1) String의 객체는 같은 값이라면 같은 객체를 사용한다.
		System.out.println(str1 == str2); // true
		System.out.println();

		// ------------------------------------------------------------

		// 2) 만약에 str3가 String Pool에 있는것이라면 str1 혹은 str2와 ==으로 비교했을때 true로 나와야한다.
		// "JAVA" => String Pool
		// "JA" + "VA" => concatenation 결과 Heap 객체에 만들어지는지 아니면 String Pool에 있는 것을 사용하는지,
		String str3 = "JA" + "VA";

		System.out.println("concatenation은 heap에 만들어질까? 아닐까?");
		System.out.println((str1 == str3) ? "StringPool에 만들어 짐" : "heap에 만들어짐"); // true
		System.out.println();

		// ------------------------------------------------------------

		// 문자열이 String 타입에 선언되어 있다면
		// Concatenation은 heap 영역에 만들어진다.
		String ja = "JA";
		String va = "VA";
		String java = ja + va;
		System.out.println("객체에 묶여있는 concatenation은 heap에 만들어질까? StringPool에 만들어질까?");
		System.out.println((java == str1) ? "StringPool에 만들어 짐" : "heap에 만들어짐"); // true
		System.out.println();

		// ------------------------------------------------------------

		// new로 생성된 객체는 heap 영역에 있고, 문자열은 String Pool에 있음.
		String strInstance = new String("JAVA");

		System.out.println("new로 생성한 객체와의 비교");
		System.out.println((strInstance == str1) ? "같도 같고 주소도 같음" : "값은 같지만 주소가 다름"); // true
		System.out.println();
		
		// ------------------------------------------------------------
		
		
	}

}
