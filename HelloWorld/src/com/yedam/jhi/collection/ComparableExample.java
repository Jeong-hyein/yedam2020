package com.yedam.jhi.collection;

import java.util.Arrays;

public class ComparableExample {
	public static void main(String[] args) {
		Person p1 = new Person("hong", 20);
		Person p2 = new Person("ducksun", 30);
		Person p3 = new Person("kim", 10);
		Person[] pAry = {p1, p2, p3};
		Arrays.sort(pAry);
		for(int i =0; i<pAry.length; i++) {
			System.out.println(pAry[i].name + ", " + pAry[i].age);
		}
//		person에서 return this.age - o.age; -> kim 10 hong 20 ducksun 30 나온다
//		person에서return o.age - this.age; -> ducksun 30 hong20 kim 10
//		person에서 return this.name.compareTo(o.name); -> 이름이 긴 순서로
//		person에서 return this.name.length() - o.name.length(); -> 이름 짧은 순서
		
		
	}
}
