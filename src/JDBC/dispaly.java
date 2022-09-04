package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model.Department;
import Model.Employee;

public class dispaly {
	Connection conn;
	Department d=new Department();
	Employee emp=new Employee();
	public void dpdis() throws SQLException
	{
		JDBC_Connection j = new JDBC_Connection();

		conn = j.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs1 = stmt.executeQuery("select * from department where emp_id ='" + emp.getEmpId() + "'");
		while (rs1.next()) {
			d.setDeptId(rs1.getInt(1));
			d.setDeptName(rs1.getString(2));
			
		}
		
	}

}
