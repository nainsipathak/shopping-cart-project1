package com.shopping.cart.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shopping.cart.controller.OfficeController;
import com.shopping.cart.exception.OfficeNotFoundException;
import com.shopping.cart.model.Office;

@Controller
public class OfficeMain {
	
	@Autowired
	private OfficeController officeController;

	public void officeRun() {
		System.out.println("\n Office Entity records :");
		addOffices(createOffices());
	}

	//method to add Office
	private void addOffices(List<Office> offices) {
		for(Office office : offices) {
			try {
				officeController.addOffice(office);
			} 
			catch (OfficeNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//method to create List of Office
	private List<Office> createOffices(){
		List<Office> offices = new ArrayList<Office>();
		
		Office of1 = new Office("Bengaluru", "8041774001", "Challaghatta Bengaluru", "Marathahalli Bengaluru",
				"Karnataka", "India", "560037", "Local Area", null);
		
		Office of2 = new Office("Delhi", "8877200323", "Vikram Nagar Delhi", "Saidabad Delhi",
				"Delhi", "India", "110044", "Govt Area", null);
		
		Office of3 = new Office("Hyderbad", "4066926000", "HITEC City", "Hyderbad",
				"Telangana", "India", "500086", "PVT Area", null);
	
		offices.add(of1);
		offices.add(of2);
		offices.add(of3);
		
		return offices;
	}

}
