package com.yedam.jhi.interfaces.impl;

import java.util.List;

import com.yedam.jhi.interfaces.model.EmpService;
import com.yedam.jhi.interfaces.model.Employee;
import com.yedam.jhi.interfaces.model.Employees;

// EmpService의 메소드(기능)을 구현하는 class: EmpServiceImpl, implements: 구현, extends:상속
public class EmpServiceImpl implements EmpService {

//source -> override
	@Override
	public void addEmp(Employee emp, Employee[] emps) { // emps에 저장하겠다, db가 연결안되어있어서
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

	@Override
	public void searchEmployees() {
		System.out.println("디비조회");
		EmpDAO dao = new EmpDAO();
		Employees[] empArray = dao.getEmployees(); // 결과값이 배열값
		for (Employees emp : empArray) {
			if (emp != null) {
				System.out.println(emp.toString());
			}
		}

	}

	@Override
	public void insertEmployees(Employees emp) {
		System.out.println("디비 입력 기능");
		EmpDAO dao = new EmpDAO();
		dao.insertEmployees(emp);
	}

	@Override
	public List<Employees> getDBEmployees() {
		EmpDAO dao = new EmpDAO();
//		List<Employees> list = dao.getEmpList();
//		return list;
		return dao.getEmpList(); // 위의 두줄의 다른 방법.
	}

	@Override
	public Employees getDBEmployee(int empId) {
		EmpDAO dao = new EmpDAO();
		return dao.getEmployee(empId);
	}
	

	@Override
	public void insertDBEmp(Employees emp) {
		EmpDAO dao = new EmpDAO();
		dao.insertEmployees(emp);
	}
	

	@Override
	public void updateDBEmp(Employees emp) {
		EmpDAO dao = new EmpDAO();
		dao.updateEmployees(emp);
	}

	public void deleteDBEmp(Employees emp) {
		EmpDAO dao = new EmpDAO();
		dao.deleteEmployees(emp);
	}
}
