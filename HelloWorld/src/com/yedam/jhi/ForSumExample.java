package com.yedam.jhi;

public class ForSumExample {
	public static void main(String[] args) {
		int sum = 0;
//		sum = sum + 1;
//		sum = sum + 2;
//		sum = sum + 3;
//		sum = sum + 4;
//		sum = sum + 5;
//		System.out.println("합계는: " + sum);
//		
//		규칙이 있을때 반복문 사용, 규칙이 바뀌면 반복문 사용 못함
//		sum 구문을 5개 쓰는거랑 같음
//		초기화 값, 조건, 증감식(i는 계속 1->무한루프)
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
			System.out.println("i: " + i + ", sum: " + sum);
		}
		System.out.println("합계는: " + sum);

//		1~100 수중에서 짝수의 합을 구하는 while
		sum = 0;
		int i = 1;
		while (i <= 100) {

			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;
			
		}System.out.println("합계는: "+ sum);

//		구구단 5단 while
		i = 1;
		int n = 5;
		while (i <= 9) {
			System.out.println(n + "*" + i+ " = " + (n*i));
			i++;
		}
		
		
	}// main
}
