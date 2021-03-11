package com.woo.edu;

public class CafeOrderManager {

	public static void main(String[] args) {
		
		// 내 전재산은 이만큼 있다.
		// 다들 주식에 돈을 투자하지만, 나는 이 전재산을 커피를 마시는데 꼬라박을것이다.
		int money = 1950;
		
		// 카페에 왔다. 스타벅스 짝퉁 스톤벅스이다.
		Cafe stoneBucks = new Cafe();
		
		// 돈 있는만큼 줄테니 커피 주십쇼.
		CarrierCoffee cc = stoneBucks.stoneBucks(money);
		
		// 아니 왜 아메리카노만 줘요..
		cc.print();
		
		// 카페인 중독 ENDING
	}

}
