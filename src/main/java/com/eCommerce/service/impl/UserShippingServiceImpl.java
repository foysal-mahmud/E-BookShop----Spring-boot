package com.eCommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eCommerce.domain.UserShipping;
import com.eCommerce.repository.UserShippingRepository;
import com.eCommerce.service.UserShippingService;

@Service
public class UserShippingServiceImpl implements UserShippingService{
	
	@Autowired
	private UserShippingRepository userShippingRepository;
	
	
	public UserShipping findById(Long id) {
		return userShippingRepository.findById(id).orElse(null);
	}
	
	public void deleteById(Long id) {
		userShippingRepository.deleteById(id);
	}

}
