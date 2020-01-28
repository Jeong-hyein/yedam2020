
public class SwitchExample {
	public static void main(String[] args) {
//		0부터 5까지의 수, 10을 쓰면 0부터 9까지의 임의의 수 
		int result = (int) (Math.random() * 6) + 1; // +1 :1부터 6까지
		System.out.println(result);
		switch (result) {// case1이 실행되면 계속 실행됨 -> break를 써줌
		case 1:
			System.out.println("1번이 나왔습니다.");
			break; // switch구문을 빠져나옴
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		case 6:
			System.out.println("6번이 나왔습니다.");
			break;

		}
//		if구문을 switch구문으로 바꾼거
		int grade = 85;
		grade = grade / 10; //-> 나는 switch(grade/10)으로
		switch (grade) {
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
			break;
		}
		
//		switch문을 다시 if문으로
		if (grade >= 9) {
			if (grade == 10) {
				System.out.println("A+");
			}else { 
				System.out.println("A");
			}
		} else if (grade >= 8) {
			System.out.println("B");
		} else if (grade >= 7) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		

	}// main
}
