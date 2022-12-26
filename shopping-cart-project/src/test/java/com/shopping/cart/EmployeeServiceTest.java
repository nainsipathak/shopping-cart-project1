package com.shopping.cart;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.shopping.cart.model.Employee;
import com.shopping.cart.repository.EmployeeRepository;
import com.shopping.cart.service.EmployeeService;

@SpringBootTest
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService employeeService;
	
	@MockBean
	private EmployeeRepository employeeRepository;
	
	@Test
	public void getAllEmployeesTest() {
		Employee employee = new Employee();
		
		employee.setEmployeeNumber(1L);
		employee.setFirstName("Nishu");
		employee.setLastName("Singh");
		employee.setExtension("Full Time");
		employee.setJobTitle("Full-stack Developer");
		employee.setEmail("nishu22@gmail.com");
		employee.setOfficeCode("TCS");
		
		Mockito.when(employeeRepository.save(employee)).
		thenReturn(employee);
		assertThat(employeeService.getAllEmployees()).
		isNotNull();
	}
	
	@Test
	public void getEmployeeByIdTest() {
		Employee employee = new Employee();
		
		employee.setEmployeeNumber(1L);
		employee.setFirstName("Nishu");
		employee.setLastName("Singh");
		employee.setExtension("Full Time");
		employee.setJobTitle("Full-stack Developer");
		employee.setEmail("nishu22@gmail.com");
		employee.setOfficeCode("TCS");
		
		Mockito.when(employeeRepository.save(employee)).
		thenReturn(employee);
		assertThat(employeeService.getEmployeeById(1L)).
		isNotNull();
	}
	
	@Test
	public void addEmployeeTest() {
		Employee employee = new Employee();
		
		employee.setEmployeeNumber(1L);
		employee.setFirstName("Nishu");
		employee.setLastName("Singh");
		employee.setExtension("Full Time");
		employee.setJobTitle("Full-stack Developer");
		employee.setEmail("nishu22@gmail.com");
		employee.setOfficeCode("TCS");
		
		Mockito.when(employeeRepository.save(employee)).
		thenReturn(employee);
		assertThat(employeeService.addEmployee(employee)).
		isEqualTo(employee);
		
	}
	
	@Test
	public void deleteEmployeeTest() {
		Employee employee = new Employee();
		
		employee.setEmployeeNumber(1L);
		employee.setFirstName("Nishu");
		employee.setLastName("Singh");
		employee.setExtension("Full Time");
		employee.setJobTitle("Full-stack Developer");
		employee.setEmail("nishu22@gmail.com");
		employee.setOfficeCode("TCS");
		
		Mockito.when(employeeRepository.save(employee)).
		thenReturn(employee);
		employeeService.deleteEmployee(1L);
		assertThat(employeeService.getEmployeeById(1L)).
		isEmpty();

	}
	
	@Test
	public void updateEmployeeTest() {
		Employee employee = new Employee();
		
		employee.setEmployeeNumber(1L);
		employee.setFirstName("Nishu");
		employee.setLastName("Singh");
		employee.setExtension("Full Time");
		employee.setJobTitle("Full-stack Developer");
		employee.setEmail("nishu22@gmail.com");
		employee.setOfficeCode("TCS");
		
		Mockito.when(employeeRepository.save(employee)).
		thenReturn(employee);
		employeeService.updateEmployee(employee, 2L);
		assertThat(employeeService.getEmployeeById(1L)).
		isEmpty();

	}
	
	@Test
	public void getEmployeeSortedByFirstNameTest() {
		Employee employee1 = new Employee();
		
		employee1.setEmployeeNumber(1L);
		employee1.setFirstName("Nishu");
		employee1.setLastName("Singh");
		employee1.setExtension("Full Time");
		employee1.setJobTitle("Full-stack Developer");
		employee1.setEmail("nishu22@gmail.com");
		employee1.setOfficeCode("TCS");
		
		Employee employee2 = new Employee();
		
		employee2.setEmployeeNumber(1L);
		employee2.setFirstName("Neha");
		employee2.setLastName("Yadav");
		employee2.setExtension("Part Time");
		employee2.setJobTitle("Data Analyser");
		employee2.setEmail("nehu22@gmail.com");
		employee2.setOfficeCode("COGNIZANT");
		
		Mockito.when(employeeRepository.save(employee1)).
		thenReturn(employee1);
		Mockito.when(employeeRepository.save(employee2)).
		thenReturn(employee2);
		assertThat(employeeService.getEmployeeSortedByFirstName()).
		isNotNull();

	}
	
	@Test
	public void getEmployeeSortedByLastNameUsingNativeTest() {
		Employee employee1 = new Employee();
		
		employee1.setEmployeeNumber(1L);
		employee1.setFirstName("Nishu");
		employee1.setLastName("Singh");
		employee1.setExtension("Full Time");
		employee1.setJobTitle("Full-stack Developer");
		employee1.setEmail("nishu22@gmail.com");
		employee1.setOfficeCode("TCS");
		
		Employee employee2 = new Employee();
		
		employee2.setEmployeeNumber(1L);
		employee2.setFirstName("Nishu");
		employee2.setLastName("Singh");
		employee2.setExtension("Full Time");
		employee2.setJobTitle("Full-stack Developer");
		employee2.setEmail("nishu22@gmail.com");
		employee2.setOfficeCode("TCS");
		
		Mockito.when(employeeRepository.save(employee1)).
		thenReturn(employee1);
		Mockito.when(employeeRepository.save(employee2)).
		thenReturn(employee2);
		assertThat(employeeService.getEmployeeSortedByLastNameUsingNative()).
		isNotNull();

	}
	
	@Test
	public void getEmployeeByCodeTest() {
		Employee employee = new Employee();
		
		employee.setEmployeeNumber(1L);
		employee.setFirstName("Nishu");
		employee.setLastName("Singh");
		employee.setExtension("Full Time");
		employee.setJobTitle("Full-stack Developer");
		employee.setEmail("Nishu@gmail.com");
		employee.setOfficeCode("TCS");
		
		Mockito.when(employeeRepository.save(employee)).
		thenReturn(employee);
		assertThat(employeeService.getEmployeeByCode("TCS")).
		isNotNull();

	}
	
	@Test
	public void getEmployeesUsingPagingTest() {
		Employee employee1 = new Employee();
		
		employee1.setEmployeeNumber(1L);
		employee1.setFirstName("Nishu");
		employee1.setLastName("Singh");
		employee1.setExtension("Full Time");
		employee1.setJobTitle("Full-stack Developer");
		employee1.setEmail("nishu22@gmail.com");
		employee1.setOfficeCode("TCS");
		
		Employee employee2 = new Employee();
		
		employee2.setEmployeeNumber(1L);
		employee2.setFirstName("Neha");
		employee2.setLastName("Yadav");
		employee2.setExtension("Part Time");
		employee2.setJobTitle("Game Developer");
		employee2.setEmail("nehu22@gmail.com");
		employee2.setOfficeCode("COGNIZANT");
		
		Mockito.when(employeeRepository.save(employee1)).
		thenReturn(employee1);
		Mockito.when(employeeRepository.save(employee2)).
		thenReturn(employee2);
		assertThat(employeeService.getEmployeesUsingPaging()).
		isNotNull();

	}
	
	@Test
	public void getSortEmployeesUsingSortingTest() {
		Employee employee1 = new Employee();
		
		employee1.setEmployeeNumber(1L);
		employee1.setFirstName("Nishu");
		employee1.setLastName("Singh");
		employee1.setExtension("Full Time");
		employee1.setJobTitle("Full-stack Developer");
		employee1.setEmail("nishu22@gmail.com");
		employee1.setOfficeCode("TCS");
		
		Employee employee2 = new Employee();
		
		employee2.setEmployeeNumber(1L);
		employee2.setFirstName("Neha");
		employee2.setLastName("Yadav");
		employee2.setExtension("Part Time");
		employee2.setJobTitle("Game Develpoer");
		employee2.setEmail("nehu22@gmail.com");
		employee2.setOfficeCode("COGNIZANT");
		
		Mockito.when(employeeRepository.save(employee1)).
		thenReturn(employee1);
		Mockito.when(employeeRepository.save(employee2)).
		thenReturn(employee2);
		assertThat(employeeService.getSortEmployeesUsingSorting()).
		isNotNull();

	}
}
