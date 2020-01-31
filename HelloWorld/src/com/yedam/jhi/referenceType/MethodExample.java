package com.yedam.jhi.referenceType;

public class MethodExample {
	public static void main(String[] args) {
		int num1, num2;
		int result;
		
		num1 = 10;
		num2 = 20;
//		result = (num1 + num2) * 3; //복잡한 계산식이라고 생각.
//		System.out.println("결과값은: " + result);
		multiAfterSum(num1, num2);

		int a1, a2;
		a1 = 100;
		a2 = 200;
//		result = (a1 + a2) * 3; //복잡한 계산식이라고 생각.
//		System.out.println("결과값은: " + result);
//		같은 연산을 하는데 값만 다를때 -> 메소드만들어서 호출
		multiAfterSum(a1, a2); //메소드 실행하는 부분
		
		double x,y;
		x =1.1;
		y = 2.2;
		multiAfterSum(x,y);
		
	}// main
	public static void multiAfterSum(double a , double b) {
		double n1, n2, rslt;
		n1 = a;
		n2 = b;
		rslt = (n1 + n2) * 3;
		System.out.println("결과값은: " + rslt);
		}
	// 메소드(method) 정의하는 부분
	public static void multiAfterSum(int a , int b) {
		int n1, n2, rslt;
		n1 = a;
		n2 = b;
		rslt = (n1 + n2) * 3;
		System.out.println("결과값은: " + rslt);
	}//메소드

	
}//class
