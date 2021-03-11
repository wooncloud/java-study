package com.lotto.woon;

import java.util.Arrays;

import com.lotto.util.RandomGanerator;

public class LottoSet {

	private int[] numbers = new int[6];
	private int rank = 0;
	private int hitCnt = 0;
	private boolean bonusHit = false;
	private boolean isAuto = false;

	// 자동 Set를 만듦
	public LottoSet() {
		this.isAuto = true;
		numbers = RandomGanerator.LottoRandom(numbers.length);
	}

	// 수동 입력받은 값을 넣어 수동 Set를 만듦
	public LottoSet(int[] numbers) {
		this.isAuto = false;
		this.numbers = numbers;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public boolean isAuto() {
		return isAuto;
	}

	public int getHitCnt() {
		return hitCnt;
	}

	public void addHitCnt() {
		this.hitCnt++;
	}

	public boolean isBonusHit() {
		return bonusHit;
	}

	public void setBonusHit(boolean bonusHit) {
		this.bonusHit = bonusHit;
	}
	
	@Override
	public String toString() {
		String isAuto = this.isAuto ? "자동" : "수동";
		String temp = Arrays.toString(numbers);
		temp = temp.replace("[", "");
		temp = temp.replace("]", "");
		String[] tmpSplit = temp.split(", ");
		
		String marge = String.format("[%s] [", isAuto);
		for (int i = 0; i < tmpSplit.length; i++) {
			marge += String.format("%02d", (int)Integer.parseInt(tmpSplit[i]));
			
			if(i < tmpSplit.length - 1) {
				marge+= ", ";
			}
		}
		
		return String.format("%s]", marge);
	}
}