package com.eCommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.eCommerce.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
