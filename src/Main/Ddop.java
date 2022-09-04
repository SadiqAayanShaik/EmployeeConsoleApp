package Main;

import java.sql.SQLException;
import java.util.Scanner;

import JDBC.jdbc_operation;

public class Ddop {
	Scanner scan=new Scanner(System.in);
	jdbc_operation jd=new jdbc_operation();
	int i=1;
	public void displayOpt() throws SQLException
	{
		while(i!=0)
		{
			i=0;
			System.out.println("\n\t\t===========Display===========\n");
			System.out.println("Enter 1 to dispaly Employee");
			System.out.println("Enter 2 for all Employees");
        	System.out.println("Enter 3 to display Company");
        	System.out.println("Enter 4 to display Department");
        	System.out.println("Enter 0 to main menu...");
        	i=scan.nextInt();
        	
        	switch(i)
        	{
        	case 1:jd.empdis();
        	        
        		break;
        	case 2:jd.all();
        		break;
        	
        	case 3:jd.cdis();
        		break;
        	case 4:jd.ddis();
        	       break;
        	default:System.out.println("invalid....");
        	
        	}
        	
        	System.out.println("enter any number to main menu");
        	int j=scan.nextInt();
        	Main m=new Main();
        	m.menu();
        
		}
	}
	
	public void deleteOpt() throws SQLException
	{
		while(i!=0)
		{
			i=0;
			System.out.println("\n\t\t===========  Delete Menu  ===========\n");
			System.out.println("Enter 1 to Delete Employee by ID");
        	System.out.println("Enter 2 to Delete Company by ID");
        	System.out.println("Enter 3 to Delete Department by Id");
        	System.out.println("Enter 0 to main menu...");
        	i=scan.nextInt();
        	
        	switch(i)
        	{
        	case 1:jd.empdelete();
        		break;
        	case 2:jd.cdelete();
        		break;
        	case 3:jd.ddelete();
        		break;
        	default:System.out.println("invalid....");
        	
        	}
        	
        	System.out.println("enter any number to main menu");
        	int j=scan.nextInt();
        	Main m=new Main();
        	m.menu();
		}
	}

}

