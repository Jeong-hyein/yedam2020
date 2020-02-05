package com.yedam.jhi.classes;

//10진수를 2진수로
public class MoningExample2 {
	public static void main(String[] args) {
		String num = getDigitNumber(58);
		System.out.println(num); //리턴값을 넣어줄 변수필요하기때문에 바로 출력
		System.out.println(getDigitNumber(37));

	}

	static String getDigitNumber(int num) {
		String result = "";
		int num2 = 0; // 나머지
		int num1 = num; // 나눌값, 몫
		while (true) {
			num2 = num1 % 2;
			result = num2 + result; // 뒤에서부터 값을 넣으면서 나온다.
			num1 = num1 / 2; //	num1 /= 2;
			if (num1 == 0)
				break;
		}
		return result;
	}
//	public static String getDigitNumber(int num) {
//		int num1 =0, num2 =0;

}// class
