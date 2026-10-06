package com.restaurantapp.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.restaurantapp.model.Restaurant;

public interface IRestaurantDao {
	//CRUD operation
		void addRestaurant(Restaurant restaurant);
		void updateRestaurant(int restaurantId,double cost);
		Restaurant findById(int restaurantId);
		void deleteRestaurant(int restaurantId);
		
		List<Restaurant> findAllRestaurants();
		//find by cuisine, lessercost
		List<Restaurant> findByCuisineLesserCost(String cuisine,double cost);
		//find by type,lessercost
		List<Restaurant> findByTypeLesserCost(String type,double cost);
	    //find the restaurants by closing Time
		List<Restaurant> findByTime(LocalDateTime availabilityTime);
		//find by type,high ratings
		List<Restaurant> findByRatingsAndType(String type,int ratings);
		//find by city
		List<Restaurant> findByCity(String city);
}
