package com.min.me;

import com.china.food.ChineseRestaurant;

public class HungryMan {
	
	// 중국집에 주문을 해서 결과를 받음
	public static void main(String[] args) {
		ChineseRestaurant chinaFood = new ChineseRestaurant();
		String food1 = chinaFood.order("짜장면", "서울시 여의도동 한강", 5000);
		System.out.println(food1 + "를 받았다!\n");
		
		String food2 = chinaFood.order("탕수육", "우리집", 15000);
		System.out.println(food2 + "를 받았다!\n");
	}
	
}
