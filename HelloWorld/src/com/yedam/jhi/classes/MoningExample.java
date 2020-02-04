package com.yedam.jhi.classes;

public class MoningExample {
	public static void main(String[] args) {
		int[][] ary = new int[5][5];

		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				if (i+j >= 4) {
					System.out.print("*");
				} else if (i+j < 4) {
					System.out.print(" ");
				}
			
			}System.out.println();

		}//for1
//		교수님 방식
/*		for(int i = 0; i < 5; i++) {
			for (int j = 0; j <5; j++) {
				if(i+j >= 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}System.out.println();
		} */
	}// main
}// class
