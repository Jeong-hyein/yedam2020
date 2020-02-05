package com.yedam.jhi.interfaces.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	public static void main(String[] args) {
		getConnect();
	}
	public static Connection getConnect() {
		Connection conn = null;
		String user = "hr";
		String passwd = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("연결성공.");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return conn;

	}
	
	public static void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
	}
}
