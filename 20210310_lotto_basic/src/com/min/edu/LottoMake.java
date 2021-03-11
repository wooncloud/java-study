package com.min.edu;

import java.util.Arrays;

public class LottoMake {

	private int[] lotto;

	public LottoMake() {
		this(6);
	}

	public LottoMake(int n) {
		lotto = new int[n];
		lottoBall();
	}

	// 랜덤 1~ 45의 숫자가 랜덤 반환
	private int makeNum() {
		return (int) (Math.random() * 45) + 1;
	} // makeNum

	// 중복체크 : 한개의 숫자와 멤버필드의 배열의 한개의 값이 같으면
	private boolean iscLotto(int rNum) {
		boolean isc = false;
		for (int i = 0; i < getLotto().length; i++) {
			if (getLotto()[i] == rNum) {
				isc = true;
				break;
			}
		}
		return isc;
	} // iscLotto

	// 로또 랜덤 6개 숫자 생성
	private void lottoBall() {
		int idx = 0;
		do {
			int ball = makeNum();

			if (!iscLotto(ball)) {
				getLotto()[idx++] = ball;
			}

		} while (idx < getLotto().length);
	}

	public int[] getLotto() {
		return lotto;
	}

	public void print() {
		int[] sortLotto = lotto.clone();
		Arrays.sort(sortLotto);
		
		String r = "";
		for (int i = 0; i < sortLotto.length - 1; i++) {
			r += wordTwo(sortLotto[i]) + " ";
		}
		r += wordTwo(sortLotto[sortLotto.length - 1]);
		System.out.println(r);
	}

	private String wordTwo(int n) {
		String r = "";
		String tmp = String.valueOf(n);
		return tmp.length() == 2 ? tmp : "0" + n;
	}

	@Override
	public String toString() {
		return Arrays.toString(lotto);
	}
}
