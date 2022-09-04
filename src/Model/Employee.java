package Model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private int empId;
	private String empName;
	private String empPh;
	private String empDOB;
	private String dName;
	private String cName;
	

	public String getdName() {
		return dName;
	}


	public void setdName(String dName) {
		this.dName = dName;
	}


	public String getcName() {
		return cName;
	}


	public void setcName(String cName) {
		this.cName = cName;
	}

	List<Department> listDept;


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpPh() {
		return empPh;
	}


	public void setEmpPh(String empPh) {
		this.empPh = empPh;
	}


	public String getEmpDOB() {
		return empDOB;
	}


	public void setEmpDOB(String empDOB) {
		this.empDOB = empDOB;
	}


	public List<Department> getListDept() {
		return listDept;
	}


	public void setListDept(List<Department> listDept) {
		this.listDept = listDept;
	}


	public Employee(int empId, String empName, String empPh, String empDOB, List<Department> listDept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPh = empPh;
		this.empDOB = empDOB;
		this.listDept = listDept;
	}


	 


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPh=" + empPh + ", empDOB=" + empDOB + "]";
	}


	public Employee() {
		 
	}
	
	public void dis()
	{
		Department d=new Department();
		Company c=new Company();
		System.out.println("\n\t\t================ Employee Details===============\n");
		System.out.println("\t\t Employee Id: "+empId);
		System.out.println("\t\t Employee Name: "+empName);
		System.out.println("\t\t Employee PhoneNUmber: "+empPh);
		System.out.println("\t\t Employee date of birth: "+empDOB);
		System.out.println("\t\t Employee department:"+dName);
		System.out.println("\t\t Employee Company Name: "+cName);
		System.out.println("\n\n");
	}
	
   
}
