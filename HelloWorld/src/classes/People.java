package classes;

public class People {
	// 필드
	String name;
	int age;
	int height;
	String address;

	//생성자
	People() {
		
	}
	People(String name) {
		this.name = name;
	}
	People(String name, int age, int height, String address){
		this.name = name;
		this.age = age;
		this.height = height;
		this.address = address;
	}
	
	
	
	
	
	
	// 메소드
	void study() {
		System.out.println("공부한다.");
	}

	void eat() {
		System.out.println("밥을 먹는다.");
	}

	void sleep() {
		System.out.println("잠을 잔다.");
	}

	int getAge() {
		return age;}

	String getname() {
		return name;}
	
	
	int getheight() {
		return height;}
	
	
	
}
