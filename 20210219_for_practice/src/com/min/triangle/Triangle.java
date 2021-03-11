package com.min.triangle;

public class Triangle {
	
	public void generateTriangle() {
		
		int cnt = 4;
		for (int i = 0; i < cnt; i++) {
			
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("@");
			}
			
			System.out.println();
			
		}
	}	
}