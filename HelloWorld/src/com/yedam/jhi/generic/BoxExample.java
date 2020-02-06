package com.yedam.jhi.generic;

import java.util.ArrayList;
import java.util.List;

import com.yedam.jhi.generic.before.Apple;
import com.yedam.jhi.generic.before.Orange;
import com.yedam.jhi.interfaces.model.Employees;

public class BoxExample {
	public static void main(String[] args) {
		Box<Orange> orangeBox = new Box<Orange>();
		Box<Apple> appleBox = new Box<Apple>();

		orangeBox.set(new Orange());
		Orange orange = orangeBox.get();

		appleBox.set(new Apple());
		Apple apple = appleBox.get(); // Apple 타입만 받을수있다. str쓰면 에러

		Box<String> box = new Box<String>(); // <String>:새로운 표현
		box.set("Hello"); // String으로 정해놨기때문에 String 밖에 못옴
		String str = box.get();
//		System.out.println(str);

//		배열대신 쓰는 List
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		for (String str1 : list) { // 주소값 나오는듯
			System.out.println(str1);
		}

		List<Employees> empList = null; // empList에 Employees의 인스턴스를 담겠다.

		List<Apple> appleList = new ArrayList<>();
		appleList.add(new Apple());

		List ist = new ArrayList();
		ist.add(new Apple());
		ist.add("hello"); // 이런식으로 넣으면 안된다.
		for (Object obj : ist) {
			System.out.println(obj);
		}

	}
}
