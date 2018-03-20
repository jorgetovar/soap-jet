package com.jetprogramming.products;

import javax.jws.WebService;

@WebService(endpointInterface="com.jetprogramming.products.IShopInfo")
public class ShopInfo implements IShopInfo {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jetprogramming.products.IShopInfo#calculate(int)
	 */
	@Override
	public int calculate(int x) {
		return x * 2;
	}
}
