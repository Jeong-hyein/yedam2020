package com.yedam.jhi.classes;

public class Calendar {
	public static void main(String[] args) {
//		메소드를 통해서 값이 나오도록
		createCal(5); // 4월 달력을 만들어서 출력
	}

//	main은 깨끗한게 좋아서 메소드를 만들어준다.
	static void createCal(int month) {
		String[] day = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		int days = getMonthDay(month);
		System.out.println(month + "월은 " + getMonthDay(month));
		int firstDay = getFirstDay(month);

//		요일 출력.
		for (int i = 0; i < day.length; i++) {
			System.out.print(" " + day[i]);
		}
		System.out.println();

//		월의 첫째날의 시작위치 지정. 
//		만약 일요일이 0이면 -1안해도 된다
//		일요일 앞 쪽 공백 없고 월요일 공백 한개 -> 공백을 넣어서 시작위치 맞추기위해
		for (int i = 0; i < firstDay - 1; i++) {
			System.out.print("    ");
		}

//		7일씩 잘라서 출력. 
//		캘린더 위치를 맞추기 위해서 (firstDay-1+i) %7 을 해준다.
//		firstDay: 시작하는 요일의 수(일:1, 월:2..), ex) 월: 2
//		firstDay-1: 공백수 -> 1 , i: 날수 -> 1+28 -> 공백을 포함한거
//		공백을 포함한거를 7로 나눈게 : (firstDay -1 +i) % 7 
		for (int i = 1; i <= days; i++) {
			System.out.printf("%4d", i);
			if ((firstDay - 1 + i) % 7 == 0) // 물린값(firstDay -1) 에서 i 더한 후 나누기 7
				System.out.println();
		}
	}// 메소드 createCal

//	숫자 입력하면 해당월의 날짜를 반환해주는 메소드
//	main이 static이면 메소드도 static으로 해줘야함
//	1 -> 31, 2-> 28, 3 -> 30
//	static return값 getMonthDay(매개값) {
//	if(매개값 = 1)
//	if (month == 1 && month == 3 && month == 5 && month == 7 && month == 8 && month == 10 && month == 12) {
//	else if (month == 4 && month == 6 && month == 9 && month == 11) {

//	2020년 1,2,3,4월에 해당하는 첫째날의 요일
//	일=> 1 , 월 => 2, 화=> 3 ... 토=> 7
	static int getFirstDay(int month) {
		if (month == 1) { // 1월 달은 수요일
			return 4;
		} else if (month == 2) { // 2월 달은 토요일
			return 7;
		} else if (month == 3) { // 3월 달은 일요일
			return 1;
		} else if (month == 4) { // 4월 달은 수요일
			return 4;
		} else if (month == 5) {
			return 6;
		} else { // 그 외의 달은 없다.
			return 0;
		}
	}

	static int getMonthDay(int month) {
		int days = 0;
		if (month <= 7 && month % 2 == 1) {
			days = 31;
		} else if (month > 7 && month % 2 == 0) {
			days = 31;
		} else if (month == 2) {
			days = 28;
		} else {
			days = 30;
		}
		return days;

	}

}
