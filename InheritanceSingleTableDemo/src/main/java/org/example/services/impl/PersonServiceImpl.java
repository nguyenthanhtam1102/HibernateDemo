package org.example.services.impl;

import org.example.models.Person;
import org.example.repositories.PersonRepository;
import org.example.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person findById(int id) {
        return personRepository.findById(id);
    }

    @Override
    public List<Person> findByDepartment(String department) {
        return personRepository.findByDepartment(department);
    }

    @Override
    public List<Person> findByShippingAddress(String shippingAddress) {
        return personRepository.findByShippingAddress(shippingAddress);
    }
}
