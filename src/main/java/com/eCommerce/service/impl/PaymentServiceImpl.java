package com.eCommerce.service.impl;

import org.springframework.stereotype.Service;

import com.eCommerce.domain.Payment;
import com.eCommerce.domain.UserPayment;
import com.eCommerce.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	public Payment setByUserPayment(UserPayment userPayment, Payment payment) {
		
		payment.setType(userPayment.getType());
		payment.setHolderName(userPayment.getHolderName());
		payment.setCardNumber(userPayment.getCardNumber());
		payment.setExpiryMonth(userPayment.getExpiryMonth());
		payment.setExpiryYear(userPayment.getExpiryYear());
		payment.setCvc(userPayment.getCvc());
		
		return payment;
	}

}
