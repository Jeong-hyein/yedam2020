package classes;

public class PeopleExample {
	public static void main(String[] args) {
//		People p1 -> p1의 타입은 People class이다. 
//		People class의 객체를 담을수있다.
		People p1 = new People("choi");
		System.out.println(p1.name);
//		p1.age = 26; 을 해주면 들어감. -> 안해주면 0이 나옴.
		System.out.println(p1.age);
		
//		생성자를 불러오면서 초기화함. -> 필드에 값을 준다.
		People p2 = new People("kim", 26, 159, "deagu");
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.height);
		System.out.println(p2.address);


		People p = new People();
		p.name = "JEONG";
		p.age = 26;
		p.height = 165;
		
		p.study();
		p.eat();
		p.getname(); //안나옴
		System.out.println(p.getname());
	}
}
