package com.lotto.woon;

import java.util.Arrays;
import com.lotto.util.RandomGanerator;

public class WinnerNumbers {

	// 싱글턴
	private static WinnerNumbers winner;
	private int[] numbers = new int[6];
	private int bonus;

	private WinnerNumbers() {
		numbers = RandomGanerator.LottoRandom(6);

		boolean isc = false;

		int bTmp = 0;
		do {
			isc = false;
			bTmp = RandomGanerator.oneLottoRandom();
			for (int i : numbers) {
				if (bTmp == i) {
					isc = true;
				}
			}
		} while (isc);
		
		bonus = bTmp;
	}

	// 싱글턴
	public static WinnerNumbers getInstance() {
		if (winner == null) {
			winner = new WinnerNumbers();
		}

		return winner;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public int getBonus() {
		return bonus;
	}

	@Override
	public String toString() {
		return Arrays.toString(numbers) + " + [" + bonus + "]";
	}

}
