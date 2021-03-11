package com.woo.edu;

public class Cafe {
	
	/**
	 * private
	 * 돈을 받아서 커피를 만들어 cup을 반환한다.
	 * @param money 받는 돈
	 * @return cup 
	 */
	private int coffeeMake(int money) {
		int cup = 0;
		cup = money / CafeMenu.AMERICANO;
		return cup;
	}
	
	/**
	 * private
	 * 돈을 받아서 커피를 계산하고 나머지 잔돈을 돌려준다.
	 * @param money 받는 돈
	 * @return cup 
	 */
	private int coffeePay(int money) {
		int pay = 0;
		pay = money % CafeMenu.AMERICANO;
		return pay;
	}
	
	/**
	 * 잔돈과 커피를 한꺼번에 연산해주는 메소드
	 * @param money 받은 돈
	 * @return CarrierCoffee 잔과 잔돈을 담는 클래스
	 */
	public CarrierCoffee stoneBucks(int money) {
		CarrierCoffee cc = new CarrierCoffee();
		
		cc.setPay(coffeePay(money));
		cc.setCup(coffeeMake(money));
		
		return cc;
	}
}
