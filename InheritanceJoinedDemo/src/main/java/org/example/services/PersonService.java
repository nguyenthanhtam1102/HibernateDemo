package org.example.services;

import org.example.models.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {

    Person save(Person person);
    Person findById(int id);
    List<Person> findByDepartment(String department);
    List<Person> findByShippingAddress(String shippingAddress);

}
