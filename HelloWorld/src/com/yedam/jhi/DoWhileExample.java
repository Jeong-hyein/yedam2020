package com.yedam.jhi;
import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
//		Scanner은 여기서 못써서(빨간줄) import를 사용
		Scanner scn = new Scanner(System.in); //기억해두기
		System.out.println("메세지를 입력하세요.");
		System.out.println("종료하려면 q입력>");
		String input = "";
//		사용자가 입력한 값을 input에 담을수있다.
//		콘솔창에 입력한다.
		do {
			System.out.println(">");
			input = scn.nextLine();
			System.out.println("==>" + input); //q입력 전까지 입력한값을 그대로 출력
		}while (!input.equals("q")); //q가 아닐동안 do를 실행, q이면 빠져나옴.ㅇ
		System.out.println("프로그램 종료.");
		
		
//		do 다음에꺼는 무조건 실행하고 조건을 체크한다.
//		int i =1;
//		do {
//			System.out.println(i);
//			i++;
//		} while(i <= 5);

	}// main
}
