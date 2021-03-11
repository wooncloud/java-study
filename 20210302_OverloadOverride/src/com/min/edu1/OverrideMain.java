package com.min.edu1;

public class OverrideMain {

	public static void main(String[] args) {
		DTO d = new DTO();

		// java.lang.Object.toString(); 자식의 객체 출력
		// package.class@16진수 hashcode
		String printD = d.toString();
		System.out.println(printD);

		DTO dd = new DTO();
		System.out.println(dd.toString());
		SuperDto ddd = new DTO();
		System.out.println(ddd.toString());
		Object dddd = new DTO();
		System.out.println(dddd.toString());
		
		SuperDto sd = new SuperDto();
		System.out.println(sd.toString());
	}
}