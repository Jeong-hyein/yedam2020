package classes;

public class StudentExample {
	public static void main(String[] args) {
		Student sn = new Student("choi", 20, 180, 70);
		System.out.println(sn.name);
		System.out.println(sn.age);
		System.out.println(sn.height);
		System.out.println(sn.weight);
//		-> private해놔서 안됨 빨간줄
		
//		instance만들기
//		Student에 새로운 Student라는 instance(붕어빵)를 만들었다 -> 힙영역에다 만듬
//		-> new로 -> 만든값의 주소값을 stnt에 담음
		Student stnt = new Student(); //Student(class임)타입의 변수: stnt
		stnt.name = "hong";
		stnt.age = 20;
		stnt.height = 170;
		stnt.weight = 65;
		
		
		System.out.println(stnt.name);
		System.out.println(stnt.age);
		System.out.println(stnt.height);
		System.out.println(stnt.weight);
//		메소드
		stnt.study();
		stnt.eat();
		stnt.getAge();
		
		Student snt = new Student(); // -> 값을 안 넣으면 초기값, null,0 
		snt.name = "park";
		snt.age = 25;
		snt.height = 180;
		snt.weight = 75;
		
		System.out.println(snt.name);
		System.out.println(snt.age);
		System.out.println(snt.height);
		System.out.println(snt.weight);
		snt.study();
		System.out.println(snt.getAge());
		
	}
}
