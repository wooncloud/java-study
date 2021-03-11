package com.min.edu;

import java.util.Arrays;
import java.util.StringTokenizer;

public class CutMethod {
	
	public void mySplit() {
		String str = "oop:foo:poo";
		
		String[] cStr = str.split(":");
		System.out.println(Arrays.toString(cStr));
		
		String[] cStr2 = str.split("o");
		System.out.println(Arrays.toString(cStr2));
		
		// -------------------------------------------
		
		String cStr2Blank =cStr2[0]; // "" or null
		String result1 = cStr2Blank.equals(null) ? "null" : "아님";
		String result2 = cStr2Blank.equals("") ? "\"\"" : "아님";
		
		System.out.println(result1);
		System.out.println(result2);
		
		// -------------------------------------------
		
		String nullVal = null;
		// NullPointerException (객체가 없어서 기능이 없다.)
		System.out.println(nullVal.equals(null) ? "null" : "아님");
	}
	
	
	public void myStringtokenizer() {
		String str1 = "abc efg hig　111";
		StringTokenizer st = new StringTokenizer(str1);
		System.out.println(st.countTokens());
		
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		
		// -------------------------------------------
		
		String str2 = "oop:foo:poo";
		StringTokenizer st2 = new StringTokenizer(str2, "o");
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}
	
}
