package com.yedam.jhi;

public class WhileAndWhileExample {
	public static void main(String[] args) {
//		while 사용해서 구구단 출력
//		int i = 1;
//		int j = 5;
//		while(i < 9 ) {
//			i++;
//			System.out.println(j + "*" + i + " = " +(i*j));
//			}
//		System.out.println("==2단=======3단==========4단=========5단========6단========7단========8단========9단====");
//		
//		i = 1;
//		while(i<10) {
//			for( j = 2; j < 10; j++) {
//			System.out.print(j + "*" + i + "= " +(i*j) + "     ");	
//			
//			}i++;
//			System.out.println();
//		}
//		System.out.println("==========================");
		int i = 1;
		while (i < 10) {
			int j = 2;
			while (j < 10) {
				System.out.print(j + "*" + i + "= " + (i * j) + "   ");
				j++;
			}
			System.out.println();
			i++;

		}

	}// main
}
