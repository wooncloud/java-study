package com.min.edu;

//TODO 02. 커피기능을 가지고 있는 클래스
//			입력받은 돈을 계산하여 몫(커피잔수)를 계산 -> 반환
//			입력받은 돈을 계산하여 나머지 (잔돈)을 계산 -> 반환
/**
 * 1. coffee 메소드를 실행시켜 커피의 잔수가 입력된 금액에 따라 자동으로 나오는 메소드<br>
 * 2. 커피의 잔수가 입력된 금액에 따라서 자동으로 잔돈이 나오는 메소드
 */
public class Cafe {
	
	// TODO 03. 접근 제한자를 public으로 생성하고 잔수(int)를 반환하고 돈(int)를 입력 받는 메소드
	// TODO 09. 외부에서 사용하지 못하도록 private로 변경
	/**
	 * 사용자가 커피를 주문하는 메소드
	 * @param money 정수의 돈
	 * @return 커피의 잔수
	 */
	private int coffeeMake(int money) {
		int n = 0;
		
		n = money / CafeMenu.AMERICANO;
		
		return n;
	}
	
	// TODO 06. 입력받은 돈의 잔돈을 계산하여 그 결과는 int값을 반환.
	// TODO 09. 외부에서 사용하지 못하도록 private로 변경
	/**
	 * 커피 주문 후 잔돈을 반환하는 메소드
	 * @param money 받은 돈
	 * @return int 잔돈
	 */
	private int coffeePay(int money) {
		int pay = 0;
		pay = money % CafeMenu.AMERICANO;
		return pay;
	}
	
	
	/**
	 * 돈을 받고 한번의 주문으로 커피와 잔돈을 한번에 처리하는 메소드
	 * @param money 지불하는 돈
	 * @return CarrierCoffee pay와 cup을 담는 캐리어
	 */
	// TODO 08. 메소드가 두개로 되어 있어서 사용하기 힘든 구조로 되어 있다.
	// 			두개의 메소드 새로 생성하지 않고 내부에서 작동되는 메소드로 선언
	//			두개의 결과를 묶을 수 있는 사용자 클래스는 생성하여 반환타입으로 만든다.
	//			담을 수 있는 객체(CarrierCoffee)를 생성한 후 
	//			private로 변경한 각 기능(잔, 잔돈)을 실행하여 결과를 담는다.
	//			마지막으로 반환한다.
	//			(CarrierCoffee 사용하는 이유 : arguments는 여러개 일 수 있지만 반환은 단 하나뿐이기 때문)
	// TODO 12. 위 조건에 맞도록 메소드를 선언한다.
	public CarrierCoffee stoneBucks(int money) {
		CarrierCoffee carrier = new CarrierCoffee();
		
		carrier.cup = coffeeMake(money);
		carrier.pay = coffeePay(money);		
	 
		return carrier;
	}
}
