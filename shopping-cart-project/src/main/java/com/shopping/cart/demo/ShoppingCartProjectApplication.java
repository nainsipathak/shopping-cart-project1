package com.shopping.cart.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shopping.cart.main.CustomerMain;
import com.shopping.cart.main.EmployeeMain;
import com.shopping.cart.main.OfficeMain;
import com.shopping.cart.main.OrderDetailMain;
import com.shopping.cart.main.OrderMain;
import com.shopping.cart.main.PaymentMain;
import com.shopping.cart.main.ProductLineMain;
import com.shopping.cart.main.ProductMain;

@SpringBootApplication
public class ShoppingCartProjectApplication implements CommandLineRunner {
	
	@Autowired
	private ProductMain productMain;
	
	@Autowired
	private ProductLineMain productLineMain;
	
	@Autowired
	private OrderDetailMain orderDetailMain;
	
	@Autowired
	private OrderMain orderMain;
	
	@Autowired
	private PaymentMain paymentMain;
	
	@Autowired
	private CustomerMain customerMain;
	
	@Autowired
	private EmployeeMain employeeMain;
	
	@Autowired
	private OfficeMain officeMain;

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartProjectApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("\n\n------------------ProductLine Entity--------------\n");
		productLineMain.productLineRun();
		
		System.out.println("\n\n------------------Product Entity------------------\n");
		productMain.productRun();

		System.out.println("\n\n------------------Product Entity------------------\n");
		orderDetailMain.oderDetailRun();
		
		System.out.println("\n\n------------------Product Entity------------------\n");
		orderMain.orderRun();
		
		System.out.println("\n\n------------------Payment Entity------------------\n");
		paymentMain.paymentRun();
		
		System.out.println("\n\n------------------Customer Entity------------------\n");
		customerMain.customerRun();
		
		System.out.println("\n\n------------------Employee Entity------------------\n");
		employeeMain.employeeRun();
		
		System.out.println("\n\n------------------Office Entity------------------\n");
		officeMain.officeRun();

	}

}
