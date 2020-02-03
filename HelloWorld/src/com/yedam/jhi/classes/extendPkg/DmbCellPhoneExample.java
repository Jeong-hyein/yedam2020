package com.yedam.jhi.classes.extendPkg;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone d1 = new DmbCellPhone("sky", "white", 10); // model,color,channel
		d1.powerOn(); // CellPhone의 메소드, 부모자식관계,부모가 가지고 있는거를 쓸수있음
		d1.turnOnDmb(); // DmCellPhone 메소드
		d1.changeChannel(20);
		d1.turnOffDmb();
		d1.sendMessage("반갑습니다"); // CellPhone 메소드
		d1.receiveMessage("안녕하세요");
		d1.powerOff();

		CellPhone c1 = new DmbCellPhone(); // 부모는 자식을 담을수있음.promotion(자동 형변환)
//		CellPhone c2 = new Student(); 부모 자식 관계가 아니라서 안됨

		if (c1 instanceof DmbCellPhone) {
			DmbCellPhone d2 = (DmbCellPhone) c1; // Casting (형변환을 해줘야한다),자식이 부모담으려면 강제 형변환해야한다.
			d2.turnOnDmb();
			d2.changeChannel(40);
			d2.turnOffDmb();
		} // c1을 Dmb형변환하려면, (instanceof): Dmb이냐고 물어봐야한다 맞으면 밑에 줄 실행
		CellPhone c2 = new CellPhone(); //c2는 cellphone꺼. 
		if (c2 instanceof DmbCellPhone) {
			DmbCellPhone d3 = (DmbCellPhone) c2; // 실행시점에 오류, 부모클래스인데
			d3.turnOnDmb();
		} else {
			System.out.println("casting 불가.");
		}
	}
}
