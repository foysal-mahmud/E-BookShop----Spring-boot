package com.eCommerce.service;

import com.eCommerce.domain.ShippingAddress;
import com.eCommerce.domain.UserShipping;

public interface ShippingAddressService {
	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
