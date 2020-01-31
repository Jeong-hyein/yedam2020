package com.yedam.jhi;
//p127예제
public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) { //keyCode에 엔터값을 가지고 있기때문에.
			if (keyCode != 13 && keyCode != 10) { //엔터키값이 아니면
				System.out.println("----------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("----------------");
				System.out.println("선택: ");
			}
//			키보드의 키 코드를 읽음
//			키보드에 대한 값을 keyCode에 넣는다.
			keyCode = System.in.read();
//			키코드가 얼마의 값을 가지고 왔는지 보여줌
			System.out.println(keyCode);
			
			if (keyCode == 49) { //1의 keyCode는 49
				speed += 10; //1씩 증가: speed++
				System.out.println("현재 속도= " + speed);
			} else if (keyCode == 50) { //2의 keyCode는 50
				speed -= 10; //1씩 감소: speed--
				System.out.println("현재 속도= " + speed);
			} else if (keyCode == 51) { //3의 keyCode는 51
				run = false;
			}

		}
		
		System.out.println("프로그램 종료");

	}// main

}
