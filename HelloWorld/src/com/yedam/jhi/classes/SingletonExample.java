package com.yedam.jhi.classes;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance(); //인스턴스는 주소값이 들어온다.
		Singleton s2 = Singleton.getInstance();
//		이렇게 만드는거를 singleton이라한다.(하나의 인스턴스 만들기)
		System.out.println(s1==s2); //true: 동일한 주소값을 가지고 있다. 인스턴스가 하나만 만들어진거다.리소스절약
		s1.age = 10;
		s2.age = 20;
		System.out.println(s1.age); //동일 인스턴스라서 20이 나온다.
	
	}
}
