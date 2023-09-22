package org.example;

import org.example.configs.AppConfig;
import org.example.models.Category;
import org.example.models.Product;
import org.example.services.CategoryService;
import org.example.services.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean(ProductService.class);
        CategoryService categoryService = context.getBean(CategoryService.class);

        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");
        Product product3 = new Product("Product3");

        product1 = productService.save(product1);
        product2 = productService.save(product2);
        product3 = productService.save(product3);

        Category category1 = new Category(
                "Category1",
                Arrays.asList(product1, product2)
        );

        Category category2 = new Category(
                "Category2",
                Arrays.asList(product1, product2, product3)
        );

        category1 = categoryService.save(category1);
        category2 = categoryService.save(category2);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        System.out.println(category1);
        System.out.println(category2);
    }
}