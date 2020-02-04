package com.yedam.jhi.interfaces.model;
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
	
	
	
}
