
public class IfElseExample {
	public static void main(String[] args) {
		int result = 80;
//		if,else는 한번만 실행됨, 위에 구문이 실행되면 밑에꺼는 안함.
//		조건도 잘 줘야함. 제일 처음에 >=70이면 A학점 나옴
		if (result >= 90) {
			System.out.println("A 학점");
		} else if (result >= 80) {
			System.out.println("B 학점");
		} else if (result >= 70) {
			System.out.println("C 학점");
		} else {
			System.out.println("F 학점");
		}
//		2번째 3번째 출력됨
/*		if (result >= 90) {
			System.out.println("A 학점");
		} if (result >= 80) {
			System.out.println("B 학점");
		} if (result >= 70) {
			System.out.println("C 학점");
		} if (result < 70) {
			System.out.println("F 학점");
		} */
//		중첩if
		result = 95;
		if (result >= 90) {
			if (result >= 95) {
				System.out.println("A+학점");
			} else {
				System.out.println("A학점");
			}
		} else if (result >= 80) {
				System.out.println("B 학점");
		} else if (result >= 70) {
				System.out.println("C 학점");
		} else {
				System.out.println("F 학점");
			} 
		
		result = 84;
		if (result >= 90) {
			if (result >= 95) {
				System.out.println("A+학점");
			} else {
				System.out.println("A학점");
			}
		} else if (result >= 80) {
			if (result >= 85) {
				System.out.println("B+학점");
			} else {
				System.out.println("B학점");
			}
		} else if (result >= 70) {
			if (result >= 75) {
				System.out.println("C+학점");
			} else {
				System.out.println("C학점");
			}
		} else {
				System.out.println("F 학점");
			} 
		
		
	}// main
}// class
