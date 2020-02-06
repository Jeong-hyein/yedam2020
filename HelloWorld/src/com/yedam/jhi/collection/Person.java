package com.yedam.jhi.collection;

public class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
//		return this.age - o.age; //-값: 앞이 뒤보다 작음 -> age가 작은 사람부터
//		return o.age - this.age; -> age가 큰 사람부터
//		return this.name.compareTo(o.name); -> 이름이 긴순서
		return this.name.length() - o.name.length(); // -> 이름이 짧은 순서
	}

}
