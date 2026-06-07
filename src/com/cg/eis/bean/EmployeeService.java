package com.cg.eis.bean;

import com.cg.eis.bean.Employee; 

public interface EmployeeService {

	void getEmployeedetails(Employee e); 
	
	String findInsuranceScheme(Employee e );
	
	void displayEmployee(Employee e ); 
}
