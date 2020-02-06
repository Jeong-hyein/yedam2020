package com.yedam.jhi.interfaces.control;

import java.util.List;
import java.util.Scanner;

import com.yedam.jhi.interfaces.impl.EmpServiceImpl;
import com.yedam.jhi.interfaces.model.EmpService;
import com.yedam.jhi.interfaces.model.Employee;
import com.yedam.jhi.interfaces.model.Employees;

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
			System.out.println("=====================================");
			System.out.println("1.추가 2.조회 3.리스트 4.삭제 5.종료 6.디비조회 7.디비입력 8.수정");
			System.out.println("=====================================");
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
				
			} //Impl도 수정해줘야함,public Employees getDBEmployee(int empId)
				else if (menu == 2) { 
				System.out.println("사원번호 입력: ");
				int no = scn.nextInt();
//				service.searchEmp(no, employees);
				Employees emp = service.getDBEmployee(no);
				System.out.println(emp);
				
			} else if (menu == 3) {
				service.empList(employees);//매개값으로 employees라는 배열
				
			} else if (menu == 4) {
				System.out.println("사원번호 입력: ");
				int empId = scn.nextInt();
//				service.delEmp(no, employees); int no로 정의했을때 사용(배열)
				
//				service의 매개값을 Employees로 정의했기때문에 emp정의해줌
				Employees emp = new Employees();
				emp.setEmployeeId(empId); //emp가 비어있을거니깐 empId를 넣어준다.
				service.deleteDBEmp(emp); //emp를 받아서 servicedml deleteDBEmp 실행
				
			} else if (menu == 5) {
				break;
			}  else if (menu == 6) {
//				service.searchEmployees();
				List<Employees> list = service.getDBEmployees();
				for(Employees emp : list) { //list에 들어있는거 만큼 실행
					System.out.println(emp);
				}
				
			} else if (menu == 7) {
				System.out.println("last 입력");
				String lastName = scn.nextLine();
				System.out.println("이메일 입력");
				String email = scn.nextLine();
				System.out.println("업무 입력");//IT_PROG
				String jobId = scn.nextLine();
				Employees emp = new Employees();
				emp.setLastName(lastName);
				emp.setEmail(email);
				emp.setJobId(jobId);
				
				service.insertEmployees(emp);
			} else if (menu == 8) {
				System.out.print("조회 사원번호입력: ");
				int empId = scn.nextInt();
//				System.out.print("급여 인상분 입력: "); //인상하는 금액
//				int sal = scn.nextInt(); scn.nextLine();
//				System.out.print("변경할 이메일 입력: ");
//				String email = scn.nextLine();
//				Employees emp = new Employees();
//				emp.setSalary(sal);
//				emp.setEmail(email);
//				emp.setEmployeeId(empId);
//				
//				service.updateDBEmp(emp);
				System.out.println("1. 급여 변경 2. 이메일 변경 3. 모두 변경");
				int subMenu = scn.nextInt();
				Employees emp = new Employees();

				if (subMenu == 1) { 
					System.out.print("급여 인상분 입력: "); //인상하는 금액
					int sal = scn.nextInt(); scn.nextLine();
					emp.setEmployeeId(empId);
					emp.setSalary(sal);
					service.updateDBEmp(emp);
				} else if (subMenu == 2) {
					System.out.print("변경할 이메일 입력: ");
					String email = scn.nextLine();
					emp.setEmployeeId(empId);
					emp.setEmail(email);	
					service.updateDBEmp(emp);
				} else if (subMenu == 3) {
					System.out.print("급여 인상분 입력: "); //인상하는 금액
					int sal = scn.nextInt(); scn.nextLine();
					System.out.print("변경할 이메일 입력: ");
					String email = scn.nextLine();
					emp.setEmployeeId(empId);
					emp.setSalary(sal);
					emp.setEmail(email);	
					service.updateDBEmp(emp);
				} 
				
				
				
				
				
			} 
				
				
				
			}
		System.out.println("프로그램 종료");
		} // while
		
	}// main

