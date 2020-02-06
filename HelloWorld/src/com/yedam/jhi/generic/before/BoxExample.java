package com.yedam.jhi.generic.before;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box(); //박스타입(박스는 obj이라서 모든 타입 올수있다.)
//		box.set(new Apple);
//		box.set(new String());
		box.set("Hello"); //string으로 set
		String str = (String) box.get(); 
		
		Apple apple = new Apple();
		
//		box.set("apple"); //에러안남 큰일.
		box.set(apple); //박스에 apple이 담겨있다., 박스를 apple타입으로 set함
//		Apple apple2 = (Apple) box.get(); //아무 문제 없다. 애플 인스턴스를에 애플타입을 받아야한다.
		String str2 = (String) box.get(); //apple인거에 String을 가져오면 에러
		
		
		
	}
}
