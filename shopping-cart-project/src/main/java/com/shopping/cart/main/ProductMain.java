package com.shopping.cart.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shopping.cart.controller.ProductController;
import com.shopping.cart.exception.ProductNotFoundException;
import com.shopping.cart.model.Product;

@Controller
public class ProductMain {
	@Autowired
	private ProductController productController;
	
	public void productRun() {
		System.out.println("\n Product Entity records :");
		addProducts(createProducts());
	}

	//method to add Product
	private void addProducts(List<Product> products) {
		for(Product product : products) {
			try {
				productController.addProduct(product);
			} 
			catch (ProductNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//method to create List of Product
	private List<Product> createProducts(){
		List<Product> products = new ArrayList<Product>();
		
		Product p1 = new  Product(" Allen Solly Formal Shirts",null, "Winter wear collection"
		 		+ "at Allen Solly", "Amazon","Allen Solly",15L,
		 		2600.04,2600.04, null);
		 
		Product p2 = new Product("HRX Sports", null, "the scale down of"
			 		+ " end of seasons", "flipkart", "HRX", 50L, 500.0, 5025.01, null);
			 
		Product p3 = new Product("Apple", null, "Apple becomes world famous for"
			 		+ " iPhones", "Amazon", " iphones is best features phone",
			 		15L, 60000.0, 170000.0, null);
			 
		Product p4 = new Product("HRX Shoes", null, "Free Size", "Amazon", "HRX shoes is"
			 		+ " best for sports", 156L, 2600.08, 3523.00, null);
			
		Product p5 = new Product("Apple MacBook", null, "MacBook", "Amazon", "MacBook is"
			 		+ " well known for works", 60L, 1000.08, 266600.08, null);
			
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
	

		return products;
	}

}
