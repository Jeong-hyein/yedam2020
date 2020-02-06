package com.yedam.jhi.interfaces.model;

import java.util.List;

//인터페이스, 기능(메소드)정의,인터페이스는 abstract(추상)을 안써줘도 추상메소드이다.
//추상메소드는 {}가 없다. 
public interface EmpService {
//	저장기능
	public void addEmp(Employee emp, Employee[] emps); //저장공간 Employee[]
	
//	조회기능, 저장도 같이
	public void searchEmp(int empNo, Employee[] emps);
	
//	리스트
	public void empList(Employee[] emps);
	
//	삭제
	public void delEmp(int empNo, Employee[] emps);
	
//	default를 안하면 EmpService를 구현하는 클래스가 다 에러난다.
//	추상 메소드가 아니다.
//	default public void newMethod() {
//		System.out.println("new Method");
//	};
	
//	디비 연결 조회 기능
	public void searchEmployees();

//	디비 입력 기능
	public void insertEmployees(Employees emp);
	
// 	->  collection 디비 처리
//	1. 전체데이터 조회
	public List<Employees>  getDBEmployees();
	
//	2. 한건 조회
	public Employees getDBEmployee(int empId);
	
//	3. 입력
	public void insertDBEmp(Employees emp);
	
//	4. 수정
	public void updateDBEmp(Employees emp);
	
//	5. 삭제
	public void deleteDBEmp(Employees emp);
}
