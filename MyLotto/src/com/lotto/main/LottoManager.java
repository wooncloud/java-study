package com.lotto.main;

import com.lotto.util.CalLotto;
import com.lotto.util.Compare;
import com.lotto.util.InputUtil;
import com.lotto.woon.LottoGroup;
import com.lotto.woon.LottoSet;
import com.lotto.woon.WinnerNumbers;

public class LottoManager {

	// 싱글턴
	private static LottoManager manager;

	private LottoManager() {
	}

	public static LottoManager getInstance() {
		if (manager == null) {
			manager = new LottoManager();
		}

		return manager;
	}

	public void lottoStart() {
		int groupCnt = 0;
		int setCnt = 0;
//		int remainderCnt = 0;
		int money = 0;

		InputUtil iv = new InputUtil(); // 입력 객체
		System.out.println("[ -- 로또를 시작합니다. -- ]\n");

		// 당첨번호
		WinnerNumbers wn = WinnerNumbers.getInstance();

		money = getMoney(); // 받은 돈
		setCnt = CalLotto.calMoney(money); // 판 수
		groupCnt = (setCnt / 5) + 1; // 종이 수
//		remainderCnt = setCnt % 5; // 나머지

		if (setCnt <= 0) {
			return;
		}

		// 수동 횟수 구하기
		int manualCnt = getManualCnt(setCnt);
		int autoCnt = setCnt - manualCnt;

		// 종이 수 뽑기
		LottoGroup[] groups = new LottoGroup[groupCnt];
		for (int i = 0; i < groups.length; i++) {
			groups[i] = new LottoGroup();
		}

		int i = 0;
		while (autoCnt > 0) {
			if (groups[i].addSet(new LottoSet())) {
				i++;
			} else {
				autoCnt--;
			}
		}
		while (manualCnt > 0) {
			if (groups[i].addSet(new LottoSet(iv.inputLottoLine()))) {
				i++;
			} else {
				manualCnt--;
			}
		}

		// -------------------
		// 비교하기
		Compare cp = new Compare();
		cp.compareAll(groups);

		// -------------------
		// 결과출력
		int divider = 0;
		for (LottoGroup g : groups) {
			for (LottoSet s : g.lottoSets) {

				if (s == null) {
					break;
				} else {
					System.out.print(s);

					if (s.getRank() == 0) {
						System.out.print("\t[꽝]\n");
					} else {
						System.err.printf("\t[%d등]\n", s.getRank());
					}
				}
				
				if(divider < 4) {
					divider++;
				}
				else {
					divider = 0;
					System.out.println("---------------------------");
				}
			}
		}
		System.out.println("\n" + wn); // 당첨번호 테스트

	}

	// 돈 지불 메서드
	private int getMoney() {
		System.out.print("> 얼마 지불하시겠습니까? : ");
		InputUtil iv = new InputUtil();
		return iv.inputInt();
	}

	// 수동 횟수 메서드
	private int getManualCnt(int setCnt) {
		int menualCnt = 0;

		while (true) {
			System.out.print("> 수동은 몇회 하시겠습니까? : ");
			InputUtil iv = new InputUtil();
			menualCnt = iv.inputInt();

			if (menualCnt > setCnt) {
				System.err.println("[횟수를 초과 했습니다. 다시 입력해 주세요.]");
			} else {
				break;
			}
		}

		return menualCnt;
	}

}
