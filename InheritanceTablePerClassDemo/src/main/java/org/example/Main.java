package org.example;

import org.example.configs.AppConfig;
import org.example.models.Customer;
import org.example.models.Employee;
import org.example.models.Person;
import org.example.services.CustomerService;
import org.example.services.EmployeeService;
import org.example.services.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService employeeService = context.getBean(EmployeeService.class);
        CustomerService customerService = context.getBean(CustomerService.class);
        PersonService personService = context.getBean(PersonService.class);

        Person employee = Employee.builder()
                .fullName("Nguyen Thanh Tam")
                .phone("1234567890")
                .department("Development")
                .build();

        Person customer = Customer.builder()
                .fullName("Nguyen Van A")
                .phone("0987654321")
                .shippingAddress("Ho Chi Minh")
                .build();

        employee = personService.save(employee);
        customer = personService.save(customer);

        System.out.println(employee);
        System.out.println(customer);

//        Person findResult1 = personService.findById(employee.getId());
//        Person findResult2 = personService.findById(customer.getId());
//
//        System.out.println(findResult1);
//        System.out.println(findResult2);

//        Person findResult1 = employeeService.findById(employee.getId());
//        Person findResult2 = customerService.findById(customer.getId());
//
//        System.out.println(findResult1);
//        System.out.println(findResult2);
    }
}