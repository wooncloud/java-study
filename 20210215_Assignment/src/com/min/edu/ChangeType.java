package com.min.edu;

public class ChangeType {

	public static void main(String[] args) {

		System.out.println("\n-- 1. int -> char --");
		char intToChar = 65;
		System.out.println(intToChar);

		// ----------------------

		System.out.println("\n-- 2. char -> int --");
		int charToInt = (int)'A';
		System.out.println(charToInt);
		
		// ----------------------
		
		System.out.println("\n-- 3. char -> int -> char --");
		char charIntChar = (char)('A' + 2);
		System.out.println(charIntChar);

		// ----------------------
		
		System.out.println("\n-- 4. number char -> int --");
		int numberCharToInt = 'E' - 'A';
		System.out.println(numberCharToInt);
		
		// ----------------------

		System.out.println("\n-- 5. number char -> int (With Character Class) --");
		int withCharClass = Character.getNumericValue('7');
		System.out.println(withCharClass);
		
		// ----------------------
		
		System.out.println("\n-- 6. int -> String --");
		String intToString = "" + 2021;
		System.out.println(intToString);
		
		// ----------------------

		System.out.println("\n-- 7. int -> String (With String Class) --");
		String withStringClass = String.valueOf(2021);
		System.out.println(withStringClass);
		
		// ----------------------

		System.out.println("\n-- 8. char -> String --");
		String charToString = ('a' + "");
		System.out.println(charToString); // 문자열과 연산
		System.out.println(String.valueOf('A')); // 함수 사용
		
		// ----------------------

		System.out.println("\n-- 9. char[] -> String --");
		char[] charArray = { 'G', 'o', 'o', 'd', 'e', 'e' };
	    String charArrToString = new String(charArray);
	    System.out.println(charArrToString);
		
		// ----------------------

		System.out.println("\n-- 10. String -> char[] --");
		String str = "Hello World";
		char stringToCharArr[] = str.toCharArray();
		System.out.println(stringToCharArr);
		
		// ----------------------
		
		int decimalNumber = 1234;
		System.out.println("\n-- 11. 10진수 -> 2진수 --");
		System.out.println(Integer.toBinaryString(decimalNumber));
		
		System.out.println("\n-- 12. 10진수 -> 8진수 --");
		System.out.println(Integer.toOctalString(decimalNumber));
		
		System.out.println("\n-- 13. 10진수 -> 16진수 --");
		System.out.println(Integer.toHexString(decimalNumber));
		
		// ----------------------
		

	}

}