package com.min.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class UseAPICalendar {

//	int dayOfWeek = (days(year, month, 1) + 1 - 1) % 7;
//	int dayOfMonth = dayOfMonth(year, month); // for문 length를 위함
//	int beforeDay = beforeDay(year, month);

	/**
	 * 1. 입력받은 년월일의 첫번째 1일의 요일<br>
	 * 2. 입력받은 년월의 최대 일수 <br>
	 * 3. 입력받은 년월의 이전 달의 최대 일 수<br>
	 * <br>
	 * 주의) 1970년도 이전 달력은 API에서 적용 안됨 <br>
	 */

	public static void main(String[] args) {
		// java.util.Calendar를 사용하는 방법
		// java.util.Gregorian.Calendar를 사용하는 방법

		// Calendar 클래스는 abstract(추상)로 미완성(선언만)된 멤버를 포함하고 있다.
		// 그래서 new를 하면 abstract멤버를 모두 구현하면 사용 가능.

		Calendar cal = Calendar.getInstance(); // 사용법 1
		GregorianCalendar gCal = new GregorianCalendar(); // 사용법 2

		// 1) 구해보자
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int dayOfWeekG = gCal.get(Calendar.DAY_OF_WEEK);

		System.out.println(dayOfWeek);
		System.out.println(dayOfWeekG);

		switch (dayOfWeek) {
		case Calendar.SUNDAY:
			System.out.println("일요일");
			break;
		case Calendar.MONDAY:
			System.out.println("월요일");
			break;
		case Calendar.TUESDAY:
			System.out.println("화요일");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("수요일");
			break;
		case Calendar.THURSDAY:
			System.out.println("목요일");
			break;
		case Calendar.FRIDAY:
			System.out.println("금요일");
			break;
		case Calendar.SATURDAY:
			System.out.println("토요일");
			break;
		default:
			break;
		}

		// ---------------------------------------------------------
		// 2) 최대 일수를 구해보자
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);

		// ---------------------------------------------------------
		// 3) 생성된 객체는 현재 시스템의 정보를 사용하여 세팅되어 있다.
		// 원하는 년도와 월을 입력하면 그 년도와 월로 세팅이 되어야 함.
		gCal.set(2021, 3 - 1, 3);
		int newDayOfWeek = gCal.get(Calendar.DAY_OF_WEEK);
		System.out.println(newDayOfWeek);
	}
}
