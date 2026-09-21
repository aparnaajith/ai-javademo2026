package com.productapp.model;

import com.productapp.exception.ProductNotFoundException;

public interface IProductService {
	Product[] getAllProducts();
	Product getbyId(int productId) throws ProductNotFoundException ;
	Product[] getByBrand(String brand) throws ProductNotFoundException ;
	

}
