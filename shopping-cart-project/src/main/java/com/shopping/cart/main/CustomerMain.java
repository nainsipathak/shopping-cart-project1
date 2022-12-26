package com.shopping.cart.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shopping.cart.controller.CustomerController;
import com.shopping.cart.exception.CustomerNotFoundException;
import com.shopping.cart.model.Customer;

@Controller
public class CustomerMain {

	@Autowired
	private CustomerController customerController;
	
	public void customerRun() {
		System.out.println("\n Customer Entity records :");
		addCustomers(createCustomers());
	}

	//method to add Customers
	private void addCustomers(List<Customer> customers) {
		for(Customer customer : customers) {
			try {
				customerController.addCustomer(customer);
			} 
			catch (CustomerNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//method to create List Of Customers
	private List<Customer> createCustomers(){
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer c1 = new Customer("Tanvi Sharma", "Sharma", "Tanvi", "8150486278",
				"Hehal", "Hehal", "Ranchi", "Jharkhand", "834005",
				"India", null, 20L, null, null);
		
		Customer c2 = new Customer("Puja Verma", "Verma", "Puja", "9876543210",
				"Argora", "Argora", "Ranchi", "Jharkhand", "834002",
				"India", null, 30L, null, null);
		
		Customer c3 = new Customer("Sooraj Parshar", "Parshar", "Sooraj", "7785421360",
				"Prem Nagar, Delhi", "Prem Nagar, Delhi", "Delhi", "Delhi", "110086",
				"India", null, 20L, null, null);
		
		Customer c4 = new Customer("Rahul Jain", "Jain", "Rahul", "9758432016",
				"Prem Nagar, Delhi", "Prem Nagar, Delhi", "Delhi", "Delhi", "110086",
				"India", null, 20L, null, null);
		
		Customer c5 = new Customer("Kriti Pathak", "Pathak", "Kriti", "7784695102",
				"Varansi, Uttar Pradesh", "Varansi, Uttar Pradesh", "Varansi", "Uttar Pradesh", "221010",
				"India", null, 50L, null, null);
	
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		customers.add(c5);
		
		return customers;
	}
}
