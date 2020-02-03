package com.yedam.jhi.classes.extendPkg;

public class DriverExample {
	public static void main(String[] args) {
		Driver d1 = new Driver();
		Vehicle vehicle = new Vehicle();
		d1.drive(vehicle); //실행
		vehicle = new Bus(); //자동형변환: promotion
		d1.drive(vehicle); //실행
		vehicle = new Truck(); //자동형변환: promotion
		d1.drive(vehicle); //실행
	}
}
