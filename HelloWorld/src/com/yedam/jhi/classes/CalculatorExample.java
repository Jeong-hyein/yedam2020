package com.yedam.jhi.classes;

import java.util.Scanner;

public class CalculatorExample {
	public static void main(String[] args) {
		
		Calculator c1 =  new Calculator();
		
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("사칙연산 부호: +,-,*,/ q:종료 ");

			String operator = scn.nextLine();
			if (operator.equals("q")) {
				break;
			}

			System.out.println("첫번째 수 입력: ");
			int num1 = scn.nextInt();
			System.out.println("두번째 수 입력: ");
			int num2 = scn.nextInt();
			scn.nextLine();
			//class가 호출되고 인스턴스를 안 만들어도 바로 사용가능, static이기 때문
			//static으로 접근한거 -> static을 주석처리하면 사용 못함
//			Calculator.cal(num1, num2, operator); 
			c1.cal(num1, num2, operator);  //인스턴스로 접근한거
		}
		System.out.println("종료.");
	}
}
