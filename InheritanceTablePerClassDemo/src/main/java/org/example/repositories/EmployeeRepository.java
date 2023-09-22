package org.example.repositories;

import org.example.models.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository extends GenericRepository<Employee, Integer>{
}
