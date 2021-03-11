package com.min.edu;

public class CharacterType {

	public static void main(String[] args) {
		
		char c1 = 'A';
		char c2 = 65;
		
		System.out.println(c1);
		System.out.println(c2);
		
		// ---------------------------
		
		char maxCh = Character.MAX_VALUE;
		char minCh = Character.MIN_VALUE;
		
		System.out.println(maxCh + "/" + (int)maxCh);
		System.out.println(minCh + "/" + (int)minCh);
	}

}
