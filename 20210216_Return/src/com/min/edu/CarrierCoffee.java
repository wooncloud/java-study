package com.min.edu;

/**
 * 반환받은 커피와 잔돈을 받는 클래스
 */
public class CarrierCoffee {
	// TODO 11. 인스턴스 변수로 만들어서 new 했을 경우 새로운 값을 담을 수 있는 멤버필드로 만든다.
	public int cup;
	public int pay;
	
	// TODO 18. 멤버필드의 값을 간결하게 출력해 주는 메소드를 선언
	/**
	 * 캐리어의 커피와 잔돈을 출력함.
	 */
	public void print() {
		System.out.printf("고객님 커피 %d잔과 잔돈 %d원 나왔습니다.", cup, pay);
	}
}
