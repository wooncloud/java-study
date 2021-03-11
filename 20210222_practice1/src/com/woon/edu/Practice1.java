package com.woon.edu;

public class Practice1 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			int temp = i + 1;
			
			if(temp % 2 == 0) {
				continue;
			}
			
			System.out.printf("%d \t", temp);
		}
	}
}
