package com.productapp.service;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.IProductService;
import com.productapp.model.Product;

public class ProductServiceImpl implements IProductService {

	@Override
	public Product[] getAllProducts() {
		return showProducts();
		
	}

	@Override
	public Product getbyId(int productId) throws ProductNotFoundException {
		//get the products
		Product[] products=showProducts();
		//iterate through the array
		for(Product product:products) {
		//check if the product with this id exist
			if(product.getProductId()==productId)
				//return the product
		            return product;
	}
	//if not available throw exception
	throw new ProductNotFoundException("invalid id");
}
	@Override
	public Product[] getByBrand(String brand) throws ProductNotFoundException {
		//get the products
		Product[] products=showProducts();
		//initialize product count
		int count=0;
		//iterate through the array
		for(Product product:products) {
		//check if the product with this id exist
			if(product.getBrand().equals(brand))
				//increase the count
				count++;}
		
		//create a temporary array
		Product[] productsByBrand=new Product[count];
		int index =0;
		//iterate through the main array
		for(Product product:products) {
			//check if the brand is same in each element
			if(product.getBrand().equals(brand)) {
			//assign the value to temp array
			productsByBrand[index]=product;
			index++;
			}
		}
		
		//if the length is0 throw exception
		if(productsByBrand.length==0)
			throw new ProductNotFoundException("product with this brand not available");
		return productsByBrand;
	}

	private Product[] showProducts() {

		Product[] products = new Product[] { new Product("Mobile", 20000, 1, "Samsung"),
				new Product("Television", 20000, 2, "Samsung"),
				new Product("Pen", 200, 1, "Classmate"), 
				new Product("Mobile", 20000, 1, "Samsung") };
		return products;
	}

}
