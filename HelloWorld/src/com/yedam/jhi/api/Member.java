package com.yedam.jhi.api;

public class Member {
	String name;
	int age;

	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj); //부모가 가지고있는 equals메소드를 사용
		Member m = (Member) obj; // Member클래스로 강제 형변환
//		return this.age == m.age; //나이로만 비교
//		return this.name == m.name; //이름으로만 비교, this.name:객체  m.name:매개값으로 들어오는거
		return this.age == m.age && this.name == m.name; //두개 다 같을때 true
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	

}
