package com.zackstore.zackapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class ProductService {

	private   static List<Product> productsList = new ArrayList<Product>();
	private   List<Product> shopCartList = new ArrayList<Product>();

	public static void addProToList(Product prod) {

		productsList.add(prod);
	}

	public List<Product> getAllProducts() {		

		return  productsList;
	}

	public  List<Product> detailsOfProduct(int id) {

		List<Product> detailsProd = new ArrayList<Product>();

		for (Product prod : productsList) {

			if (prod.getId() == id) {

				detailsProd.add(prod);

				return detailsProd;
			}
		}

		return null;
	}

	public  Product getProduct(int id) {

		return productsList.stream().filter(p -> p.getId() == id).findFirst().get();		
	}

	public  void addProdToCart(Product prod) {		

		shopCartList.add(getProduct(prod.getId()));	
	}

	public  void removeProdFromCart(int id) {

		shopCartList.remove(getProduct(id));
	}

	public  List<Product> contentCartList() {		

		return  shopCartList;
	}

}
