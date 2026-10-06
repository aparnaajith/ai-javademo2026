package com.restaurantapp.model;

public enum Cuisine {

	SI("SOUTH INDIAN"),//new Employee("Sri Priya")
	NI("NORTH INDIAN"),
	IT("ITALIAN"),
	CH("CHINESE"),
	CO("CONTINENTAL");//similar to nw Employee("Sri");
	private String cuisineType;//similar to instance variable
	//similar to para constructor of claa 
	private Cuisine(String type) {
		this.cuisineType=type;
	}
	//create a public method to access the type
	public String getCuisineType() {
		return cuisineType;
	}

}
