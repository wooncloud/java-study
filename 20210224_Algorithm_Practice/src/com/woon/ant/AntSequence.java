package com.woon.ant;

public class AntSequence {

	public void antSequence(int count) {
		String num = "11";

		for (int i = 0; i < count; i++) {
			System.out.println(num);
			num = antLogic(num);
		}
	}
	
	private String antLogic(String init) {

		String result = "";

		// a가 b개
		int cnt = 1; // b
		char target = 0; // a

		for (int i = 0; i < init.length();) {

			target = init.charAt(i);

			int num = i + 1;
			while (num < init.length() && target == init.charAt(num)) {
				cnt++;
				num++;
			}

			result = result + target + cnt;
			i = num;
			cnt = 1;
		}

		return result;
	}

}
