package com.yedam.jhi.classes;

public class StudentArrayExample {
	public static void main(String[] args) {
		// Student만 담을수 있는 배열을 만듬
		Student[] stdAry = new Student[3];

		Student sn = new Student("choi", 20, 180, 70);

		Student stnt = new Student();
//		stnt.name = "hong";
		stnt.setName("hong");
//		stnt.age = -20;  //-> 필드에 바로 값을 넣음
		stnt.setAge(20); // -> 메소드를 통해 값을 넣음
//		stnt.height = 170;
		stnt.setHeight(170);
//		stnt.weight = 65;
		stnt.setWeight(65);

		Student snt = new Student();
//		snt.name = "park";
		snt.setName("park");
//		snt.age = -25;
		snt.setAge(25);
//		snt.height = 180;
		snt.setHeight(1800);
//		snt.weight = 75;
		snt.setWeight(75);

		stdAry[0] = sn;
		stdAry[1] = stnt;
		stdAry[2] = snt;

		stdAry[0] = stdAry[2]; //순서를 바꾸고 싶을때 0번째에 stdAry[2]값 넣을때
		
		stdAry[0] =stdAry[1];
		stdAry[1] =stdAry[2];
		stdAry[2] =stdAry[0];
		
		
		
		
		
		for (int i = 0; i < stdAry.length; i++) {
//			if(stdAry[i].name.equals( "choi"))
//			System.out.println(stdAry[i].name + " " + stdAry[i].age);
//			System.out.println(stdAry[i]); //-> 주소값이 나온다.
			System.out.println(stdAry[i].getName() + " " + stdAry[i].getAge());
		}

		
		
		
		
		
		
		
	}
}
