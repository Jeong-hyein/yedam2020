package com.yedam.jhi.classes.abstractPkg;
// 클래스와 동일, 차이점: 직접 인스턴스를 못한다.
public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new Animal(); //추상클래스는 직접 인스턴스를 생성 못한다.(new를 사용못함)
		Cat cat = new Cat();
		cat.sound();
		cat.breathe(); //부모가 가지고 있는거를 사용가능
		
		Dog dog = new Dog();
		dog.sound();
		dog.breathe();
		
		Animal animal = null; //추상클래스를 상속받는 
		animal = cat; //animal:부모 cat:자식  자동 형변환
		animal.sound();
		
		animal = dog;
		animal.sound();
		
		System.out.println("==================================");
		animalSound(cat);
		animalSound(dog);
	}

	static void animalSound(Animal animal) {
		animal.sound();
	}
}
