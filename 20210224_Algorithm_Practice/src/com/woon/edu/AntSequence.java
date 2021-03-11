package com.woon.edu;

public class AntSequence {
	
	public void sequenceProcess(int rotationCnt) {
		
		String initNum = "11";
		String temp = "";
		String sumStr = "";
		
		char entity = 0;
		int eCnt = 0;
		
		temp = initNum;
		System.out.println(temp);
		
		for (int i = 0; i < rotationCnt; i++) {
			
			for (int j = 0; j < temp.length(); j++) {
				char ch = temp.charAt(j);
				
				if(entity == 0) {
					sumStr += String.valueOf(ch);
					entity = ch;
					eCnt++;
				}
				else if(entity == ch) {
					eCnt++;
				}
				else {
					sumStr += String.valueOf(eCnt);
					entity = 0;
					eCnt = 0;
				}
			} // 글자 수만큼 for문
			
			if(entity != 0) {
				sumStr += String.valueOf(eCnt);
			}
			
			temp = sumStr;
			sumStr = "";
			System.out.println(temp);
			
		} // 개미수열 몇번 돌릴지 for 문
	}
	
}
