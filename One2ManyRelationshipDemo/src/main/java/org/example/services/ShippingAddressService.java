package org.example.services;

import org.example.models.ShippingAddress;
import org.springframework.stereotype.Service;

@Service
public interface ShippingAddressService {

    ShippingAddress save(ShippingAddress shippingAddress);

}
