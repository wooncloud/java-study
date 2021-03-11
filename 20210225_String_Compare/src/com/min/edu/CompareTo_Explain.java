package com.min.edu;

public class CompareTo_Explain {

	/**
	 * 비교대상이 heap의 객체를 비교<br>
	 * 하지만 compareTo는 String을 char의 요소로 비교하는 방법<br>
	 * 반환타입 : 비교 대상끼리의 차이(codepoint)를 반환
	 */
	public void compareToMethod() {
		String str1 = "vacation";
		String str2 = "vacaTion";

		char t = 't';
		char T = 'T';
		System.out.println("t : " + (int) t);
		System.out.println("T : " + (int) T);

		// letter는 대문자와 소문자의 차이는 32로 확인할 수 있다.
		int c = str1.compareTo(str2);
		int ci = str1.compareToIgnoreCase(str2);
		System.out.println(c);
		System.out.println(ci);

	}

	public void compareToMake() {
		String str1 = "vacation";
		String str2 = "vacaTion";

		String strTemp1 = "";
		String strTemp2 = "";

		// 2개의 문자열이 길이가 다른 경우
		// 긴 문자열을 기준을 잡을 경우 indexOutOfBoundaryException이 발생
		if (str1.length() <= str2.length()) {
			strTemp1 = str1;
			strTemp2 = str2;
		} else {
			strTemp1 = str2;
			strTemp2 = str1;
		}

		System.out.println(strTemp1);
		System.out.println(strTemp2);

		// ------------------------------------------

		int result = 0;
		for (int i = 0; i < strTemp1.length(); i++) {
			char temp1 = strTemp1.charAt(i);
			char temp2 = strTemp2.charAt(i);

			if (temp1 != temp2 && !check(temp1, temp2)) {
				result = str1.charAt(i) - str2.charAt(i);
				break;
			}
		}

		System.out.println(result == 0 ? "같은 문자" : "다른 문자");
	}

	private boolean check(char c1, char c2) {
		boolean isc = false;
		int c1c = Character.getNumericValue(c1);
		int c2c = Character.getNumericValue(c2);

		boolean b = c1c >= 10 && c2c >= 10;
		boolean c = (c1c - c2c) == 0;
		
		if (b && c) { // A - a
			isc = true;
		}

		return isc;
	}
}
