package com.woon.IterWord;

public class IterationWord_Sequence {

	public void IterationWord(String s) {

		int strLen = s.length(); // 전체 길이
		char[] strArr = s.toCharArray(); // 입력값의 요소
		int halfLen = strLen / 2 + 1; // 연산 되어야 할 범위

		StringBuffer sb = new StringBuffer(halfLen); // 문자열을 담을 기본 크기

		int answer = strLen;

		for (int i = 1; i < halfLen; i++) {
			sb.append(strArr[i - 1]);
			
			if(strLen % i == 0) {
				String subStr = sb.toString();
				StringBuffer sb2 = new StringBuffer(strLen);
				
				int loopCnt = strLen / i;
				for (int j = 0; j < loopCnt; j++) {
					sb.append(subStr);
				}
				
				if(sb2.toString().equals(s)) {
					answer = subStr.length();
					break;
				}
			}
		}
		
		System.out.println(answer);
	}
}
