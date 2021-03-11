package com.woom.edu;

public class Exam5 {

	public static void main(String[] args) {
		triangle();
	}
	
	public static void triangle() {

	    int stage = 5;

	    for(int i = 0; i < stage; i++) {

	        for(int j = 0; j < i; j++) {

	            System.out.print("　");

	        } // 공백

	        for(int j = 0; j < stage - i; j++) {

	            System.out.print("◆");

	        } // 그림
	        
	        System.out.println();

	    } // 차수 for

	}

}
