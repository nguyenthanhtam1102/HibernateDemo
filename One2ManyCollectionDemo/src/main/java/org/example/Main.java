package org.example;

import org.example.configs.AppConfig;
import org.example.models.Product;
import org.example.services.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean(ProductService.class);

        Product product = new Product(
                "Product Name",
                Arrays.asList("Image1", "Image2", "Image3")
        );

        product = productService.save(product);

        product = productService.findById(product.getId());

        System.out.println(product);
    }
}