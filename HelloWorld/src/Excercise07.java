//p135 -> scn.nextLine(): 엔터를 받아 대신 삭제하는거
//우리가 입력하는거는 입력+엔터 이기 때문에 엔터를 대신 받아줄 nextline을써줘야한다.
import java.util.Scanner;

public class Excercise07 {
	public static void main(String[] args) {
		boolean run = true; // boolean타입 run
		int balance = 0; // 계좌 정보
		Scanner scn = new Scanner(System.in);

//		4번을 누르기전에는 계속 실행되야하기 때문에 무한루프사용
		while (run) {
			System.out.println("-------------------------");
			System.out.println("1.예금 2.출금 3.잔액 4.종료");
			System.out.println("-------------------------");
			System.out.println("선택> "); //내가 쓴거
			int menu = scn.nextInt(); // 입력한 값을 menu에 담음(nextInt)
			if (menu == 1) {
				System.out.println("예금액 입력: ");
				int inputAmt = scn.nextInt();
				balance = balance + inputAmt;
			} else if (menu == 2) {
				System.out.println("출금액 입력: ");
				int inputAmt = scn.nextInt();
				balance = balance - inputAmt;
			} else if (menu == 3) {
				System.out.println("잔액: " + balance);
			} else if (menu == 4) {
				run = false;
			}//end of if

		}//end of while
		System.out.println("프로그램 종료");

	}// main
}
