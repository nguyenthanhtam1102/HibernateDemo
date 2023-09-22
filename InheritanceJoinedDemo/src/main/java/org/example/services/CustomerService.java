package org.example.services;

import org.example.models.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    Customer save(Customer customer);
    Customer findById(int id);
    List<Customer> findByShippingAddress(String shippingAddress);


}
