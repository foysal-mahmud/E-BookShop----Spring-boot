package com.eCommerce.service;

import com.eCommerce.domain.UserShipping;

public interface UserShippingService {
	UserShipping findById(Long id);
	
	void deleteById(Long id);
}
