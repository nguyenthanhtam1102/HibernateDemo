package org.example.services.impl;

import org.example.models.ShippingAddress;
import org.example.repositories.ShippingAddressRepository;
import org.example.services.ShippingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShippingAddressServiceImpl implements ShippingAddressService {

    private ShippingAddressRepository shippingAddressRepository;

    @Autowired
    public ShippingAddressServiceImpl(ShippingAddressRepository shippingAddressRepository) {
        this.shippingAddressRepository = shippingAddressRepository;
    }

    @Override
    public ShippingAddress save(ShippingAddress shippingAddress) {
        return shippingAddressRepository.save(shippingAddress);
    }
}
