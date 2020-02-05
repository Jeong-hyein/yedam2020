package com.yedam.jhi.interfaces.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yedam.jhi.interfaces.common.DAO;
import com.yedam.jhi.interfaces.model.Employees;

public class EmpDAO {
	
	public void insertEmployees(Employees emp) {
		Connection conn = DAO.getConnect();
		String sql = "insert into emp_temp (employee_id, last_name, email, hire_date, job_id)\r\n" +  
				      "values(employees_seq.nextval, ? , ?, sysdate, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp.getLastName()); //?값 셋팅, 1: 첫번째 물음표라는 뜻
			pstmt.setString(2, emp.getEmail());
			pstmt.setString(3, emp.getJobId());
			int cnt = pstmt.executeUpdate(); //실행한다는 의미, 한건:1 ,두건 :2 나온다
			System.out.println(cnt + "건 입력");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}//insert
	
	
	
	public Employees[] getEmployees() {
		Connection conn = DAO.getConnect();
		String sql = "select * from employees"; // 구문을 쓰고 sql을 실행하겠다
		Employees[] emps = new Employees[100];
		int cnt = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql); //해석해서 실행하겠다
			ResultSet rs = pstmt.executeQuery(); // 처리
			while (rs.next()) { // 처리한거 빼내기, 처리개수만큼 돌아간다.
				Employees emp = new Employees(); //담는거
				emp.setEmployeeId(rs.getInt("employee_id"));//값을 필드에 값을 넣겠다.
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
