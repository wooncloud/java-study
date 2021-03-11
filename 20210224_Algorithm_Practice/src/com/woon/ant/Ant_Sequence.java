package com.woon.ant;

// 문자열 "11" 첫번째 문자형과 두번째 문자형을 비교하여
// true 첫번째와 두번째가 같다면 count 증가
// false 첫번째외 두번째가 다르다면 첫번째의 count가 1이라고 누적을 한 후
// count를 1로 초기화하고 비교대상의 첫번째 값으로 변경한다.
public class Ant_Sequence {
	
	public void antIteration(int stage) {
		String init = "11";
		
		for (int i = 0; i < stage; i++) {
			System.out.println(init);
			init = antMake(init);
		}
	}
	
	/**
	 * 베르나르 베르베르의 개미수열 로직
	 * @param init 초깃값 "11"
	 */
	private String antMake(String init) {
		// 최종결과를 누적하는 변수 concatenation
		String result = "";
		
		// 모든 요소는 자신의 값 1회를 가지고 있음
		int cnt = 1;
		
		// 처음의 비교대상의 기준이 되는 요소는 초기값으로 만듬
		char ch = init.charAt(0);
		for (int i = 1; i < init.length(); i++) {
			
			if(ch == init.charAt(i)) {
				cnt++;
			}
			else {
				result = result + ch + cnt;
				ch = init.charAt(i);
				cnt = 1;
			}
			
		} // for문 끝
		
		result = result + ch + cnt;
//		System.out.println(result);
		
		return result;
	}
	
}
