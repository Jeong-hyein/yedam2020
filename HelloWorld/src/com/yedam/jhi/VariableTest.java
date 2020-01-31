package com.yedam.jhi;
/*
 * 1. variabletest 클래스 생성
 * 2. 정수연산을 위해서 sum, avg, num1, num2의 변수선언
 * 3. sum에는 num1, num2의 값을 합한 결과물
 * 4. avg에는 num1,num2의 평균값을 저장할 수 있도록
 * 5. 콘솔에는 아래 내용 출력
 * => 두수 num1과 num2의 합은 sum입니다.
 * => 두수의 평균은 avg입니다.
 */
public class VariableTest {
	public static void main(String[] args) {
		int sum,num1,num2;
		double avg;
		num1 = 30;
		num2 = 45;
		sum = num1 + num2;
		avg = ((double)sum)/2;
//		avg = sum/2.0; -> 이거도 가능
		System.out.println("두수" + num1 + "과 "+ num2 +"의 합은 " + sum +"입니다.");
		System.out.println("두수의 평균은 " + avg +"입니다.");
		
		
	}
}
