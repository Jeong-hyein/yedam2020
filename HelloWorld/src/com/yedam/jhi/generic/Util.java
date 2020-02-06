package com.yedam.jhi.generic;
//메소드에서 제너릭을 사용할때
//<T>: 제너릭을 사용하겠다.
//Box<T>: 타입
//boxing: 메소드 이름
//(T t): 매개변수의 타입과 매개변수, 매개변수는 선언될때 타입을 지정해주겠다.
public class Util {
	public static <T> Box<T> boxing(T t) { //타입이 T인 매개값 t, 제너릭타입: <T>
		Box<T> box = new Box<>();
		box.set(t); //box에 t를 셋팅
		return box;
	}
}
