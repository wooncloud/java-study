package com.lotto.util;

import java.util.Arrays;
import java.util.HashSet;

public class RandomGanerator {

	public static int[] LottoRandom(int length) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < length; i++) {
			while (true) {
				if (set.add(oneLottoRandom())) {
					break;
				}
			}
		}

		Integer[] arrInteger = new Integer[set.size()];
		arrInteger = set.toArray(arrInteger);
		int[] arr = Arrays.stream(arrInteger).mapToInt(i -> i).toArray();
		arr = SortArray.sort(arr);
		
		return arr;
	}

	public static int oneLottoRandom() {
		return (int) (Math.random() * 45) + 1;
	}
}
