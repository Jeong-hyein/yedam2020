package com.yedam.jhi.interfaces.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.jhi.interfaces.common.DAO;
import com.yedam.jhi.interfaces.model.Employees;

public class EmpDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

//	1. 디비 전제 조회
	public List<Employees> getEmpList() {
		conn = DAO.getConnect();
		String sql = "select * from emp_temp";
		List<Employees> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Employees emp = new Employees();
				emp.setEmployeeId(rs.getInt("employee_id"));// 값을 필드에 값을 넣겠다.
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				list.add(emp); // 데이터가 있는만큼 돈다.

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn); // 연결을 끊어주는 작업
		}

		return list;
	}

//	2. 디비 한건 조회
	public Employees getEmployee(int emps) { // emps는 key -> emp로하면 이름 겹친다.
		conn = DAO.getConnect(); // 객체를 연결하는 것
		String sql = "select * from emp_temp where employee_id = ?";
		Employees emp = new Employees();
		try {
			pstmt = conn.prepareStatement(sql); // sql구문을 실행할 준비를 하고있어라
			pstmt.setInt(1, emps); // ?부분을 채우는거, 1: 첫번째 물음표

//			executeQuery():수행결과로 ResultSet 객체의 값을 반환,SELECT 구문을 수행할 때 사용되는 함수
			rs = pstmt.executeQuery(); //데이터 가져옴: 조회 할때 사용
			
			if (rs.next()) {// 데이터 받아옴
				emp.setEmployeeId(rs.getInt("employee_id"));// 값을 필드에 값을 넣겠다.
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
		return emp;
	}

// 	3. 디비 입력
	
//	4. 디비 수정, 리턴 타입 필요없음
	public void updateEmployees(Employees emp) { //int sal, String email, int eid
		conn = DAO.getConnect();
//		수정프로그램 중 기능보완 -> 급여인상분, 이메일 변경 동시에 변경하지 않는데
//		사용자가 변경하고 싶은 항목만 입력받아 처리하도록 수정.
//		"update emp_temp set salary - salary + 500, email = 'newEmail' where employee_id = 101"
		String sql = "update emp_temp set salary = salary + ?, email = ? where employee_id = ?";
//		String sql = "update emp_temp set first_name =first_name";
//		if(emp.getSalary() == 0) {
//		sql = sql + ", salary = salary + ?";
//		}
//		if(emp.getEmail() != null) {
//			sql = sql + ", email = ?"
//		}
//		sql = sql + "where employee_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getSalary());
			pstmt.setString(2, emp.getEmail());
			pstmt.setInt(3, emp.getEmployeeId());
			
			int r = pstmt.executeUpdate(); //구문에 의해 실행된 건수를 리턴해줌 
			System.out.println(r + "건이 변경되었습니다.");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
				
	}
	
//	5. 삭제
	public void deleteEmployees(Employees emp) {
		conn = DAO.getConnect();
		String sql = "delete from emp_temp where employee_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
//			수정 삭제 입력 : update 
			int d = pstmt.executeUpdate();
			System.out.println(d + "건이 삭제되었습니다");
					
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
			}
		
	}

	public void insertEmployees(Employees emp) {
		conn = DAO.getConnect();
		String sql = "insert into emp_temp (employee_id, last_name, email, hire_date, job_id)\r\n"
				+ "values(employees_seq.nextval, ? , ?, sysdate, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp.getLastName()); // ?값 셋팅, 1: 첫번째 물음표라는 뜻
			pstmt.setString(2, emp.getEmail());
			pstmt.setString(3, emp.getJobId());
			int cnt = pstmt.executeUpdate(); // 실행한다는 의미, 한건:1 ,두건 :2 나온다
			System.out.println(cnt + "건 입력");
		} catch (SQLException e) {
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}

	}// insert

	public Employees[] getEmployees() {
		conn = DAO.getConnect();
		String sql = "select * from employees"; // 구문을 쓰고 sql을 실행하겠다
		Employees[] emps = new Employees[100];
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(sql); // 해석해서 실행하겠다
			rs = pstmt.executeQuery(); // 처리
			while (rs.next()) { // 처리한거 빼내기, 처리개수만큼 돌아간다.
				Employees emp = new Employees(); // 담는거
				emp.setEmployeeId(rs.getInt("employee_id"));// 값을 필드에 값을 넣겠다.
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));

				emps[cnt++] = emp;

//	출력			System.out.println(rs.getInt("employee_id") + ", " + rs.getString("first_name"));
				// int이면 getInt, string이면 getString

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} // try ~ catch
		return emps;
	}// getEmployees
}/// class
