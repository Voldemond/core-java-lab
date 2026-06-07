package com.cg.eis.bean;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void getEmployeedetails(Employee e) {

		System.out.println("Enter ID: ");
		e.setId(sc.nextInt());
		
		sc.nextLine()	;
		
		System.out.println("Enter name: ");
		
		e.setName(sc.nextLine());
		
		System.out.println("Enter Slary: ");
		e.setSalary(sc.nextDouble());
		
		sc.nextLine()	;
		
		System.out.println("Enter Designation : ");
		e.setDesignation(sc.nextLine());
		
	}
	
	public String findInsuranceScheme(Employee e ) {
		
		double salary = e.getSalary();
		String desig = e.getDesignation();
		
		if(salary > 50000 && desig.equals("Manager")) {
			return "Scheme A " ;
		}
		
		else if (salary > 20000 && salary <= 50000 && desig.equals("Programmer")) {
			return "Scheme B"	;
			
		}
		else if (salary > 5000 && salary <= 20000 && desig.equals("Clerk")) {
			return "Scheme C" ;
		}
		else {
			return "No Scheme";
		}
		
	}
	
	public void displayEmployee(Employee e ) {
		
		System.out.println("ID : "+ e.getId());
		System.out.println("Name : "+ e.getName());
		System.out.println("Salary : "+e.getSalary());
		System.out.println("Designation : "+e.getDesignation());
		System.out.println("Insurance Scheme : "+e.getInsuranceScheme());
	}

	
}
