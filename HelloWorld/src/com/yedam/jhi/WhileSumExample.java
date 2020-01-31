package com.yedam.jhi;

public class WhileSumExample {
	public static void main(String[] args) {
		//1~5합을 구하는 식
		int sum = 0;
//		조건이 참인지 아닌지 보거나, 무한루프때 사용
		int i =1;
		while (i<=5) { 
			sum = sum + i;
			i++; //실행문안에 증감식써준다
		}
		System.out.println("합계는 " + sum);
		
		
		
		
	}//main
}
