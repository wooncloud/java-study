package com.min.calendar;

import java.util.Calendar;

public class API_Calendar {

	public void calendarMethod(int year, int month) {
		System.out.printf("\t\t%s년\t\t%s월\n", year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		Calendar cal = Calendar.getInstance();
		
		// 이번 달
		cal.set(year, month - 1, 1);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK) - 1; // 이전 요일;
		int dayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		// 이전 달
		cal.set(year, month - 1 - 1, 1);
		int beforeDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		// 이전 달의 일수 채우기
		for (int i = beforeDay - dayOfWeek + 1; i <= beforeDay; i++) {
			System.out.printf("[%d]\t", i);
		}
		
		// 달력 찍기
		dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		for (int i = 1; i <= dayOfMonth; i++) {
			System.out.printf("%d\t", i);

			if ((dayOfWeek + i) % 7 == 0) {
				System.out.println();
			}
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
