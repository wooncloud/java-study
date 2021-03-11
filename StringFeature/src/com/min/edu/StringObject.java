package com.min.edu;

public class StringObject {

	public static void main(String[] args) {
		String str1 = "JAVA";				// String Pool에 "JAVA"라는 객체를 가지고 있음
		String str2 = new String("JAVA");	// heap에 생성되어 있고 "JAVA"라는 객체의 주소
		String s1 = "JA";					// 
		String s2 = "VA";					// 
		String str3 = s1 + s2;				// concatenation heap 객체를 생성하여 "JAVA"라는 객체의 주소
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}