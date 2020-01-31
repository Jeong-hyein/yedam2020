package com.yedam.jhi.referenceType;

class Strong { // str의 저장되어있는 주소(주소에 저장되어있는 값을 보여줌)
	int f1; // f1을 지정
	String str;

	void print() {
		System.out.println(f1 + "/" + str);
	}

}

public class ReferenceTypeExample {
	public static void main(String[] args) { //String[]: 배열타입어떤거도 올수있다?
		int num1 = 10; // 정수를 담을수 있는 변수 :num1
		byte by1 = 10;
		by1 = (byte) num1;
//		by1 = (byte) "Hello"; 타입이 달라서 안된다.
		
		
		
//		Strong str = new Strong();
//		str.f1 = 10;
//		str.str = "first";
//
//		참조형 데이터변주: 실제로 값을 가지고 있는것이 아니라 주소값을 가지고 있음
//		Strong str2 = new Strong();
//		str2.f1 = 10;
//		str2.str = "second";
		
		
		
		String str1 = new String("Hello"); //문자를 담을수 있는 변수:str
		String str2 = new String("Hello"); //힙영역에 만들어진 객체
		str1 = null;
		
		System.out.println(str1 == str2); //주소값이 달라서 false 
		System.out.println(str1.equals(str2)); //값이 같은지 보려면
				

	}// main
}
