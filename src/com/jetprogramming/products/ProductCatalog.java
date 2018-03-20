package com.jetprogramming.products;

import java.util.List;

import javax.jws.WebService;

import com.jetprogramming.products.business.Product;
import com.jetprogramming.products.business.ProductServiceImpl;

@WebService(endpointInterface = "com.jetprogramming.products.IProductCatalog")
public class ProductCatalog implements IProductCatalog {

	ProductServiceImpl productService = new ProductServiceImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jetprogramming.products.IProductCatalog#getProducts()
	 */
	@Override
	public List<String> getProducts() {
		return productService.getProducts();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jetprogramming.products.IProductCatalog#getCatalog()
	 */
	@Override
	public List<String> getCatalog() {
		return productService.getProducts();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jetprogramming.products.IProductCatalog#getProductsComplex()
	 */
	@Override
	public List<Product> getProductsComplex() {
		return productService.getProductsComplex();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jetprogramming.products.IProductCatalog#getProductsVy(java.lang.
	 * String)
	 */
	@Override
	public List<String> getProductsVy(String product) {
		return productService.getProducts();
	}

}