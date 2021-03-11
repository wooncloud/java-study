package com.min.edu;

public class ProcessClass {

	/**
	 * 참조타입(주소)을 받아서 parameter로 받은 값을 주소에 입력<br>
	 * 시작(r01) ➡ reference(r01) ➡ {r01.addr=""; r01.postNum = 11}<br>
	 * 시작의 r01도 변경이 됐을까?
	 */
	public void reference1(DTO d) {
		// toString()을 재정의 했기 때문에 객체를 출력하려면 안에 있는 값을 줌.
		System.out.println(d);

		// d는 입력할 수 있는 기능 혹은 인스턴스 변수의 노출이 없기 때문에 변경이 불가능 함.
	}

	/**
	 * VO {addr = "서울", PostNum = "10"} <br>
	 * 
	 * @param o
	 */
	public void reference2(VO o) {
		o.print();
		// VO o 는 setter 메소드를 통해 맴버필드에 값을 입력할 수 있다.
		// 따라서 주소만 있다면 처음 받은 값을 변경할 수 있다.
		// 시작(r01) ➡ reference(r01) ➡ {r01.addr=""; r01.postNum = 11}

		// r01을 가지고 있는 모든 메소드가 영향을 받는다.
		o.setAddr("땅");
		o.setPostNum("9797");

	}

	/**
	 * 기본타입을 입력 받은 메소드에서 parameter의 값에 입력을 할 경우 전달한 곳에서 값이 변경 되었는지 확인
	 */
	public void primitive(int n, String s) {
		System.out.println(n + "," + s);
		n = 99;
		s = "변경";
		
		System.out.printf("primitive에서 변경한 값 : %d %s\n", n, s);
	}
}
