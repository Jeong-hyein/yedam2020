package com.yedam.jhi;

public class StringExample {
	public static void main(String[] args) {
		System.out.println(3 + 5);
		System.out.println("두 수의 합은 " + 8 + "입니다.");
		System.out.println( 3 + 5 +"입니다");
		//문자열이 먼저나오면 뒤에 나오는거도 문자로 인식
		System.out.println("두수의 합 " + 3 + 5 + "입니다.");
		System.out.println("두수의 합 " + (3 + 5) + "입니다.");
		
		//실행안함, 5%3은 0이 아니기때문에, 실행안되는구문이라서 밑줄생김
		if(5 % 3 == 0) {
			System.out.println("입니다.");}
				
		int var1 = 11;
		//if: 어떤값이 참인지 아닌지
		if (var1 % 2 == 0) {
			System.out.println("짝수입니다.");}
		else { System.out.println("홀수입니다.");}
		//true나옴
		System.out.println(3 >= 1);
		//false
		System.out.println(3 == 1);
		
		int var3 = 10, var4 = 20;
		int biggerValue = 0;
		//if,else를 다섯라인에 쓰는거
		if(var3 >= var4) {
			biggerValue =var3;
		} else {
			biggerValue =var4;
		}
		System.out.println("큰수는 " + biggerValue);
		//조건이 맞다면 var3, 아니면 var4 출력
		biggerValue = (var3 >= var4) ? var3 : var4;
		System.out.println("큰수는 " + biggerValue);
		
	}

}
