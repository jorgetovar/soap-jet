package com.jetprogramming.products;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.jetprogramming.products.business.Product;

@WebService(name = "Catalog", portName = "CatalogPort", serviceName = "CatalogService", targetNamespace = "com.jetprogramming")
// @SOAPBinding(style=Style.RPC)
public interface IProductCatalog {

	@WebMethod
	List<String> getProducts();

	@WebMethod(action = "fetch_catalog", operationName = "getCatalog")
	List<String> getCatalog();

	@WebMethod
	List<Product> getProductsComplex();

	@WebMethod
	List<String> getProductsVy(String product);

}