package org.example.app;

import org.example.configs.AppConfig;
import org.example.models.Order;
import org.example.models.OrderId;
import org.example.models.OrderStatus;
import org.example.services.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.UUID;

public class TestIdClassAutoGenerate {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService = context.getBean(OrderService.class);

        Order order = new Order(OrderStatus.WAITING_CONFIRMATION);
        order = orderService.save(order);

        Order order1 = new Order(OrderStatus.COMPLETED);
        order1 = orderService.save(order1);

        System.out.println(order);
        System.out.println(order1);

        System.out.println("Find Result:");
        Order findResult = orderService.findById(new OrderId(order.getId(), order.getId2()));
        System.out.println(findResult);
    }

}
