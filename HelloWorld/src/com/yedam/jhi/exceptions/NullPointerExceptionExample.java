package com.yedam.jhi.exceptions;

import java.util.Scanner;

//예외처리
public class NullPointerExceptionExample {
	public static void main(String[] args) {// throws ClassNotFoundException main을 호출하는 곳에서 예외처리를 해야한다.
		Scanner scn = new Scanner(System.in);
		;
		String str = "h";
		Object obj = new Object();
		int num = 10;
//		기본타입을 class 타입으로 바꾸는거 :매퍼클래스?
		Integer i = num;
		Double d = 3.0;
		
		
		
		obj.equals(1);
//		String str = null;
		try { // 에러가 발생하면 에러를 통해 프로그램 종료 시키지말고 catch 부분으로 옮겨서 진행하란뜻
			System.out.println(str.toString()); // error: NullPointerExceptionExample
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("에러발생, 관리자 문의");
		}

//		while(true) -> 정확한 값을 입력할때까지 실행하고 싶을때, 주석부분 풀어주면 돌아간다.
		System.out.println("숫자입력: ");
		try { // 입력되는 값을 보고 맞다면 try출력, 틀리면 catch를 출력
			int num = scn.nextInt();
//			scn.nextLine();
			System.out.println("입력하신 값은: " + num);

//			if(num ==9)
//				break;
		} catch (Exception e) { // 최상위 Exception
//			e.printStackTrace(); // 에러를 어떻게 생겼는지 출력
			System.out.println("입력값을 확인");
//			scn.nextLine();
		} finally { // 없어도 된다. 반드시 실행되어야하는 내용이 있는경우 작성
			System.out.println("반드시 실행이 되어야 하는 내용");
		}
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료");
//		에러가 나온다: null 에러, try이 안쓰고 그냥 실행하면
//		System.out.println(str.toString()); //error: NullPointerExceptionExample
	}

//  예외 처리 안하고 findClass 호출한 영역에 예외처리를 넘기겠다.
	static void findClass() throws ClassNotFoundException {
		Class t = Class.forName("java.lang.String2");
		System.out.println(t.getName());

	}

//	static void findClass() { //메소드에서 예외처리를 진행 -> 위에서 예외처리 안해도 된다.
//		Class t = Class.forName("java.lang.String2");
//				
//	}catch(ClassNotFoundException e){
//		e.printStackTrace(); 
//	} System.out.println(t.getName());

}
