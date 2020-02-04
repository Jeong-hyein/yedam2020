package com.yedam.jhi.classes.abstractPkg;
//class만들때 체크하면 abstract를 붙여준다.
//추상클래스를 가지고 규칙을 만들어주기위해 사용
public abstract class Animal {
//	필드
	String kind;
	
//	기본 생성자 존재

//	메소드
	void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
//	추상 메소드(abstract) -> 정의가 없음,애니멀을 상속받아서 구현되는 sound?
	abstract void sound(); //중괄호 사용하면 에러
//	dog, cat 에러가 난다. -> sleep이라는 Override를 무조건 해야한다.
	abstract void sleep();
	
	
}
