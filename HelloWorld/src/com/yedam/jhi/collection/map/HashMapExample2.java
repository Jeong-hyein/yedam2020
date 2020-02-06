package com.yedam.jhi.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student {
	int stdNo;
	String name;
	
	public Student(int stdNO, String name) {
		super();
		this.stdNo = stdNO;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.stdNo;
	}

	@Override
	public boolean equals(Object obj) {
		Student s1 = (Student) obj;
		return this.name.equals(s1.name);
	}
	
	
	
	
}

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(111, "이다혜"), 30); //key값: new Student(111, "이다혜")
		map.put(new Student(111, "신아라"), 40);
		map.put(new Student(111, "이지원"), 50);
//		map.put(new Student(111, "이다혜"), 30);과 다름 -> size가 4가 나옴 
		map.put(new Student(111, "이다혜"), 60); 
		System.out.println(map.size());
		Set<Student> set = map.keySet(); //key:중복허용x, key를 가져와라 3개 가져옴
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			Student key = iter.next(); //key는 Student 타입의 key이다.
			System.out.println(key.name+", "+key.stdNo + ", " +map.get(key));
		}
		
		
		
		
	}
}
