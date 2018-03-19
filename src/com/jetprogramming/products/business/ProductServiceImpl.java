package com.jetprogramming.products.business;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl {

	public List<String> getProducts() {
		return getFromDb();
	}

	public List<String> getProducts(String product) {
		return getFromDb().stream().filter(e -> e.equals(product)).collect(Collectors.toList());
	}

	public List<String> getFromDb() {
		List<String> test = new ArrayList<>();
		test.add("soap");
		test.add("ws");
		return test;
	}

}
