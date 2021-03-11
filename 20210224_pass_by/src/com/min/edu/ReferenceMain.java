package com.min.edu;

public class ReferenceMain {

	public static void main(String[] args) {
		ProcessClass pc = new ProcessClass();
		DTO a = new DTO("또치", 99);

		System.out.println("첨 입력한 객체" + a);

		System.out.println("-------------");

		VO b = new VO();
		b.setAddr("둘리");
		b.setPostNum("119");
		System.out.println("처음 입력한 객체 VO");
		b.print();

		System.out.println("-------------");

		pc.reference1(a);
		System.out.println("다른 곳에서 수정이 됐나요? DTO : " + a);
		pc.reference2(b);
		System.out.println("다른 곳에서 수정이 됐나요? VO : ");
		b.print();
	}
}
