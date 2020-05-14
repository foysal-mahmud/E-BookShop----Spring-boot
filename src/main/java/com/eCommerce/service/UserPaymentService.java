package com.eCommerce.service;

import com.eCommerce.domain.UserPayment;

public interface UserPaymentService {
	UserPayment findById(Long id);
	
	void deteteById(Long id);
}
