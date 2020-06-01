package com.eCommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eCommerce.domain.UserPayment;
import com.eCommerce.repository.UserPaymentRepository;
import com.eCommerce.service.UserPaymentService;


@Service
public class UserPaymentServiceImpl implements UserPaymentService{

	@Autowired
	private UserPaymentRepository userPaymentRepository;
		
	public UserPayment findById(Long id) {
		return userPaymentRepository.findById(id).orElse(null);
	}
	
	public void deleteById(Long id) {
		userPaymentRepository.deleteById(id);
	}
} 
