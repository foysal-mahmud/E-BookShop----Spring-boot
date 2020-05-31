package com.eCommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.eCommerce.domain.BookToCartItem;
import com.eCommerce.domain.CartItem;

@Transactional
public interface BookToCartItemRepository extends CrudRepository<BookToCartItem, Long> {
	
	void deleteByCartItem(CartItem cartItem);

}
