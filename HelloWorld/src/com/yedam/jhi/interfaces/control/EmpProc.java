package com.yedam.jhi.interfaces.control;

import java.util.Scanner;
import com.yedam.jhi.interfaces.impl.EmpServiceImpl;
import com.yedam.jhi.interfaces.impl.EmpServiceImpl2;
import com.yedam.jhi.interfaces.model.EmpService;
import com.yedam.jhi.interfaces.model.Employee;

public class EmpProc {
	Employee[] employees = new Employee[10];
	Scanner scn = new Scanner(System.in);
	EmpService service = new EmpServiceImpl(); 
//	EmpService service = new EmpServiceImpl2(); 
//	EmpServiceImpl2 service = new EmpServiceImpl2(); 이렇게 해도 된다.
//	service = new EmpServiceImpl(); //EmpServiceImpl,EmpServiceImpl2 둘다 받을수있다.
	
	
//	execute: 컨트롤
	public void execute() {
		System.out.println("프로그램 시작.");
		while (true) {
			System.out.println("=============================");
			System.out.println("1.추가 2.조회 3.리스트 4.삭제 5.종료");
			System.out.println("=============================");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				System.out.print("이름: ");
				String name = scn.nextLine();
				System.out.print("사원번호: ");
				int empNo = scn.nextInt();
				System.out.print("급여: ");
				int salary = scn.nextInt();
				Employee emp = new Employee(name, empNo, salary);
				service.addEmp(emp, employees); //저장할 인스턴스:emp에다가 저장할 배열:employees 넣는걸 만들거임, addEmp로 실행 
				
			} else if (menu == 2) {
				System.out.println("사원번호 입력: ");
				int no = scn.nextInt();
				service.searchEmp(no, employees);
				
			} else if (menu == 3) {
				service.empList(employees);//매개값으로 employees라는 배열
				
			} else if (menu == 4) {
				System.out.println("사원번호 입력: ");
				int no = scn.nextInt();
				service.delEmp(no, employees);
				
			} else if (menu == 5) {
				break;
			}

		} // while
		System.out.println("프로그램 종료");
	}// main
}// class
