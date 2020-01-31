package com.yedam.jhi.common;

import com.yedam.jhi.classes.Student;
//import referenceType.Student;
//classes에도 studentExample도 있지만 패키지가 달라서 사용가능
//common의 StudentExample 소스
public class StudentExample {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
//		초록 실행버튼옆 화살표, run configu.. -> Arguments -> program arguments -> Hello
			System.out.println(args[i]); // args는 배열타입, 배열구분은 스페이스바
		}
		

//		common패키지에는 Student가 없다 그래서 import
//		생성자 new Student 못쓴다.  ->public으로 바꾸면 common에서도 바꿀수있음
//		classes.Student stn = new classes.Student() 밑에꺼랑 똑같고 import를 안써도 된다.
		Student stn = new Student();
		stn.study(); // Student.java에서 public 지우면 실행 불가
//		public이 아니라서 못봄 바꿔주면 볼수있음
		Student snt = new Student("name");
		snt.eat(); // Student.java에서 public 지우면 실행 불가

	}
}
