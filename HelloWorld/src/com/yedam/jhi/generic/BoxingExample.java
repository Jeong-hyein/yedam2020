package com.yedam.jhi.generic;

public class BoxingExample {
	public static void main(String[] args) {
		//Box<Integer>: Util의 Box<T>, Integer(10): T:Integer, t:10
		Box<Integer> box = Util.boxing(new Integer(10)); //타입을 선언할거니깐 new
		//boxing메소드에 의해서 box에서는 10이 들어가고 10이 return된다.
		Integer i = box.get(); //box에 있는거를 가져와서 i에 넣는다. i에 10이 들어간다.
		System.out.println(i);
	}
}
