package com.yedam.jhi.classes;

//메소드 오버로딩: 동일한 메소드 이름 사용가능
public class MethodOverloadingExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1); // println이 오버로딩 되어있어서 가능

		int num1 = 10, num2 = 20;
		double d1 = 1.5, d2 = 2.3;
//		print메소드가 double받아서 처리를 못함. 
//		->double타입 받아서 실행할 수 있도록 메소드가 정의.
		print(sum(d1, d2));
		print(sum(num1, num2)); // int타입 받아서 실행할 수 있도록 메소드가 정의
		print(); // 따로 메소드 지정해줘야한다.

	}// main

	static void print() {

	}

	static void print(double d) {
		System.out.println(d);
	}

	static void print(String str) {
		System.out.println(str);
	}

	static void print(int str) {
		System.out.println(str);
	}

	static int sum(int a, int b) {
		return a + b;
	}

	static double sum(int a, double b) {
		return a + b;
	}

	static double sum(double a, int b) {
		return a + b;
	}

//	타입이랑 갯수가 같아서 오류, 변수 이름이 달라도 안됨, 리턴타입은 상관 없음
//	static int sum(int d, int c) {
//		return a + b;

	static int sum(int c, int d, int a) {
		return c + d + a;
	}

	static double sum(double a, double b) {
		return (double) (a + b);
	}

}// class
