package com.lotto.woon;

public class LottoResult {

	// 꽝, 1등, 2등, 3등, 4등, 5등 
	// rankCnt[5]
	private int[] rankCnt = new int[6];
	
	public LottoResult(LottoGroup[] groups) {
		
		for (LottoGroup g : groups) {
			for (LottoSet s : g.lottoSets) {

				if (s == null) {
					break;
				} else {
					rankCnt[s.getRank()]++;
				}
			}
		}
	}
	
	
	public void printRanks() {
		
		for (int i = 0; i < rankCnt.length; i++) {
			
		}
		
	}
}
