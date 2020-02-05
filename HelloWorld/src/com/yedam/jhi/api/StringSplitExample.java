package com.yedam.jhi.api;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "홀길동&이수홍,박연수,김자바-최명호";
		
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}
		
	}
}
