package com.eCommerce.service;

import java.util.List;

import com.eCommerce.domain.Book;
import com.eCommerce.domain.CartItem;
import com.eCommerce.domain.Order;
import com.eCommerce.domain.ShoppingCart;
import com.eCommerce.domain.User;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	CartItem updateCartItem(CartItem cartItem);
	
	CartItem addBookToCartItem(Book book, User user, int qty);
	
	CartItem findById(Long id);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem save(CartItem cartItem);
	
	List<CartItem> findByOrder(Order order);
}
