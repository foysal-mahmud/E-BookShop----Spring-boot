package com.eCommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.eCommerce.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
