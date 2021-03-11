package com.min.edu;

public class CoffeeMake {
	
	// parameter가 필요한 이유 : 전달받은 값을 부를 수 있는 이름
	/**
	 * arguments &amp; parameter
	 * @param long money 
	 * @param byte choiceCoffee
	 */
	public static void primitiveType(long money, byte choiceCoffee) {
		System.out.println("입력된 금액 : " + money);
		System.out.println("선택된 커피 : " + choiceCoffee);
		
		CoffeeMake c = new CoffeeMake();
		c.change(money, choiceCoffee);
	}
	
	private void change(long l, byte b) {
		l = 99;
		b = 99;
	}


	/**
	 * pass by reference
	 * @param PassPort me
	 */
	public static void referenceType(PassPort me) {
		System.out.println(me.name);
		System.out.println(me.age);
		
		CoffeeMake c = new CoffeeMake();
		c.change(me);
	}
	
	private void change(PassPort passPort) {
		passPort.name = "또치";
		passPort.age = 40;
	}
}
