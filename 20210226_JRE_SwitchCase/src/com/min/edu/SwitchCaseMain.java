package com.min.edu;

public class SwitchCaseMain {

	public static void main(String[] args) {

		String key = "mon";
		
		switch (key) {
		case "mon":
			System.out.println("월요일");
			break;
		case "fri":
			System.out.println("금요일");
			break;
		default:
			System.out.println("기타 요일");
			break;
		}
		
		
		
	}
	
}
