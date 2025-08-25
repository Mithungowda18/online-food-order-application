package orderapp.Online_Food_Order_Application.service;

import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;

import orderapp.Online_Food_Order_Application.entity.Food;
import orderapp.Online_Food_Order_Application.entity.Order;
import orderapp.Online_Food_Order_Application.entity.Restaurant;

public interface RestaurantService {

	Restaurant createRestaurant(Restaurant restaurant);
	
	Restaurant getById(Integer id);
	
	Page<?> getAllRestaurant(int pageNum, int pageSize, String sortBy);
	
	Restaurant updateRestaurant(Integer id,Restaurant restaurant);
	
	void deleteRestaurant(Integer id);
	
	Restaurant assignFood(Integer restaurantId, Set<Integer> foodId);
	
	List<Food> findFoodByRestaurantId(Integer restaurantId);
	
	List<Order> findOrdersByRestaurantId(Integer restaurantId);
	
	
	
}
