package com.min.calendar;

/**
 * 만년 달력을 출력해보자.
 * 
 * @author wooncloud
 *
 */
public class MyCalendar {

	/**
	 * 윤년의 최대 일수를 담고 있는 배열을 선언
	 */
	public final int[] LEAF = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	/**
	 * 평년의 최대 일수를 담고 있는 배열을 선언
	 */
	public final int[] PLAIN = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	/**
	 * 년도를 입력받아 판단하여 윤년 여부를 반환함
	 * 
	 * @param year 년도
	 * @return 윤년이면 true
	 */
	public boolean isCheck(int year) {
		boolean isc = false;

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			isc = true;
		}

		return isc;
	}

	/**
	 * 입력받은 달이 몇일인지 출력하는 메서드<br>
	 * 윤년인지, 평년인지 확인도 함.
	 * 
	 * @param year  년도
	 * @param month 월
	 * @return
	 */
	public int dayOfMonth(int year, int month) {
		int days = 0;

		if (isCheck(year)) {
			// 윤년
			days = LEAF[month - 1];
		} else {
			days = PLAIN[month - 1];
			// 평년
		}

		return days;
	}

	// 2021년 3월 달력
	/**
	 * 년도 까지 누적 1 ~ 2020
	 * 
	 * @param year
	 * @return
	 */
	public int days(int year) {
		int day = 0;

		// 1년부터
		for (int i = 1; i < year; i++) {
			if (isCheck(year)) {
				day += 366;
			} else {
				day += 365;
			}
		}

		return day;
	}

	/**
	 * 달 누적
	 * 
	 * @param year
	 * @param month
	 * @return
	 */
	public int days(int year, int month) {
		int day = days(year);

		for (int i = 1; i < month; i++) {
			if (isCheck(year)) {
				day += LEAF[i - 1];
			} else {
				day += PLAIN[i - 1];
			}
		}

		return day;
	}

	/**
	 * 일 누적
	 * 
	 * @param year
	 * @param month
	 * @return
	 */
	public int days(int year, int month, int date) {
		int day = days(year, month);

		day += date;

		return day;
	}

	/**
	 * 현재 년, 월을 입력하면 이전 달 일수를 가져옴.<br>
	 * @author wooncloud 
	 * 
	 * @param year
	 * @param month
	 */
	public int dayOfPreMonth(int year, int month) {
		// 솔직히 common하게 하면 달을 +1 -1씩 하면 몇월인지 나오는 함수를 만드는게 나을듯
		int preYear = year;
		int preMonth = month;

		if (preMonth <= 1) {
			preMonth = 12;
			preYear--;
		} else {
			preMonth--;
		}

		return dayOfMonth(preYear, preMonth);
	}

	/**
	 * @author 선생님
	 * 
	 * @param year
	 * @param month
	 * @return
	 */
	public int beforeDay(int year, int month) {
		int maxDay = 0;

		if (month == 1) {
			maxDay = dayOfMonth(year - 1, 12);
		} else {
			maxDay = dayOfMonth(year, month - 1);
		}

		return maxDay;
	}

	public void calendarMethod(int year, int month) {
		System.out.printf("\t\t%s년\t\t%s월\n", year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		// days + 1 - 1
		// 일수 + (1년 1월 1일은 월요일이라 해서 +1) - (그 이전날 공백까지 출력해야 해서 -1)

		// 이전 달력의 공백
		int dayOfWeek = (days(year, month, 1) + 1 - 1) % 7;
		int dayOfMonth = dayOfMonth(year, month); // for문 length를 위함

		// ------------------------------
		
		// 선생님 강의
		int beforeDay = beforeDay(year, month);
		for (int i = beforeDay - dayOfWeek +1; i <= beforeDay; i++) {
			System.out.printf("[%d]\t", i);
		}
		
//		// 이전 달의 일수 채우기
//		for (int i = 0; i < dayOfWeek; i++) {
//			// 만약 일자로 알고 싶으면 이전 달의 일수를 알아야 한다.
//			// 이전달의 개수 - (dayOfWeek - i)
//			int preDay = dayOfPreMonth(year, month) - (dayOfWeek - i) + 1;
//
//			System.out.printf("[%d]\t", preDay);
//		}

		// ------------------------------
		
		// 달력 찍기
		for (int i = 1; i <= dayOfMonth; i++) {
			System.out.printf("%d\t", i);

			if ((dayOfWeek + i) % 7 == 0) {
				System.out.println();
			}
		}
		
		// ------------------------------

		// 달력 출력 후 뒷 부분의 빈 공간에 다음달 달력을 출력
		int afterDay = (7 - (dayOfWeek + dayOfMonth) % 7) % 7;
		// 다음 달의 일수 채우기
		for (int i = 1; i <= afterDay; i++) {
			System.out.printf("[%d]\t", i);
		}

	}

	// 메소드 오버로딩 1년치 출력
	public void calendarMethod(int year) {

		for (int i = 1; i <= 12; i++) {
			calendarMethod(year, i);
			System.out.println("\n\n---------------------------------------------\n");
		}

	}
}
