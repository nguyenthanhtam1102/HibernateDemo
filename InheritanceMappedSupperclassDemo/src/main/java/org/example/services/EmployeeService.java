package org.example.services;

import org.example.models.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

    Employee save(Employee employee);
    Employee findById(int id);

}
