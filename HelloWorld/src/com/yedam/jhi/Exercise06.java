package com.yedam.jhi;
//p135
public class Exercise06 {
	public static void main(String[] args) {
//		이렇게 해도 되지만 길어짐
//		for (int i = 1; i <= 5; i++) {
//			if (i == 1) {
//				System.out.println("*");
//			} else if (i == 2) {
//				System.out.println("**");
//			}  else if (i == 3) {
//				System.out.println("***");
//			}  else if (i == 4) {
//				System.out.println("****");
//			}  else {
//				System.out.println("*****");
//			}

//	 	}
		
		for ( int i = 1; i<=5; i++) {
			for (int j =1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
