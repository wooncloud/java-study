package com.min.edu;

public class OverloadMain {

	public static void main(String[] args) {
		
		OverloadClass olc = new OverloadClass();
		
		olc.print(); // arguments를 입력받은 경우, 멤버필드를 포함해서 출력한다.
		olc.print(15);
		System.out.println(olc.print("서울"));
	}

}
