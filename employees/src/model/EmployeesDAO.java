package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import vo.Employees;

public class EmployeesDAO {
	public List<Employees> selectEmplyeesListOrderBy(String order) {
		String sql = null;
		if(order.equals("asc")) {
			sql = "SELECT emp_no, birth_date, first_name, last_name, gender, hire_date FROM employees ORDER BY first_name ASC LIMIT 50";

		}else if(order.equals("desc")) {
			sql = "SELECT emp_no, birth_date, first_name, last_name, gender, hire_date FROM employees ORDER BY first_name DESC LIMIT 50";

		}
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Employees> list = new ArrayList<Employees>();
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/employees", "root", "java1234");
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				Employees employees = new Employees();
				employees.setEmpNo(rs.getInt("emp_no"));
				employees.setBirthDate(rs.getString("birth_date"));
				employees.setFirstName(rs.getString("first_name"));
				employees.setLastName(rs.getString("last_name"));
				employees.setGender(rs.getString("gender"));
				employees.setHireDate(rs.getString("hire_date"));
				list.add(employees);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public List<Employees> selectEmplyeesList(int limit) {
		String sql = "SELECT emp_no, birth_date, first_name, last_name, gender, hire_date FROM employees LIMIT ?";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Employees> list = new ArrayList<Employees>();
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/employees", "root", "java1234");
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1,limit);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				Employees employees = new Employees();
				employees.setEmpNo(rs.getInt("emp_no"));
				employees.setBirthDate(rs.getString("birth_date"));
				employees.setFirstName(rs.getString("first_name"));
				employees.setLastName(rs.getString("last_name"));
				employees.setGender(rs.getString("gender"));
				employees.setHireDate(rs.getString("hire_date"));
				list.add(employees);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public int selectEmployeesRowCount() {
		int employeesRowCount = 0;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT COUNT(*) cnt FROM employees";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/employees", "root", "java1234");
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			if(rs.next()) {
				employeesRowCount = rs.getInt("cnt");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return employeesRowCount;
	}
}

