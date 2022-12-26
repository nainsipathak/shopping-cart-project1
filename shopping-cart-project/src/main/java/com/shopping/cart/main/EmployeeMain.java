package com.shopping.cart.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shopping.cart.controller.EmployeeController;
import com.shopping.cart.exception.EmployeeNotFoundException;
import com.shopping.cart.model.Employee;

@Controller
public class EmployeeMain {

	@Autowired
	private EmployeeController employeeController;
	
	public void employeeRun() {
		System.out.println("\n Employee Entity records :");
		addEmployees(createEmployees());
	}

	//method to add Employees
	private void addEmployees(List<Employee> employees) {
		for(Employee employee : employees) {
			try {
				employeeController.addEmployee(employee);
			}
			catch (EmployeeNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//method to create List of Employees
	private List<Employee> createEmployees(){
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee e1 = new Employee("Singh", "Nishu", "Full Time", "nishu22@gmail.com", 
				"TCS", "Madho Pasupuleti", "Full-stack Developer", null, null, null);
		
		Employee e2 = new Employee("Prajapati", "Varun", "Full Time", "prajapati@gmail.com", 
				"CAPGEMINI", "Nishu Singh", "Software Developer", null, null, null);
		
		Employee e3 = new Employee("Mishra", "Anirudha", "Part Time", "anirudh5@gmail.com", 
				"COGNIZANT", "Varun Prajapati", "System Worker", null, null, null);
		
		Employee e4 = new Employee("Vashudev", "Krishna", "Full Time", "Vashu@gmail.com", 
				"ACCENTURE", "Anirudha Mishra", "Manager", null, null, null);
		
		Employee e5 = new Employee("Krishna", "Arvind", "Full Time", "arvind@gmail.com", 
				"IBM", "Krishna Vasudev", "President", null, null, null);
	
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		return employees;
	}
}
