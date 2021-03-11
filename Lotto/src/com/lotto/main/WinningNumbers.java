package com.lotto.main;

import com.lotto.util.Random;

/**
 * 당첨 번호를 담는 클래스
 * 
 * @author Woo
 *
 */
public class WinningNumbers {
	// 길이 6
	private static int[] winningNumbers = new int[6];
	private static int bonus;

	public WinningNumbers() {
		for (int i = 0; i < winningNumbers.length; i++) {
			winningNumbers[i] = Random.GetRandomNumber();
		}
		
		bonus = Random.GetRandomNumber();
	}

	public static int getBonus() {
		return bonus;
	}

	public static int[] getWinningNumbers() {
		return winningNumbers;
	}
}
