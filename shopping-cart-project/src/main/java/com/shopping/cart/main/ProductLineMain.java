package com.shopping.cart.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shopping.cart.controller.ProductLineController;
import com.shopping.cart.exception.ProductLineNotFoundException;
import com.shopping.cart.model.ProductLine;

@Controller
public class ProductLineMain {
	
	@Autowired
	private ProductLineController productLineController;
	
	public void productLineRun() throws NumberFormatException, IOException {
		System.out.println("\n ProductLine Entity records :");
		addProductLines(createProductLines());
	}

	//method to add ProductLine
	private void addProductLines(List<ProductLine> productLines) {
		for(ProductLine productLine : productLines) {
			try {
				productLineController.addProductLine(productLine);
			} 
			catch (ProductLineNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//method to create List of ProductLine
	private List<ProductLine> createProductLines(){
		List<ProductLine> productLines = new ArrayList<ProductLine>();
		
		ProductLine pl1 = new ProductLine("Allen Solly is a rand inspring the birth of"
				+ " an entirely new consumer class. Allen solly is a clothing brand,"
				+ " A quintessential British Brand.",
				"<ol>"
				+ "<li>Allen Solly's products are casuals, formals,"
				+ " Shirts and Blazers.</li>"
				+ "</ol>","F:\\Allen-Solly-Logo.jpg",null);
		
		ProductLine pl2 = new ProductLine("HRX by Hrithik Roshan ,Launched in 2013"
				+ " The brand launched first on Myntra.com,in november 2013 with their"
				+ " menswear range of athlesisure clothing. ",
				"<ol>"
				+ "<li>HRX inventry very good quality products like Tshirts, shoes"
				+ " sportss wear, shoes.</li>"
				+ "</ol>","F:\\HRX.jpg",null);
		
		ProductLine pl3 = new ProductLine("Apple Inc. is an American multinational technology company that"
				+ " develops, Many gadgets for work, game, and provides services"
				+ " Their products are MacBook,iPad,iPhones.",
				"<ol>"
				+"<li>Apple is a provider of desktop personal computers, software, and "
				+ "iPad.</li>"
				+"</ol>", "F:\\Apple.jpg", null);
		
		productLines.add(pl1);
		productLines.add(pl2);
		productLines.add(pl3);
		
		return productLines;
	}
}
