package com.woon.amicable;

public class AmicableNumbers {

	public int amicableNumbersProcess(int num) {
		int result1 = 0;
		int result2 = 0;

		// 약수 모두 더하기
		result1 = getAmicableNumbers(num);

		// 찬화수인지 확인하기 위한 result1의 약수 모두 더하기
		result2 = getAmicableNumbers(result1);

		// 친화수를 리턴, 친화수가 없으면 -1;
		return (num == result2) ? result1 : -1;
	}

	/**
	 * 
	 * @param num
	 * @return
	 */
	public int getAmicableNumbers(int num) {
		int tmp = 0, sum = 0;
		int cnt = num / 2 + 1;

		// num - 1 하는 이유는 마지막에 자기 자신을 더하는 것을 뺴기 위해
		for (int i = 0; i < cnt - 1; i++) {
			tmp = i + 1;

			sum += checkDivisor(num, tmp);
			// System.out.println(debug);
		}

		return sum;
	}

	/**
	 * 
	 * @param num
	 * @param i
	 * @return
	 */
	private int checkDivisor(int num, int i) {
		return (num % i == 0) ? i : 0;
	}

}
