package com.jetprogramming.products;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.jetprogramming.products.business.ProductServiceImpl;

@WebService(name = "Catalog", portName = "CatalogPort", serviceName = "CatalogService"
		, targetNamespace = "com.jetprogramming")
public class ProductCatalog {

	ProductServiceImpl productService = new ProductServiceImpl();

	@WebMethod
	public List<String> getProducts() {
		return productService.getProducts();
	}

	@WebMethod
	public List<String> getProductsVy(String product) {
		return productService.getProducts();
	}

}
