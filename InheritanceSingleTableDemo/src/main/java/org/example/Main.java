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

//        Person findResult = personService.findById(customer.getId());
//        Person findResult = customerService.findById(customer.getId());

//        List<Person> findResult = personService.findByDepartment("Development");
//        System.out.println(findResult);
//        findResult.forEach(item -> System.out.println(item.getFullName()));

//        List<Person> findResults = personService.findByShippingAddress("Ho Chi Minh");
//        System.out.println(findResults);
    }
}