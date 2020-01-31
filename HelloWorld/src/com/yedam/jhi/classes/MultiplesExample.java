package com.yedam.jhi.classes;

// 2,3 배수 이외의 경우는 기타
// 종료 999 입력
import java.util.Scanner;

public class MultiplesExample {
	public static void main(String[] args) {

		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.print("입력> ");
			int num = scn.nextInt();
			if (num % 2 == 0 && num % 3 != 0) {
				System.out.println("2의 배수");
			} else if (num % 3 == 0 && num % 2 != 0 && num != 999) {
				System.out.println("3의 배수");
			} else if (num % 2 == 0 && num % 3 == 0) {
				System.out.println("2의 배수이면서 3의배수");
			} else if (num % 2 != 0 && num % 3 != 0) {
				System.out.println("기타");
			} else if (num == 999) {
//				System.out.println("종료");
				break;
			}

		} // while
		System.out.println("종료"); //while문을 빠져나온걸 알수있음.
	}// main

}
