package com.min.set;

import java.util.HashSet;
import java.util.Set;

public class Set_Feature3 {
// 자료형 구조를 기본배열로 변환

	private Set<Integer> set;

	public Set_Feature3() {
		set = new HashSet<Integer>();
	}

	private int randomNum() {
		return (int) (Math.random() * 10) + 1;
	}

	public void inputNumSet() {
		while (getSet().size() < 6) {
			int n = randomNum(); // 10까지 랜덤 숫자가 생성
			getSet().add(n); // int -> Integer (auto boxing이 발생)
		}
	}

	public Set<Integer> getSet() {
		return set;
	}

}
