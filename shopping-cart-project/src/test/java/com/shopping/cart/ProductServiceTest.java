package com.shopping.cart;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.shopping.cart.model.Product;
import com.shopping.cart.repository.ProductRepository;
import com.shopping.cart.service.ProductService;

@SpringBootTest
public class ProductServiceTest {

	@Autowired
	private ProductService productService;
	
	@MockBean
	private ProductRepository productRepository;
	
	@Test
	public void getAllProductsTest() {
		Product product = new Product();
		
		product.setProductCode(1L);
		product.setProductName("Mobile");
		product.setProductScale("Prism Black,128 GB");
		product.setProductVendor("Flipcart");
		product.setQuantityInStock(10L);
		product.setBuyPrice(16500.00);
		product.setMsrp(15500.06);
		
		Mockito.when(productRepository.save(product)).
		thenReturn(product);
		assertThat(productService.getAllProducts()).
		isNotNull();	
	}
	
	@Test
	public void getProductByIdTest() {
		Product product = new Product();
		
		product.setProductCode(1L);
		product.setProductName("realme 9i");
		product.setProductScale("Prism Black,128 GB");
		product.setProductVendor("Flipcart");
		product.setQuantityInStock(10L);
		product.setBuyPrice(16500.00);
		product.setMsrp(15500.06);
		
		Mockito.when(productRepository.save(product)).
		thenReturn(product);
		assertThat(productService.getProductById(1L)).
		isNotNull();	
	}

	@Test
	public void addProductTest() {
		Product product = new Product();
		
		product.setProductCode(1L);
		product.setProductName("realme 9i");
		product.setProductScale("Prism Black,128 GB");
		product.setProductVendor("Flipcart");
		product.setQuantityInStock(10L);
		product.setBuyPrice(16500.00);
		product.setMsrp(15500.06);
		
		Mockito.when(productRepository.save(product)).
		thenReturn(product);
		assertThat(productService.addProduct(product)).
		isEqualTo(product);
	}

	@Test
	public void deleteProductTest() {
		Product product = new Product();
		
		product.setProductCode(1L);
		product.setProductName("realme 9i");
		product.setProductScale("Prism Black,128 GB");
		product.setProductVendor("Flipcart");
		product.setQuantityInStock(10L);
		product.setBuyPrice(16500.00);
		product.setMsrp(15500.06);
		
		Mockito.when(productRepository.save(product)).
		thenReturn(product);
		productService.deleteProduct(1L);
		assertThat(productService.getProductById(1L)).
		isEmpty();	
	}
	
	@Test
	public void updateProductTest() {
		Product product = new Product();
		
		product.setProductCode(1L);
		product.setProductName("realme 9i");
		product.setProductScale("Prism Black,128 GB");
		product.setProductVendor("Flipcart");
		product.setQuantityInStock(10L);
		product.setBuyPrice(16500.00);
		product.setMsrp(15500.06);
		
		Mockito.when(productRepository.save(product)).
		thenReturn(product);
		productService.updateProduct(product, 2L);
		assertThat(productService.getProductById(1L)).
		isEmpty();	
	}
	
	@Test
	public void getProductSortedByNameTest() {
		Product product = new Product();
		
		product.setProductCode(1L);
		product.setProductName("realme 9i");
		product.setProductScale("Prism Black,128 GB");
		product.setProductVendor("Flipcart");
		product.setQuantityInStock(10L);
		product.setBuyPrice(16500.00);
		product.setMsrp(15500.06);
		
		Mockito.when(productRepository.save(product)).
		thenReturn(product);
		assertThat(productService.getProductSortedByName()).
		isNotNull();	
	}

	@Test
	public void getProductSortedByMsrpUsingNativeTest() {
		Product product = new Product();
		
		product.setProductCode(1L);
		product.setProductName("realme 9i");
		product.setProductScale("Prism Black,128 GB");
		product.setProductVendor("Flipcart");
		product.setQuantityInStock(10L);
		product.setBuyPrice(16500.00);
		product.setMsrp(15500.06);
		
		Mockito.when(productRepository.save(product)).
		thenReturn(product);
		assertThat(productService.getProductSortedByMsrpUsingNative()).
		isNotNull();	
	}

	@Test
	public void getProductByNameTest() {
		Product product = new Product();
		
		product.setProductCode(1L);
		product.setProductName("realme 9i");
		product.setProductScale("Prism Black,128 GB");
		product.setProductVendor("Flipcart");
		product.setQuantityInStock(10L);
		product.setBuyPrice(16500.00);
		product.setMsrp(15500.06);
		
		Mockito.when(productRepository.save(product)).
		thenReturn(product);
		assertThat(productService.getProductByName("Mobile")).
		isNotNull();	
	}

	@Test
	public void getProductsUsingPagingTest() {
		Product product = new Product();
		
		product.setProductCode(1L);
		product.setProductName("realme 9i");
		product.setProductScale("Prism Black,128 GB");
		product.setProductVendor("Flipcart");
		product.setQuantityInStock(10L);
		product.setBuyPrice(16500.00);
		product.setMsrp(15500.06);
		
		Mockito.when(productRepository.save(product)).
		thenReturn(product);
		assertThat(productService.getProductsUsingPaging()).
		isNotNull();	
	}
	
	@Test
	public void sortProductsUsingSortingTest() {
		Product product = new Product();
		
		product.setProductCode(1L);
		product.setProductName("realme 9i");
		product.setProductScale("Prism Black,128 GB");
		product.setProductVendor("Flipcart");
		product.setQuantityInStock(10L);
		product.setBuyPrice(16500.00);
		product.setMsrp(15500.06);
		
		Mockito.when(productRepository.save(product)).
		thenReturn(product);
		assertThat(productService.sortProductsUsingSorting()).
		isNotNull();	
	}

	
}
