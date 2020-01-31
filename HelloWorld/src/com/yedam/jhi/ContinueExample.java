package com.yedam.jhi;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 3 == 0) {
//			if 조건을 만족하면아랫부분을 생략하고 그 다음 반복으로 넘어감
				continue;
			}
			System.out.println("i => " + i); // 홀수일때만 출력된다
		}
	}
}
