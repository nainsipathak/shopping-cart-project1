package com.shopping.cart.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shopping.cart.controller.OrderDetailController;
import com.shopping.cart.exception.OrderDetailNotFoundException;
import com.shopping.cart.model.OrderDetail;

@Controller
public class OrderDetailMain {

	@Autowired
	private OrderDetailController orderDetailController;
	
	public void oderDetailRun() {
		System.out.println("\n OrderDetail Entity records :");
		addOrderDetails(createOrderDetails());
	}

	//method to add OrderDetail
	private void addOrderDetails(List<OrderDetail> orderDetails) {
		for(OrderDetail orderDetail : orderDetails) {
			try {
				orderDetailController.addOrderDetails(orderDetail);
			} 
			catch (OrderDetailNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//method to create List of OrderDetail
	private List<OrderDetail> createOrderDetails(){
		List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();
		
		OrderDetail od1 = new OrderDetail(11, 2600.04,  1, null, null);
		OrderDetail od2 = new OrderDetail(30,  155.00,  2, null, null);
		OrderDetail od3 = new OrderDetail(20,  3523.00, 3, null, null);
		OrderDetail od4 = new OrderDetail(80,  5025.01,   4, null, null);
		OrderDetail od5 = new OrderDetail(19,  500.00, 9, null, null);
		OrderDetail od6 = new OrderDetail(15,  60000.0,7, null, null);
		OrderDetail od7 = new OrderDetail(10,  170000.00,  5, null, null);
		OrderDetail od8 = new OrderDetail(90, 266600.08, 8, null, null);
	
		orderDetails.add(od1);
		orderDetails.add(od2);
		orderDetails.add(od3);
		orderDetails.add(od4);
		orderDetails.add(od5);
		orderDetails.add(od6);
		orderDetails.add(od7);
		orderDetails.add(od8);
		
		return orderDetails;
	}

}
