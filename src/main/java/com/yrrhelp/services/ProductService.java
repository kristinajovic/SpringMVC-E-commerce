package com.yrrhelp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.boot.autoconfigure.web.ResourceProperties.Strategy;
import org.springframework.stereotype.Service;

import com.yrrhelp.models.Product;

@Service
public class ProductService {

	
	public List<Product> getAllProducts() {
		
		ArrayList<Product> listOfProducts=new ArrayList<Product>();
		listOfProducts.add(new Product("123", "IPHONE X", "This is awsome Iphone", 400.4, "Apple"));
		listOfProducts.add(new Product("124", "Samsung X", "This is awsome Samsung", 300.4, "Samsung"));
		listOfProducts.add(new Product("125", "LG Z", "This is awsome LG", 300.4, "LG Inc"));

		return listOfProducts;
	}
	public Product getProductById(String id) {
		Predicate<Product> byId=p->p.getId().equals(id);
		
		return filterProducts(byId);
	}
	
	
	public Product filterProducts(Predicate<Product> startegy) {
		
		return getAllProducts().stream().filter(startegy).findFirst().orElse(null);
	}
	
}