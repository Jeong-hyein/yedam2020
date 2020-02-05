package com.yedam.jhi.api;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.name = "park";
		m1.age = 10;
		Member m2 = new Member();
		m2.name = "kim";
		m2.age = 10; //나이 기준으로만 비교했기 때문에 true가 나온다. -> Member에서 equals 메소드 수정
		
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2));
		
		

		System.out.println(m1.equals(m2)); // 비교해서 같은지 보는거
//		equals를 어떻게 가기고있냐에 따라 true 혹은 false가 나온다.
		System.out.println(m1.hashCode());
	}
}
