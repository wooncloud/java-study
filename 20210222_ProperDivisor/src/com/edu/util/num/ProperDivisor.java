package com.edu.util.num;

/**
 * 진약수에 관련된 기능을 담는 라이브러리
 * @author Woo Seong Ho
 * @since 2021.02.22
 * @version 1.0b
 */
public class ProperDivisor {

	/**
	 * 입력받은 수의 진약수의 합을 구하는 메소드
	 * @param num 진약수의 합을 원하는 숫자
	 * @return num의 진약수의 합
	 */
	public int yaksuSumCal(int num) {
		int cnt = 0;
		int sum = 0;
		
		// 0은 제외되어서 1부터 시작
		for (int i = 1; i < num; i++) {
			if (checkYaksu(num, i)) {
				cnt++;
				sum += i;
			}
		}
		
//		System.out.println("총 약수의 갯수 : " + cnt);
//		System.out.println("총 약수의 합 : " + sum);
		
		return sum;
	}
	

	/**
	 * 숫자 2개를 비교하여, 약수 여부를 판단
	 * @param num 기준 입력값
	 * @param val 비교 입력값
	 * @return true : 약수 / false : not 약수
	 */
	private boolean checkYaksu(int num, int val) {
		boolean isc = false;

		if (num % val == 0) {
			isc = true;
		}

		return isc;
	}
	
}
