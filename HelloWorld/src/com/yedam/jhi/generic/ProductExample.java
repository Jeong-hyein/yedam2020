package com.yedam.jhi.generic;
//public class는 하나만 있을수있다.
class Television {
	
}
public class ProductExample {
	public static void main(String[] args) {
		Product<Television, String> p1 = new Product<>();
		Television t1 = new Television();
//		p1.setKind(new Television()); //매개값은 Television 인스턴스만 받을수있음
		p1.setKind(t1); //위에꺼랑 같음
		p1.setModel("smartTV");
		Television tell = p1.getKind();
		String str1 = p1.getModel();
		
	}
}
