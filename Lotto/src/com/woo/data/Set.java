package com.woo.data;

/**
 * 로또 1000원당 뽑을수 있는 정보 클래스
 */
public class Set {
	
	// 1000원당 뽑을 수 있는 번호들을 담는 수
	private int[] numbers = new int[6];
	// 한 줄이 몇등이 뽑혔는지 정보를 담는 변수 
	private int rank;
	// 자동으로 뽑았는지 수동으로 뽑았는지 담는 변수
	private boolean isAuto;
	
	public Set(boolean isAuto) {
		this.isAuto = isAuto;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
}
