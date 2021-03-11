package com.china.food;

public class ChineseRestaurant {
	
	public String order(String menu, String address, int money) {
		System.out.println("주소 : " + address);
		System.out.println("받은 돈 : " + money);
		System.out.println("주문 받은 메뉴 : " + menu);
		
		return cooker(menu);
	}
	
	private String cooker(String m) {
		return m;
	}
}
