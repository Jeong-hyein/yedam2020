package com.yedam.jhi.classes;
//야구게임 예제
import java.util.Scanner;

public class BaseballGame {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int[] answer = new int[3];
	for (int i =0; i<answer.length; i++) {
		answer[i] = (int) (Math.random()*9) +1;
	}
	int[] num = new int[3];
	for(int i=0; i < answer.length;i++) {
		System.out.print("[" + answer[i] + "]");
	}System.out.println();
	while (true) {
//		System.out.println("숫자 입력> ");
//		num[0] = scn.nextInt();
//		System.out.println("숫자 입력> ");
//		num[1] = scn.nextInt();
//		System.out.println("숫자 입력> ");
//		num[2] = scn.nextInt();
		for (int i =0; i < num.length; i++) {
			System.out.println("숫자입력>");
			num[i] = scn.nextInt();
		}
		
		int strike =0, ball = 0;
		for(int i =0; i < num.length; i++) {
			for(int j = 0; j < num.length; j++) {
				if(num[i] == answer[j]) { //값이 같은거
					if(i == j) //위치가 같은거
						strike++;
					else // 위치가 다른거
						ball++;
					
				}//if 
				
				
			}//2번째 for
				
		}//1번째 for
		
		System.out.println("스트라이크: " + strike + " " + "볼: " + ball);
		if (strike == 3) {
			System.out.println("결과: " + answer[0] + " " + answer[1] + " " + answer[2]);
			break;
		}
		
		
	}//while
	
	
	
	
	
	
	}//main
}//class
