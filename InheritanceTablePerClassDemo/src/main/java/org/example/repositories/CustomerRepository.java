package org.example.repositories;

import org.example.models.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository extends GenericRepository<Customer, Integer>{
}
