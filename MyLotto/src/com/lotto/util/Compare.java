package com.lotto.util;

import com.lotto.woon.LottoGroup;
import com.lotto.woon.LottoSet;
import com.lotto.woon.WinnerNumbers;

public class Compare {

	public static boolean containCheck(int[] arr, int num) {
		boolean isc = false;

		for (int n : arr) {
			if (num == n) {
				isc = true;
				break;
			}
		}

		return isc;
	}
	
	
	public void compareAll(LottoGroup[] groups) {
		for (int i = 0; i < groups.length; i++) {
			
			LottoSet[] lottoSets = groups[i].lottoSets;
				
			for (int j = 0; j < lottoSets.length; j++) {
				if(lottoSets[j] == null)
				{
					break;
				}
				
				compareSet(lottoSets[j]);
			}
			
		}
	}
	

	// 각 세트단위로 비교
	private void compareSet(LottoSet set) {
		WinnerNumbers wn = WinnerNumbers.getInstance();

		for (int n : set.getNumbers()) {
			for (int winNum : wn.getNumbers()) {
				if (n == winNum) {
					// 맞춘갯수 ++
					set.addHitCnt();
				}
			}

			// 보너스 판단
			if (n == wn.getBonus()) {
				set.setBonusHit(true);
			}
		}

		// 등수 판단
		checkRank(set);
	}

	// 등수 판단
	private void checkRank(LottoSet set) {
		// 1등
		if (set.getHitCnt() == 6) {
			set.setRank(1);
		}
		// 2등
		else if (set.getHitCnt() == 5 && set.isBonusHit()) {
			set.setRank(2);
		}
		// 3등
		else if (set.getHitCnt() == 5) {
			set.setRank(3);
		}
		// 4등
		else if (set.getHitCnt() == 4) {
			set.setRank(4);
		}
		// 5등
		else if (set.getHitCnt() == 3) {
			set.setRank(5);
		}
	}
}
