package com.yedam.jhi.generic;
// T: generic임을 나타냄
// 타입체크를 하기위해서 generic을 사용
public class Box<T> { // box를 사용하는 시점에 타입을 정하겠다 -> Box<String> 식으로 적는다.
	private T obj; //타입은 나중에 정하고 모든 타입이 올수있다.

	public void set(T obj) { // 타입은 안 정해져 있고
		this.obj = obj;
	}
	public T get() {
		return obj;
	}
}
