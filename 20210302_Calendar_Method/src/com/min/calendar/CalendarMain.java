package com.min.calendar;

public class CalendarMain {

	public static void main(String[] args) {

		MyCalendar cal = new MyCalendar();
//
//		int cnt = 0;
//		for (int year = 1; year < 2021; year++) {
//			if (cal.isCheck(year)) {
//				cnt++;
//			}
//		}
//
//		System.out.println(cnt);
//
//		System.out.println(cal.dayOfMonth(2021, 2));
//		System.out.println(cal.dayOfMonth(2020, 2));
//
//		int day = cal.days(2021, 3, 2);
//
//		System.out.println(day);
//
//		int startDay = cal.days(2021, 2, 8);
//		int endDay = cal.days(2021, 3, 2);
//		
//		System.out.println(endDay - startDay);
		
		// 2021년 3월 1일의 요일을 알고 싶다.
//		int day = cal.days(2021, 3, 1);
//		day = day % 7 + 1 - 1; // 1년 1월 1일은 월요일이다. / 구한 값은 1일에 요일 / 전달의 마지막 요일을 구해야 한다.
//		System.out.println("3/1 요일 계산 : " + day);

		// cal.calendarMethod(2021);
		
		API_Calendar apiCal = new API_Calendar();
		apiCal.calendarMethod(2021);
		
	} // main
}