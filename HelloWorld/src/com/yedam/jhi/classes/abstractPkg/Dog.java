package com.yedam.jhi.classes.abstractPkg;

public class Dog extends Animal{
		Dog() {
			kind = "포유류";
		}
		
		
		@Override
		void sound() {
			System.out.println(kind + "멍멍");
			
		}
		@Override
		void sleep() {
			System.out.println("강아지 잔다");
			
		}
		
	}

