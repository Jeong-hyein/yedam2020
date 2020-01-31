package com.yedam.jhi.classes;

//객체는 자바로 표현하는 모든 것?
//객체를 표현하는거: class
//붕어빵틀: class 붕어빵:instance
//class: 필드, 생성자, 메소드는 있어야한다.
public class Student {
//	class의 속성이고 필드라고 한다.
//	private: 보안을 위해서 사용, 외부로부터 숨긴다 -> 생성자or메소드로 접근
//	private: get,set을 사용하려면 붙인다. 필드값에 직접접근 못 하도록
	private String name;
	private int age;
	private int height;
	private int weight;
	static String major;

//	생성자(인스턴스를 만들면서 필드값을 초기화)
//	매개값이 없는 생성자가 기본 생성자, 반환값이 없다
//	(): 실행하라는거.
//	다른 생성자가 생긴다면 student()가 기본생성자가 아니다. 사용은 가능
//	생성자가 아무것도 없을때는 Student(){}가 기본이라서 student(){}를 따로
//	안써줘도 사용가능 했지만 다른 생성자를 만들면 기본이 아니게 되어서 
//	student(){}를 써줘야 사용가능
	public Student() {

	}

//	생성자 여러개 만들있다
//	this: 필드를 알려줌, 생성자 오버로딩 -> 생성자의 이름이 같다.
	public Student(String name) { // String n -> name = n; -> this안써도됨
		this.name = name;
	}

	Student(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

//	class의 기능(동작)이고 메소드라고 한다.
//	메소드는 반환값이 무조건 있어야한다. 반환안하면 void라도 잇어야한다
	public void study() {
		System.out.println("공부한다.");
	}

	public void eat() {
		System.out.println("밥을 먹는다.");
	}

	void sleep() {
		System.out.println("잠을 잔다.");
	}

//	age에 값을 넣기위한 메소드
//	매개값을 받은 age를 age필드에 저장하겠다.
	void setAge(int age) {
		if (age >= 0)
			this.age = age;
		else
			this.age = 0;
	}

	// getAge는 age 필드를 말한다
	int getAge() {
		return age; // this안써도됨
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	

}//class
