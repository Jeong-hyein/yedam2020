package com.yedam.jhi.api;

public class StrkngBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());

		sb.replace(6,  13,  "Book");
		System.out.println(sb.toString());

		sb.delete(4, 5);
		System.out.println(sb.toString());

//		스페이스바를 포함한 문자수
		int length = sb.length();
		System.out.println("총문자수: " + length);
		
		String result = sb.toString();
		System.out.println(result);
		
		
	}
}
