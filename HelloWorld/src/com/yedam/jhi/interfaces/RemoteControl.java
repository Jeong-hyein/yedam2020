package com.yedam.jhi.interfaces;

public interface RemoteControl {
//	(상수)필드, final: 한번정해지면 못 바꿈, 기본: public, 정적: static, max_valume는 이제 못바꿈
	public static final int MAX_VALUME = 10;
//	인터페이스에서 필드 정의하면 위에와 같음
	int MIN_VALUME = 0;
//	생성자(X)
//	(추상)메소드: abstract, 인터페이스 안에서는 안적어줘도 추상이다
	public abstract void turnOn();
	public void turnOff();
}
