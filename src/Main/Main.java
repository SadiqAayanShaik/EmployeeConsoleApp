package Main;

import java.sql.SQLException;
import java.util.Scanner;

import JDBC.jdbc_operation;
import Model.Employee;

public class Main {

	public static void main(String[] args) throws SQLException {
     
		Main m=new Main();
		m.menu();
		
	}
	
	
	
	public void menu() throws SQLException
	{
		Scanner scan = new Scanner(System.in);
		//Employee emp=new Employee();
		jdbc_operation jd = new jdbc_operation();
		Ddop o=new Ddop();
		int i=10;

		
		
        while(i==10) {
        	i=0;
        	System.out.println("\n\t\t=========== Main Menu ===========\n");
        	System.out.println("\t Enter 1 to add Employee");
        	System.out.println("\t Enter 2 to add Company");
        	System.out.println("\t Enter 3 to add Department");
    		System.out.println("\t Enter 4 to display details");
    		System.out.println("\t Enter 5 to delete Operations");
    		System.out.println("\t Enter 0 to Exit...");
    		i = scan.nextInt();
        
		switch (i) {
		case 1://System.out.println(jd.cAll());
			jd.insertEmp();
			Main m=new Main();
        	m.menu();
			break;
			
		case 2:
            jd.cadd();
            Main m1=new Main();
        	m1.menu();
			break;
		case 3:
            jd.dadd();
            Main m2=new Main();
        	m2.menu();
			break;
			
		case 4:
			o.displayOpt();
			break;
		case 5:
			o.deleteOpt();
			break;
			
	  default: 
		  System.out.println("\n================== invalid choice...===================\n ===================Please Enter valid number....=============");
		}
        }
        System.out.println("\n\t\t...............System Shutdown.............\t");
        
	}

}
