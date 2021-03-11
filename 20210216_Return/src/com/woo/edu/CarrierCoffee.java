package com.woo.edu;

public class CarrierCoffee {
	private int cup;
	private int pay;

	// ----- setter ------
	public void setCup(int cup) {
		this.cup = cup;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	// ----- method ------

	/**
	 * 반환되는 커피와 잔돈을 출력해주는 메소드
	 */
	public void print() {
		System.out.printf("고갱님~ 커피 %d잔과 잔돈 %d원 나왔습니다.", cup, pay);
	}
}
