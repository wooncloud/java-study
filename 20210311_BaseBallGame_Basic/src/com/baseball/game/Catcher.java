package com.baseball.game;

public class Catcher {

	private int[] randomBall = null;

	public Catcher(int a, int start, int end) {
		randomBall = new int[a];

		int count = 0; // 입력되는 배열의 index 번호로 사용.

		do {
			int r = oneRandom(start, end);

			if (!duplCheck(randomBall, r)) { // 중복 아니면
				randomBall[count++] = r;
			}

			if (count >= a) {
				break;
			}
		} while (true);
	}

	/**
	 * 
	 * @param inputBall
	 * @return
	 */
	public String compare(int[] inputBall) {
		int strike = 0, ball = 0;
		String result = "";

		// 비교
		for (int i = 0; i < inputBall.length; i++) {
			if (inputBall[i] == randomBall[i]) {
				strike++;
			} else {
				for (int j = 0; j < randomBall.length; j++) {
					if (i != j && randomBall[j] == inputBall[i]) {
						ball++;
					}
				}
			}
		}

		result = String.format("%dS, %dB", strike, ball);

		return result;
	}

	private int oneRandom(int start, int end) {
		return (int) (Math.random() * end) + start;
	}

	private boolean duplCheck(int[] checkBall, int random) {
		boolean isc = false;

		for (int ball : checkBall) {
			if (ball == random) {
				isc = true;
				break;
			}
		}

		return isc;
	}
}
