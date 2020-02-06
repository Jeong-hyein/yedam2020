package com.yedam.jhi.generic;

public class Product<T, M> {
	private T kind; //T와 동일하게 가겠다.
	private M model;
	
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}

	
}
