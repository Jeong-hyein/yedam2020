package com.yedam.jhi.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
//		Remote를 상속이 아닌 구현으로 말함
		RemoteControl rc = null; //생성자 없어서 new못씀
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		Television t1 = new Television();
		Audio a1 = new Audio();
		rc = t1;
		rc = a1;
	}
}
