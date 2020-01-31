package com.yedam.jhi.referenceType;

import java.util.Scanner;

//1.1차원배열 -> 10개 크기 -> for문으로 값 넣기
//2.2차원배열(행렬) -> [5][5] 배열 -> 1~25값 넣기 -> 대칭행렬나오도록
//3.야구게임 -> Math.random -> 위치, 값 같으면 스트라이크
public class ForWhileExample {
	public static void main(String[] args) {
		method1();
		method2();

	}

	public static void method1() {
		int[] intAry1 = new int[10];
		for (int i = 0; i < intAry1.length; i++) {
			intAry1[i] = i + 1;
			System.out.println("1번문제: " + intAry1[i]);
		}
	}

	public static void method2() {
		int[][] intAry2 = new int[5][5];
		int cnt = 1;
		for (int i = 0; i < intAry2.length; i++) {
			for (int j = 0; j < intAry2[i].length; j++) {
				intAry2[i][j] = cnt++;

			}

		}
		for (int i = 0; i < intAry2.length; i++) {
			for (int j = 0; j < intAry2[i].length; j++) {
//				System.out.print(intAry2[i][j] + " ");
//				System.out.printf("%3d", intAry2[i][j]);  //-> 가로방향
				System.out.printf("%3d", intAry2[j][i]); // -> 세로방향

			}
			System.out.println();

		}
	}
//	야구게임
//	public static void method3() {
//		int[] intAry = new int[3];
//		Scanner scn = new Scanner(System.in);
//		int[] result = new int[3];
//		for(int i =0; i < intAry.length; i++) {
//			result[i] = (int) (Math.random()*10);
//			int num = scn.nextInt();
//			if (result[i] = )
		
		
		
	

}
