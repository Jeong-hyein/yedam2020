package com.yedam.jhi.interfaces.impl;

import com.yedam.jhi.interfaces.model.EmpService;
import com.yedam.jhi.interfaces.model.Employee;

// EmpService의 메소드(기능)을 구현하는 class: EmpServiceImpl, implements: 구현, extends:상속
public class EmpServiceImpl implements EmpService {

//source -> override
	@Override
	public void addEmp(Employee emp, Employee[] emps) { // emps에 저장하겠다
//		System.out.println("추가기능");
		for (int i = 0; i < emps.length; i++) {
			if (emps[i] == null) {
				emps[i] = emp;
				break;
			}
		}
		System.out.println("입력완료");

	}

	@Override
	public void searchEmp(int empNo, Employee[] emps) {
//		System.out.println("조회기능");
		for (Employee emp : emps) {
			if (emp != null && emp.getEmpNo() == empNo) { // int 타입이라서 ==사용, 문자면 이퀄
				System.out.println(emp);
			}

		}

	}

	@Override
	public void empList(Employee[] emps) {
//		System.out.println("리스트기능");
		for (Employee emp : emps) { // 매개값 배열:emps, 배열값을 돌면서 확인후 sysout실행
			if (emp != null) {
				System.out.println(emp);
			}
		}

	}

	@Override
	public void delEmp(int empNo, Employee[] emps) {
//		System.out.println("삭제기능");
		for (int i = 0; i < emps.length; i++) {
			if (emps[i] != null && emps[i].getEmpNo() == empNo) {
				emps[i] = null;
			}
		}

	}

}
