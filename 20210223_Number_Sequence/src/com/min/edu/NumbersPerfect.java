package com.min.edu;

import com.edu.util.num.ProperDivisor;

public class NumbersPerfect {

	/**
	 * 범위에 있는 완전수를 출력해주는 메소드
	 * @param range 
	 */
	public void perfectIteration(int range) {
		// 사용할 라이브러리 생성
		ProperDivisor proper = new ProperDivisor();

		// 2 ~ 20(19)
		for (int i = 2; i < range; i++) {
			
			// 연산 합
			int sum = proper.yaksuSumCal(i);
			
			// 입력 i와 계산된 sum이 같다면 
			if(i == sum) {
				System.out.println("완전수는 " + sum);
			}
		}
	}
	
}
