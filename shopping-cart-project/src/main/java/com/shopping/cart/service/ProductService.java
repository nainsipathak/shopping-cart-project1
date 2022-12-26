package com.shopping.cart.service;

import java.util.List;
import java.util.Optional;

import com.shopping.cart.model.Product;

public interface ProductService {

	public List<Product> getAllProducts();
	
	public Optional<Product> getProductById(Long id);
	
	public Product addProduct(Product product);
	
	public void deleteProduct(Long pid);
	
	public void updateProduct(Product product, Long productId);
	
	public List<Product> getProductSortedByName();
	
	public List<Product> getProductSortedByMsrpUsingNative();
	
	public List<Product> getProductByName(String productName);
	
	public List<Product> getProductsUsingPaging();
	
	public Iterable<Product> sortProductsUsingSorting();
}
