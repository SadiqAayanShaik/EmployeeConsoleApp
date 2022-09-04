package JDBC;

import java.sql.Connection;




import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Company;
import Model.Department;
import Model.Employee;

 

public class jdbc_operation {
	Connection conn;
	Scanner scan = new Scanner(System.in);
	//jdbc_operation jd=new jdbc_operation();
	 dispaly dis=new dispaly();
	Employee emp = new Employee();
    Company c=new Company();
	Department d = new Department();

	public void getConnection() throws SQLException {
		JDBC_Connection j = new JDBC_Connection();

		j.getConnection();
	}

	public void insertEmp() throws SQLException {

		System.out.print("Enter Employee ID: ");
		int id = scan.nextInt();

		System.out.print("Enter Employee name");
		String s = scan.nextLine();
		String name = scan.nextLine();

		System.out.print("Enter Employee dob: ");
		String dob = scan.nextLine();

		System.out.print("Enter Employee phone: ");
		String phone = scan.nextLine();
		System.out.println();
		
		System.out.print("Enter Employee Department name:");
		String dname=scan.nextLine();
		

		System.out.print("Enter Comapny Name:");
		 String cname=scan.nextLine();

		emp.setEmpId(id);
		emp.setEmpName(name);
		emp.setEmpPh(phone);
		emp.setEmpDOB(dob);
		emp.setdName(dname);
		emp.setcName(cname);

		JDBC_Connection j = new JDBC_Connection();

		conn = j.getConnection();

		PreparedStatement ps1 = conn.prepareStatement("insert into employee(emp_id,emp_name,emp_phone,emp_dob,d_name,c_name) values('"
				+ emp.getEmpId() + "','" + emp.getEmpName() + "','" + emp.getEmpPh() + "','" + emp.getEmpDOB() +"','"+emp.getdName()+"','"+emp.getcName()+ "');");
		int count1 = ps1.executeUpdate();
		
		

		
		 System.out.println("Inserted " + count1 + " row"); 
		  System.out.println("Employee details are recoreded: " + emp.toString());
		 
	}

	public void insertComp() throws SQLException {
		System.out.print("Enter Company Id:");
	

	}

	public void insertDept() throws SQLException {
		

	}

	public void empdis() throws SQLException {
		
		System.out.print("Enter Employee id you want to dispaly:");
		int id = scan.nextInt();
        String sql="select *from employee where emp_id="+id;
		JDBC_Connection j = new JDBC_Connection();

		conn = j.getConnection();
		Statement stmt = conn.createStatement();
		 
		 ResultSet rs=stmt.executeQuery( sql);
		 while(rs.next())
		 {
			 emp.setEmpId(rs.getInt(1));
			 emp.setEmpName(rs.getString(2));
			 emp.setEmpPh(rs.getString(3));
			 emp.setEmpDOB(rs.getString(4));
			 emp.setdName(rs.getString(5));
			 emp.setcName(rs.getString(6));
		 }
		
		emp.dis();
	}

	public void empdelete() throws SQLException {
		
		System.out.print("Enter Employee id you want to delete:");
		int id = scan.nextInt();

		JDBC_Connection j = new JDBC_Connection();

		conn = j.getConnection();
		Statement stmt = conn.createStatement();
		PreparedStatement ps1 = conn.prepareStatement("delete from employee where emp_id=?");
		ps1.setInt(1, id);
		int count1 = ps1.executeUpdate();

		System.out.println("Delete " + count1 + " row");
	}

	public void cdis() throws SQLException
	{
		JDBC_Connection j = new JDBC_Connection();

		conn = j.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs3 = stmt.executeQuery("select * from company");
		while (rs3.next()) {
			System.out.println("\tCompany Id: "+rs3.getInt(1)+"\n\tCompany Name: "+rs3.getString(2));
		System.out.println("\n");	  
		}
		 
	}
	public void cadd() throws SQLException
	{
	
		System.out.print("Enter Company ID: ");
		int id = scan.nextInt();

		System.out.print("Enter Company name: ");
		String name1=scan.nextLine();
		String name = scan.nextLine();
		
		c.setCompId(id);
		c.setCompName(name);
		
		JDBC_Connection j = new JDBC_Connection();

		conn = j.getConnection();

		PreparedStatement ps1 = conn.prepareStatement("insert into company(c_id,c_name) values('"
				+ c.getCompId() + "','" + name+"');");
		int count1 = ps1.executeUpdate();
		
		System.out.println(c.toString());
	}
	public void dadd() throws SQLException
	{
		System.out.print("Enter Department ID: ");
		int id = scan.nextInt();

		System.out.print("Enter Department name: ");
		String name1=scan.nextLine();
		String name = scan.nextLine();
		
		 d.setDeptId(id);
		 d.setDeptName(name);
		
		JDBC_Connection j = new JDBC_Connection();

		conn = j.getConnection();

		PreparedStatement ps1 = conn.prepareStatement("insert into company(d_id,d_name) values('"
				+ id + "','" + name+"');");
		int count1 = ps1.executeUpdate();
		
		System.out.println(d.toString());
	}
	 
	public void ddis() throws SQLException
	{
		 
		JDBC_Connection j = new JDBC_Connection();

		conn = j.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs1 = stmt.executeQuery("select * from department");
		while (rs1.next()) {
			System.out.println("\tDepartment Id: "+rs1.getInt(1)+"\n\tDepartment Name: "+rs1.getString(2));
			System.out.println("\n");	
			
		}
		 
	}
	public void cdelete() throws SQLException
	{
		System.out.print("Enter Company id you want to delete:");
		int id = scan.nextInt();

		JDBC_Connection j = new JDBC_Connection();

		conn = j.getConnection();
		Statement stmt = conn.createStatement();
		PreparedStatement ps1 = conn.prepareStatement("delete from company where c_id=?");
		ps1.setInt(1, id);
		int count1 = ps1.executeUpdate();

		System.out.println("Delete " + count1 + " row");
	}
	public void ddelete() throws SQLException
	{
		System.out.print("Enter Department id you want to delete:");
		int id = scan.nextInt();

		JDBC_Connection j = new JDBC_Connection();

		conn = j.getConnection();
		Statement stmt = conn.createStatement();
		PreparedStatement ps1 = conn.prepareStatement("delete from department where d_id=?");
		ps1.setInt(1, id);
		int count1 = ps1.executeUpdate();

		System.out.println("Delete " + count1 + " row");
	}
	public void all() throws SQLException
	{
		 String sql="select *from employee;";
			JDBC_Connection j = new JDBC_Connection();

			conn = j.getConnection();
			Statement stmt = conn.createStatement();
			 
			 ResultSet rs=stmt.executeQuery(sql);
			 while(rs.next())
			 {
				 System.out.print("\tEmployee ID: "+rs.getInt(1)+"\n\tEmployee Name:"+rs.getString(2)+"\n\tEmployee Phone: "+rs.getString(3)+"\n\tEmployee Dob: "+rs.getString(4)+"\n\tEmployee Department: "+rs.getString(5)+"\n\tCompany:"+rs.getString(6));
			     System.out.println("\n\n");
			 }
	}
	public List<String> cAll() throws SQLException
	{
		 String sql="select d_name from d2 where emp_id=111;";
			JDBC_Connection j = new JDBC_Connection();
          List<String> l=new ArrayList<String>();
			conn = j.getConnection();
			Statement stmt = conn.createStatement();
			 
			 ResultSet rs=stmt.executeQuery(sql);
			 while(rs.next())
			 {
				l.add(rs.getString(1)); 
			 }
			 
			 return l;
	}
}
