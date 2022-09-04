package Model;

import java.util.ArrayList;
import java.util.List;

public class Company {
	
	private int compId;
	private String compName;
	
	List<Employee> lemp;

	@Override
	public String toString() {
		return "Company [compId=" + compId + ", compName=" + compName  + "]";
	}

	public int getCompId() {
		return compId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public List<Employee> getLemp() {
		return lemp;
	}

	public void setLemp(List<Employee> lemp) {
		this.lemp = lemp;
	}

	public Company(int compId, String compName ) {
		super();
		this.compId = compId;
		this.compName = compName;
		 
	}

	public Company() {
	 
	}

	 
 

	 
	
	
	
}