package com.yedam.jhi;

public class WhileExample {
	public static void main(String[] args) {
//		값이 true-> 무한반복 -> 조건 만족하면 빠져나옴.
		int i = 0;
		while (true) {
			i = (int) (Math.random() * 6) + 1;
			System.out.println(i);
			if (i == 6) {
				break; // i가 조건을 만족하면 while문을 빠져나오라는거
			}
		}
		

	}// main
}
