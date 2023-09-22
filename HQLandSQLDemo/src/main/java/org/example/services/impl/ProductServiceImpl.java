package org.example.services.impl;

import org.example.models.Product;
import org.example.repositories.ProductRepository;
import org.example.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findById(long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findProductsSQL() {
        return productRepository.findProductsSQL();
    }

    @Override
    public List<Product> findProductsHQL() {
        return productRepository.findProductsHQL();
    }

    @Override
    public List<Product> findProductByName(String name) {
        return productRepository.findProductByName(name);
    }

    @Override
    public List<Product> searchProduct(String name, long id) {
        return productRepository.searchProduct(name, id);
    }


}
