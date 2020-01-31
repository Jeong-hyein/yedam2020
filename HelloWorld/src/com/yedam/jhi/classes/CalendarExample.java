package com.yedam.jhi.classes;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {
//	java.Calendar가 제공하는 메소드를 이용

	while(true)
	{
//			Scanner scn = new Scanner(System.in);
		System.out.println("년 입력: ");
		year = scn.nextInt();
		System.out.println("월 입력: ");
		mon = scn.nextInt();
		System.out.println("<<" + year + "년" + mon + "월" + ">>");
		String[] day = { "일", "월", "화", "수", "목", "금", "토" };
		int days = cal.get(Calendar.MONTH);
		int firstDay = cal.get(mon);

	}

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
		System.out.println("년 입력 0:종료 ");
		int year = scn.nextInt();
		System.out.println("월 입력>  ");
		int month = scn.nextInt();
		createCal(year,month); 
	}
	
		System.out.println();
		
		
		createCal(2020,1);
		
		System.out.println("----------------------------");
		int year, month;
		month = 2;
		year = 2020;
		createCal(year, month);

//		java.util Calendar아니라 classes.Calendar를 가져온다.
//		Calendar c = new Calendar(); 
		Calendar cal = Calendar.getInstance(); // 인스턴스를 만들고
		System.out.println("현재 년도: " + cal.get(Calendar.YEAR));
		System.out.println("현재 월: " + cal.get(Calendar.MONTH));
		System.out.println("현재 일: " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("오늘 요일: " + cal.get(Calendar.DAY_OF_WEEK)); // 1:일요일 2:월요일

		cal.set(2020, 0, 1); // cal은 원래 오늘날짜, 2020년1월1일로 셋팅하겠다는 의미
		System.out.println("현재 년도: " + cal.get(Calendar.YEAR));
		System.out.println("현재 월: " + cal.get(Calendar.MONTH)); // 0:1월 , 1:2월
		System.out.println("현재 일: " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("오늘 요일: " + cal.get(Calendar.DAY_OF_WEEK));
//		getActualMaximum:달의 마지막날을 가지고 있음
		System.out.println("전체일수: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));

		System.out.println("------------------------------------------");
		String[] day = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		
//		요일 출력.
		for (int i = 0; i < day.length; i++) {
			System.out.print(" " + day[i]);
		}
		System.out.println();

//		월의 첫째날의 시작위치 지정. 
		for (int i = 0; i < firstDay - 1; i++) {
			System.out.print("    ");
		}

//		7일씩 잘라서 출력. 

		for (int i = 1; i <= days; i++) {
			System.out.printf("%4d", i);
			if ((firstDay - 1 + i) % 7 == 0)
				System.out.println();
		}
	}

	static void createCal(int year, int mon) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, mon -1 ,1);
		cal.get(Calendar.DAY_OF_WEEK);
	}
}
