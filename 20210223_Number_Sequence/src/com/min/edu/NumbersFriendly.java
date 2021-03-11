package com.min.edu;

import com.edu.util.num.ProperDivisor;

public class NumbersFriendly {

	/**
	 * 범위를 입력하면 범위내 친화수를 찾아 출력하는 함수
	 * 
	 * @param range 친화수 추출을 위한 범위 수
	 */
	public void friendlyIteration(int range) {

		// yaksuSumCal를 사용하기 위한 객체 생성
		ProperDivisor proper = new ProperDivisor();

		// 범위내 친화수를 찾았는지 여부를 알려주는 flag
		boolean isFind = false;

		for (int i = 2; i < range; i++) {
			// i의 진약수 합을 구함
			int sum1 = proper.yaksuSumCal(i);
			// i의 진약수 합을 구한것의 진약수의 합
			int sum2 = proper.yaksuSumCal(sum1);

			// 친화수인지 확인하려면 i와 i의 진약수의 합의 진약수의 합이 같아야 함.
			// sum1과 sum2가 같은경우 제외 (완전수 제외)
			if (sum1 != sum2 && sum1 > i && i == sum2) {
				System.out.printf("%d의 친화수는 %d 입니다.\n", i, sum1);
				isFind = true;
			}
		}

		// 친화수가 없으면 친화수 없음을 표시
		if (!isFind) {
			System.out.println("범위 내 친화수 없음.");
		}
	}

	public void friendly(int range) {
		ProperDivisor pd = new ProperDivisor();

		for (int i = 2; i <= range; i++) {

			for (int j = 2; j <= range; j++) {

				if ((i != j) && (i == pd.yaksuSumCal(i) && j == pd.yaksuSumCal(i))) {
					System.out.printf("%d와 %d는 친화수로 판단됨", i, j);
				}
			}
		}
	}

}