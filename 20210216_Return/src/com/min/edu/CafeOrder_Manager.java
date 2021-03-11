package com.min.edu;

public class CafeOrder_Manager {

	public static void main(String[] args) {
		// TODO 04. TODO03의 메소드를 테스트하기 위해 객체를 생성한다.
		// TODO 05. 돈을 입력해서 커피의 잔수가 나오는 메소드 coffeeMake(int)를 테스트
		//			메소드의 기능인 반환값을 받아 main에서 출력 테스트
		
		// TODO 07. 돈을 입력해서 커피의 잔돈이 나오는 메소드
		//			메소드의 기능인 반환값을 받아 main에서 출력 테스트
		
		int money = 1600;
		Cafe cafe = new Cafe();
		
//		int pay = cafe.coffeePay(money);
//		int cup = cafe.coffeeMake(money);
//		System.out.printf("고객님 커피 %d잔과 잔돈 %d원 나왔습니다.", cup, pay);
		
		// TODO 13. 사용했던 메소드는 주석처리함.
		//			통합으로 실행했던 메소드 stoneBucks()를 실행 
		//			메소드를 실행하면, 잔수와 잔돈이 있는 CarrierCoffee 객체를 반환함. 
		CarrierCoffee crr = cafe.stoneBucks(money);
		
		// TODO 15. 출력을 하면 객체의 겉을 출력(생성된 설계도(class)와 고유값(hashcode)를 출력)
		// TODO 16. 출력을 위해서 객체를 접근해서 안에 있는 값을 출력
		// TODO 17. 객체를 찾아가서 안에 있는 멤버 필드를 출력하는게 힘들기 때문에
		//			객체에 출력을 위한 메소드를 선언하여 사용하자.
		crr.print();
		
	}
}
