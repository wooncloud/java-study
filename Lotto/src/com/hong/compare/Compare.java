package com.hong.compare;

import com.lotto.main.WinningNumbers;
import com.woo.data.Set;

public class Compare {
	
	// 비교하기
	// 등수 출력
	public void Compare(Set set) {
		int[] arr = set.getNumbers();
		int[] win = WinningNumbers.getWinningNumbers();
		for (int i = 0; i < win.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] == win[i]) {
					System.out.println("1등입니다.");			}
				}
			
		}
		
	}
}
