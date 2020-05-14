package com.eCommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.eCommerce.domain.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long>{

}
