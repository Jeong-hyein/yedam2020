package com.yedam.jhi.classes.extendPkg;

public class CellPhone {
	private String model;
	private String color;

	public CellPhone() {
	}

	public CellPhone(String model, String color) {
		super(); //의 부모는 object 클래스를 가르키고있다. 모든 class 최상위: object
		this.model = model; //자기자신꺼
		this.color = color;
	}

	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	void bell() {
		System.out.println("벨이 울립니다.");
	}

	void sendMessage(String message) {
		System.out.println("자신: " + message);
	}

	void receiveMessage(String message) {
		System.out.println("상대방: " + message);
	}

	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

}// class
