package com.shopping.cart;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.shopping.cart.model.Customer;
import com.shopping.cart.repository.CustomerRepository;
import com.shopping.cart.service.CustomerService;

@SpringBootTest
class CustomerServiceTest {
	
	@Autowired
	private CustomerService customerService;
	
	@MockBean
	private CustomerRepository customerRepository;
	
	
	@Test
	public void getAllCustomersTest() {
		Customer customer = new Customer();
		
		customer.setCreditLimit(1L);
		customer.setCustomerName("Vicky Khanna");
		customer.setContactFirstName("Vicky");
		customer.setContactLastName("Khanna");
		customer.setCountry("Australia");
		
		Mockito.when(customerRepository.save(customer)).
			thenReturn(customer);
		assertThat(customerService.getAllCustomers()).
			isNotNull();
	}
	
	
	@Test
	public void getCustomerByIdTest() {
		Customer customer = new Customer();
		
		customer.setCreditLimit(1L);
		customer.setCustomerName("Vicky Khanna");
		customer.setContactFirstName("Vicky");
		customer.setContactLastName("Khanna");
		customer.setCountry("Australia");
		
		Mockito.when(customerRepository.save(customer)).
			thenReturn(customer);
		assertThat(customerService.getCustomerById(1L)).
			isNotNull();
	
	}

	
	@Test
	public void addCustomerTest() {
		Customer customer = new Customer("Vicky Khanna", "Khanna", "Vicky", "5477979708",
				"New York ", "New York", "New York", "New York", "834010",
				"America", null, 54L, null, null);
		
		Mockito.when(customerRepository.save(customer)).
			thenReturn(customer);
		assertThat(customerService.addCustomer(customer)).
			isEqualTo(customer);
		
	}
	
	
	@Test
	public void deleteCustomerTest() {
		Customer customer = new Customer();
		
		customer.setCreditLimit(1L);
		customer.setCustomerName("Naina Pathak");
		customer.setContactFirstName("Naina");
		customer.setContactLastName("Pathak");
		customer.setState("UP");
		customer.setCountry("India");
		
		Mockito.when(customerRepository.save(customer)).
			thenReturn(customer);
		customerService.deleteCustomer(1L);
		assertThat(customerService.getCustomerById(1L)).
			isEmpty();
		}
	
	
	@Test
	void updateCustomerTest() {
		Customer customer = new Customer();
		
		customer.setCreditLimit(1L);
		customer.setCustomerName("Naina Pathak");
		customer.setContactFirstName("Naina");
		customer.setContactLastName("Pathak");
		customer.setState("UP");
		customer.setCountry("India");
		
		Mockito.when(customerRepository.save(customer)).
			thenReturn(customer);
		customerService.updateCustomer(customer, 2L);
		assertThat(customerService.getCustomerById(1L)).
			isEmpty();
	}
	
	
	@Test
	void getCustomerSortedByNameTest() {
		Customer customer1 = new Customer();
		
		customer1.setCreditLimit(1L);
		customer1.setCustomerName("Vicky Khanna");
		customer1.setContactFirstName("Vicky");
		customer1.setContactLastName("Khanna");
		customer1.setCountry("Australia");
		
		Customer customer2 = new Customer();
		customer2.setCreditLimit(1L);
		customer2.setCustomerName("Naina Pathak");
		customer2.setContactFirstName("Naina");
		customer2.setContactLastName("Pathak");
		customer2.setCountry("India");
		
		Mockito.when(customerRepository.save(customer1)).
			thenReturn(customer1);
		Mockito.when(customerRepository.save(customer2)).
		thenReturn(customer2);
		assertThat(customerService.getCustomerSortedByName()).
			isNotNull();
	}

	@Test
	void getCustomerSortedByStateUsingNativeTest() {
		Customer customer1 = new Customer();
		
		customer1.setCreditLimit(1L);
		customer1.setCustomerName("Vicky Khanna");
		customer1.setContactFirstName("Vicky");
		customer1.setContactLastName("Khanna");
		customer1.setAddressLine1("Canberra");
		customer1.setState("Canberra");
		customer1.setCountry("Australia");
		
		Customer customer2 = new Customer();
		
		customer2.setCreditLimit(1L);
		customer2.setCustomerName("Naina Pathak");
		customer2.setContactFirstName("Naina");
		customer2.setContactLastName("Pathak");
		customer2.setAddressLine1("Jalandhar, UP");
		customer2.setState("UP");
		customer2.setCountry("India");
		
		Mockito.when(customerRepository.save(customer1)).
			thenReturn(customer1);
		Mockito.when(customerRepository.save(customer2)).
		thenReturn(customer2);
		assertThat(customerService.getCustomerSortedByStateUsingNative()).
			isNotNull();
		}

	@Test
	void getCustomerByFirstNameAndLastNameTest() {
		Customer customer = new Customer();
		
		customer.setCreditLimit(1L);
		customer.setCustomerName("Vicky Khanna");
		customer.setContactFirstName("Vicky");
		customer.setContactLastName("Khanna");
		customer.setCountry("Australia");
		
		Mockito.when(customerRepository.save(customer)).
			thenReturn(customer);
		assertThat(customerService.getCustomerByFirstNameAndLastName("Vicky", "Khanna")).
			isNotNull();
	}

	@Test
	void getCustomersUsingPagingTest() {
		Customer customer = new Customer();
		
		customer.setCreditLimit(1L);
		customer.setCustomerName("Vicky Khanna");
		customer.setContactFirstName("Vicky");
		customer.setContactLastName("Khanna");
		customer.setCountry("Australia");
		
		Mockito.when(customerRepository.save(customer)).
			thenReturn(customer);
		assertThat(customerService.getCustomersUsingPaging()).
			isNotNull();
	}

	@Test
	void getSortCustomersUsingSortingTest() {
		Customer customer1 = new Customer();
		
		customer1.setCreditLimit(1L);
		customer1.setCustomerName("Vicky Khanna");
		customer1.setContactFirstName("Vicky");
		customer1.setContactLastName("Khanna");
		customer1.setState("Canberra");
		customer1.setCountry("Australia");
		
		Customer customer2 = new Customer();
		
		customer2.setCreditLimit(1L);
		customer2.setCustomerName("Naina Pathak");
		customer2.setContactFirstName("Naina");
		customer2.setContactLastName("Pathak");
		customer2.setState("UP");
		customer2.setCountry("India");
		
		Mockito.when(customerRepository.save(customer1)).
			thenReturn(customer1);
		Mockito.when(customerRepository.save(customer2)).
		thenReturn(customer2);
		assertThat(customerService.getSortCustomersUsingSorting()).
			isNotNull();
	}

}
