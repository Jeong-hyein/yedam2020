package com.yedam.jhi.classes.abstractPkg;

public class Cat extends Animal{
	Cat() {
		kind = "포유류";
	}
	
	
	@Override
	void sound() {
		System.out.println(kind + "야옹");
		
	}


	@Override
	void sleep() {
		System.out.println("고양이 잔다");
		
	}
	
	
}
