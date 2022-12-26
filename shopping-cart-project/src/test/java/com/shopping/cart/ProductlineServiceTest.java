package com.shopping.cart;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.shopping.cart.model.ProductLine;
import com.shopping.cart.repository.ProductLineRepository;
import com.shopping.cart.service.ProductLineService;

@SpringBootTest
public class ProductlineServiceTest {

	@Autowired
	private ProductLineService productLineService;
	
	@MockBean
	private ProductLineRepository productLineRepository;
	
	@Test
	public void getAllProductlinesTest() {
		ProductLine productLine = new ProductLine();
		
		productLine.setProductLine(1L);
		productLine.setTextDescription("Tanishq is known for the world best ethnic wear for all occassions are available in different prices");
		productLine.setHtmlDescription("<ol><li> Tanishq is famous for jewelleries </li></ol>");
		productLine.setImage("jewell.img");
		
		Mockito.when(productLineRepository.save(productLine)).
		thenReturn(productLine);
		assertThat(productLineService.getAllProductlines()).
		isNotNull();	
	}
	
	@Test
	public void getProductLineByIdTest() {
		ProductLine productLine = new ProductLine();
		
		productLine.setProductLine(1L);
		productLine.setTextDescription("Tanishq is known for the world best ethnic wear for all occassions are available in different prices");
		productLine.setHtmlDescription("<ol><li> Tanishq is famous for jewelleries </li></ol>");
		productLine.setImage("jewell.img");
		
		Mockito.when(productLineRepository.save(productLine)).
		thenReturn(productLine);
		assertThat(productLineService.getProductLineById(1L)).
		isNotNull();	
	}
	
	@Test
	public void addProductLineTest() {
		ProductLine productLine = new ProductLine();
		
		productLine.setProductLine(1L);
		productLine.setTextDescription("Tanishq is known for the world best ethnic wear for all occassions are available in different prices");
		productLine.setHtmlDescription("<ol><li> Tanishq is famous for jewelleries </li></ol>");
		productLine.setImage("jewell.img");
		
		Mockito.when(productLineRepository.save(productLine)).
		thenReturn(productLine);
		assertThat(productLineService.addProductLine(productLine)).
		isEqualTo(productLine);	
	}
	
	@Test
	public void deleteProductLineTest() {
		ProductLine productLine = new ProductLine();
		
		productLine.setProductLine(1L);
		productLine.setTextDescription("Tanishq is known for the world best ethnic wear for all occassions are available in different prices");
		productLine.setHtmlDescription("<ol><li> Tanishq is famous for jewelleries </li></ol>");
		productLine.setImage("jewell.img");
		
		Mockito.when(productLineRepository.save(productLine)).
		thenReturn(productLine);
		productLineService.deleteProductLine(1L);
		assertThat(productLineService.getProductLineById(1L)).
		isEmpty();	
	}
	
	@Test
	public void updateProductLineTest() {
		ProductLine productLine = new ProductLine();
		
		productLine.setProductLine(1L);
		productLine.setTextDescription("Tanishq is known for the world best ethnic wear for all occassions are available in different prices");
		productLine.setHtmlDescription("<ol><li> Tanishq is famous for jewelleries </li></ol>");
		productLine.setImage("jewell.img");
		
		Mockito.when(productLineRepository.save(productLine)).
		thenReturn(productLine);
		productLineService.updateProductLine(productLine, 2L);
		assertThat(productLineService.getProductLineById(1L)).
		isEmpty();	
	}

	@Test
	public void getProductLineDetailSortedByTextTest() {
		ProductLine productLine = new ProductLine();
		
		productLine.setProductLine(1L);
		productLine.setTextDescription("Tanishq is known for the world best ethnic wear for all occassions are available in different prices");
		productLine.setHtmlDescription("<ol><li> Tanishq is famous for jewelleries </li></ol>");
		productLine.setImage("jewell.img");
		
		Mockito.when(productLineRepository.save(productLine)).
		thenReturn(productLine);
		assertThat(productLineService.getProductLineDetailSortedByText()).
		isNotNull();	
	}
	
	@Test
	public void getProductLineSortedByHtmlTextUsingNativeTest() {
		ProductLine productLine = new ProductLine();
		
		productLine.setProductLine(1L);
		productLine.setTextDescription("Tanishq is known for the world best ethnic wear for all occassions are available in different prices");
		productLine.setHtmlDescription("<ol><li> Tanishq is famous for jewelleries </li></ol>");
		productLine.setImage("jewell.img");
		
		Mockito.when(productLineRepository.save(productLine)).
		thenReturn(productLine);
		assertThat(productLineService.getProductLineSortedByHtmlTextUsingNative()).
		isNotNull();	
	}
	
	@Test
	public void getProductLineByImageSrcTest() {
		ProductLine productLine = new ProductLine();
		
		productLine.setProductLine(1L);
		productLine.setTextDescription("Tanishq is known for the world best ethnic wear for all occassions are available in different prices");
		productLine.setHtmlDescription("<ol><li> Tanishq is famous for jewelleries </li></ol>");
		
		Mockito.when(productLineRepository.save(productLine)).
		thenReturn(productLine);
		assertThat(productLineService.getProductLineByImageSrc("jewell.img")).
		isNull();	
	}
	
	@Test
	public void getProductLinesUsingPagingTest() {
		ProductLine productLine = new ProductLine();
		
		productLine.setProductLine(1L);
		productLine.setTextDescription("Tanishq is known for the world best ethnic wear for all occassions are available in different prices");
		productLine.setHtmlDescription("<ol><li> Tanishq is famous for jewelleries </li></ol>");
		productLine.setImage("jewell.img");
		
		Mockito.when(productLineRepository.save(productLine)).
		thenReturn(productLine);
		assertThat(productLineService.getProductLinesUsingPaging()).
		isNotNull();	
	}

	@Test
	public void getSortProductLinesUsingSortingTest() {
		ProductLine productLine = new ProductLine();
		
		productLine.setProductLine(1L);
		productLine.setTextDescription("Tanishq is known for the world best jewellery for all occassions are available in different prices");
		productLine.setHtmlDescription("<ol><li> Tanishq is famous for jewelleries</li></ol>");
		productLine.setImage("jewell.img");
		
		Mockito.when(productLineRepository.save(productLine)).
		thenReturn(productLine);
		assertThat(productLineService.getSortProductLinesUsingSorting()).
		isNotNull();	
	}
}
