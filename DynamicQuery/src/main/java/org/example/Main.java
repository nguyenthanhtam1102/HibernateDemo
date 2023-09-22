package org.example;

import org.example.configs.AppConfig;
import org.example.models.Product;
import org.example.services.OrderDetailService;
import org.example.services.OrderService;
import org.example.services.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean(ProductService.class);

        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");
        Product product3 = new Product("Product3");

        product1 = productService.save(product1);
        product2 = productService.save(product2);
        product3 = productService.save(product3);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        Thread thread = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                try {
                    List<Product> productList = productService.findProducts();
                    System.out.println(productList);

                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();
    }
}