package com.min.edu;

public class StringMethod {

	/**
	 * static String valueOf​(double d)<br>
	 * 입력받은 타입을 보이는 그대로 문자열로 변경함.
	 */
	public void valueOfMethod() {

		double d = 10.2653;
		int i = 999999;
		StringMethod sm = new StringMethod();

		// 모든 타입을 문자열로 바꾸는 방법
		// concatenation
		String cd = d + "";

		// static으로 선언되어 있음.
		String s = String.valueOf(d); // 새로 heap에 객체가 생성된다.
		String ss = "10.2653"; // new 하지 않고 만듬

		System.out.println(s == ss); // heap에 생긴 객체와 sp에 있는 객체와 비교

		System.out.println(sm);
		System.out.println(String.valueOf(sm));
	}

	/**
	 * 문자열에 앞에서 최초로 같은 char의 값이 나오는 위치 (index)
	 */
	public void indexOfMethod() {
		String strMethod = "ameraca";
		// 첫번째 a가 나오는 index를 알고 싶다.
		int a1 = strMethod.indexOf("a");
		System.out.println(a1);

		// 끝에서 첫번째 a가 나오는 index
		int a1Last = strMethod.lastIndexOf("a");
		System.out.println(a1Last);

		// 중간에 있는 a를 알고 싶다.
		int a1Mid = strMethod.indexOf("a", 1);
		System.out.println(a1Mid);

		// -----------------------------------

		String str = "ameraca";

		// 문자열은 문자형이 조합되어 있는 형태이다. 따라서 분리가 가능하다.
		// *.toCharArray()는 문자열을 분리하여 char 배열로 변환해 준다.
		char[] cArr = str.toCharArray();
		int[] iArr = new int[3];

		System.out.println("\n- 문자열 배열 -");
		System.out.println(cArr);
		System.out.println(iArr);

		// -----------------------------------

		// *.length(); 문자열의 길이를 반환해준다.
		// str.length();
		System.out.println("\n- 배열의 길이 -");
		System.out.println("str.length() : " + str.length());
		System.out.println("cArr.length : " + cArr.length);

		// ['a','m','e','r','a','c','a']
		char initA = 'r';
		for (int i = 0; i < cArr.length; i++) {
			if (initA == cArr[i]) {
				System.out.println("a가 나오는 index는? : " + i);
				break;
			}
		}
	}

	/**
	 * charAt
	 */
	public void charAtMethod() {
		String str = "goodee";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

		System.out.println();

		for (int i = 0; i < str.length(); i++) {
			System.out.println((int) str.charAt(i));
		}

	}

	/**
	 * subString
	 */
	public void subStringMethod() {
		String str = "hamburger";
		int start = str.indexOf("ham"); // 0
		int end = str.lastIndexOf("bu"); // 3
		
		String ham = str.substring(start, end); 
		String burger = str.substring(end);
		
		System.out.println(ham);
		System.out.println(burger);
	}

}
