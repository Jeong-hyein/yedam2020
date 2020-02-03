package com.yedam.jhi.classes.extendPkg;

public class DmbCellPhone extends CellPhone { // extends :CellPhone을 상속받습니다.
	int channel;

	public DmbCellPhone() {
		super(); // 부모클래스의 기본생성자를 호출하겠다
	}

//	오른쪽 클릭 - 소스 -  밑에서 3번째줄 클릭하면 생김 ,ctrl눌러서 슈퍼 눌러보면 어떤걸 가져오는지 알수있다.
	public DmbCellPhone(String model, String color, int channel) {
//		부모생성자를 나타냄, 부모의 기본생성자, super: 부모클래스
//		super(); //cellphone에 생성자 주석처리하면: 매개값이 없는 생성자가 없기때문에 오류남
		super(model, color); // 부모클래스의 매개값을 쓰겠다?
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("채널: " + channel + "번 DMB방송 수신.");
	}

	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널: " + channel + "번으로 바꿉니다.");
	}

	void turnOffDmb() {
		System.out.println("DMB수신 종료.");
	}

}
