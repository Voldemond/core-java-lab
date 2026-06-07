package com.cg.eis.bean;

import com.cg.eis.bean.Employee;
import com.cg.eis.bean.EmployeeServiceImpl;

public class Exercise_2 {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		
		service.getEmployeedetails(e);
		
		String scheme = service.findInsuranceScheme(e);
		e.setInsuranceScheme(scheme);
		
		service.displayEmployee(e);
	}
}
