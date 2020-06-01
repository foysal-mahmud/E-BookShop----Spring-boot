package com.eCommerce.service;

import com.eCommerce.domain.Payment;
import com.eCommerce.domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
