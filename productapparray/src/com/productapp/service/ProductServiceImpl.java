package com.productapp.service;

import com.productapp.model.IProductService;
import com.productapp.model.Product;

public class ProductServiceImpl implements IProductService {

	@Override
	public Product[] getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getbyId(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product[] getByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	Product[] showProducts() {

		Product[] products = new Product[] { new Product("Mobile", 20000, 1, "Samsung"),
				new Product("Television", 20000, 2, "Samsung"),
				new Product("Pen", 200, 1, "Classmate"), 
				new Product("Mobile", 20000, 1, "Samsung") };
		return products;
	}

}
