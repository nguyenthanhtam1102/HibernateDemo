package org.example.repositories;

import org.example.models.ShippingAddress;
import org.springframework.stereotype.Repository;

@Repository
public class ShippingAddressRepository extends GenericRepository<ShippingAddress, Integer> {
}
