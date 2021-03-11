package com.min.triangle;

public class TriangleSolution {
	
	public void triangleThree(int cnt) {
		
		for (int i = 0; i < cnt; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < (cnt - i); j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
	}
	
}