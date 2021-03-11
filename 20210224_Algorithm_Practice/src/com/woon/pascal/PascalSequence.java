package com.woon.pascal;

import java.util.Arrays;

public class PascalSequence {

	public void pascalTriangle(int stage) {
		// 처음값 1
		String str = "1";

		for (int i = 0; i < stage; i++) {
			String[] strs = str.split(" ");

			// 삼각형 모양 만드는 코드
			for (int j = 0; j < stage - i; j++) {
				System.out.print(" ");
			}

			System.out.println(Arrays.toString(strs));

			if (str.length() == 1) {
				str = "1 1";
			} else {
				String newStr = "";
				for (int j = 0; j < strs.length - 1; j++) {
					newStr += String.valueOf(Integer.parseInt(strs[j]) + Integer.parseInt(strs[j + 1])) + " ";
				}

				str = "1 ".concat(newStr).concat("1");
			}
		}

	}

}
