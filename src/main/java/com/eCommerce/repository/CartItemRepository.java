package com.eCommerce.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.eCommerce.domain.CartItem;
import com.eCommerce.domain.Order;
import com.eCommerce.domain.ShoppingCart;


public interface CartItemRepository extends CrudRepository<CartItem, Long>{
	
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	List<CartItem> findByOrder(Order order);
}
