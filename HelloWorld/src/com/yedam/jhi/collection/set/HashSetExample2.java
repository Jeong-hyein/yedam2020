package com.yedam.jhi.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {
	String name;
	int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//	인스턴스가 동일한 기준으로 정의되려면
//	hashCode(), equals() 재정의되면 됨
	@Override
	public int hashCode() {
		return this.age;
	}

	@Override
	public boolean equals(Object obj) {
		Member m = (Member) obj;
		return this.name.equals(m.name);
	}

}

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		set.add(new Member("하준원", 20)); // 기준은 인스턴스,인스턴스가 다르다. 그래서 size가 2가 나옴
		set.add(new Member("하준원", 20));
		set.add(new Member("홍성우", 20));
		set.add(new Member("윤재언", 20));

//		Hash override를 고쳐주면 다르게 나온다.
		System.out.println(set.size());
		for (Member mem : set) {
			System.out.println(mem.name + ", " + mem.age); // 인스턴스 기준이라서 주소값이 다르다. 해쉬코드도 다르다
		}

//		반복자 기억!!!
		System.out.println("반복자를 통해 for");
		Iterator<Member> iter = set.iterator(); // 반복자
		while (iter.hasNext()) { // 가지고 올게 있습니까?, 다가지고 나오면 while 빠져나옴
			Member m = iter.next(); // 있으면 하나씩 가지고오세요.
			System.out.println(m.name + ", " + m.age);
		}
		
		
		

		
	}//main
}//class
