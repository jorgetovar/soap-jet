package com.jetprogramming.products;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IShopInfo {

	@WebMethod
	int calculate(int x);

}