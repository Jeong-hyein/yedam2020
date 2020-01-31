package com.yedam.jhi.classes;

public class Singleton {
//	클래스가 로딩되는 시점에 사용할수있는 필드가 됨, 외부에서 접근 못하도록: private(생성자랑 인스턴스)
//	class가 만들어지는 시점에 생성자를 사용할 수 있다.
//	Singleton에서 사용할수있는 인스턴스는 s1뿐
	private static Singleton s1 = new Singleton(); //인스턴스를 만들수있다. 생성자를 따로 지정 안하면 있다고 생각
	private Singleton() { //-> 예전에는 new로 만들수있었지만 private해서 new로 못 만든다.
	}
//	필드랑 생성자를 사용하려면 getInstance를 사용해야한다 getInstance로만 인스턴스를 만들수있다.
	static Singleton getInstance() {
		return s1;
	}
	
}
