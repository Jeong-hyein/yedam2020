package com.yedam.jhi.interfaces.model;
//인터페이스, 기능정의
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
