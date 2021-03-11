package com.min.edu.nullnull;

public class NullReferenceTypeValue {

	public static void main(String[] args) {
		DTO dto1 = new DTO();
		DTO dto2 = null;
		
		dto1.print();
		dto2.print();
		
		String str1 = "";
		String str2 = null;
		
		
		if(str1.equals("")) {
			System.out.println();
		}
		if(str2 == null) {
			System.out.println();
		}
		
	}
}

class DTO {
	public void print() {
		System.out.println("출력");
	}
}