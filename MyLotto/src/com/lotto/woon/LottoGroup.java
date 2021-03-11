package com.lotto.woon;

import java.util.Arrays;

public class LottoGroup {

	public final static int MAX_SET_COUNT = 5;
	public LottoSet[] lottoSets = new LottoSet[MAX_SET_COUNT];

	public LottoGroup() {
		Arrays.fill(lottoSets, null);
	}

	public boolean addSet(LottoSet set) {
		boolean isfull = true;

		for (int i = 0; i < lottoSets.length; i++) {
			
			if (lottoSets[i] == null) {
				lottoSets[i] = set;
				isfull = false;
				break;
			}
		}

		return isfull;
	}

}
