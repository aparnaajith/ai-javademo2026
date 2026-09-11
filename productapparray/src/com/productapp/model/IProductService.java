package com.productapp.model;

public interface IProductService {
	Product[] getAllProducts();
	Product getbyId(int productId);
	Product[] getByBrand(String brand);
	

}
