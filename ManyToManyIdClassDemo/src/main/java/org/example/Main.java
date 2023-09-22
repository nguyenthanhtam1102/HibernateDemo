package org.example;

import org.example.configs.AppConfig;
import org.example.models.Order;
import org.example.models.OrderDetail;
import org.example.models.Product;
import org.example.services.OrderDetailService;
import org.example.services.OrderService;
import org.example.services.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean(ProductService.class);
        OrderService orderService = context.getBean(OrderService.class);
        OrderDetailService orderDetailService = context.getBean(OrderDetailService.class);

        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");
        Product product3 = new Product("Product3");

        product1 = productService.save(product1);
        product2 = productService.save(product2);
        product3 = productService.save(product3);

        Order order = new Order();
        order = orderService.save(order);

        OrderDetail orderDetail1 = new OrderDetail(order, product1, 1);
        OrderDetail orderDetail2 = new OrderDetail(order, product2, 2);

        orderDetail1 = orderDetailService.save(orderDetail1);
        orderDetail2 = orderDetailService.save(orderDetail2);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        System.out.println(order);

        System.out.println(orderDetail1);
        System.out.println(orderDetail2);
    }
}