package com.yedam.jhi.generic.before;
//generic을 쓰기전에 이런식으로 썼다.
public class Box {
//	필드, 타입: Object, 어떤 매개값도 올수있다.
	private Object obj;

	public void set(Object obj) {
		this.obj = obj;
	}

	public Object get() {
		return obj;
	}

}
