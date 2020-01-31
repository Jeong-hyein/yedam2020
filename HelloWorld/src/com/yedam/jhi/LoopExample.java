package com.yedam.jhi;

public class LoopExample {
	public static void main(String[] args) {
//		1~100 수중에 서 3의배수이면서 7의 배수 출력(and:&&, or:||)
//		1) for

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("-------------------");
		
//		2) while, 조건만 들어간다. 먼저 연산을하고 증감식
		int i = 1;
		while (i <= 100) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.println(i);
				}
			i++;
		}

	}// main
}
