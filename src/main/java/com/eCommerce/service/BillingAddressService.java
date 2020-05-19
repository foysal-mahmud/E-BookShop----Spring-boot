package com.eCommerce.service;

import com.eCommerce.domain.BillingAddress;
import com.eCommerce.domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
