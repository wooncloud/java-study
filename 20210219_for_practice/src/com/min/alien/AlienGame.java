package com.min.alien;

public class AlienGame {

	public static void main(String[] args) {
		
		int cnt = 5;
		
		for (int i = 0; i < cnt; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print((cnt - i) + (j + 1));
			}
			
			for (int j = 0; j < (cnt - i); j++) {
				System.out.print(j + 1);
			}
			
			if(i < (cnt - 1)) {				
				System.out.println(" " + (i + 1));
			}
			
		}
	}
}