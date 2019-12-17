package com.zackstore.zackapi;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController

public class ZStoreController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to ZSTORE!";
	}

	@RequestMapping("/products")
	public List<Product> getAllProducts() {

		return productService.getAllProducts();
	}

	
	@RequestMapping("/products/{id}")
	public Product getProduct(@PathVariable int id) {	
		System.out.println("getProduct "+id);
		return productService.getProduct(id);
	}

	
	@RequestMapping(method = RequestMethod.POST, value= "/products" )
	public void addToCart(@RequestBody Product prod) {
		
		productService.addProdToCart(prod);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value= "/products/{id}" )
	public void deleteFromCart(@PathVariable int id) {		 

		productService.removeProdFromCart(id);
	}

	

	@RequestMapping("/products/cart")
	public List<Product> getContentCart() {
		return productService.contentCartList();
	}

}
