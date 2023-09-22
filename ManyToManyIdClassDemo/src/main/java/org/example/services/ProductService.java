package org.example.services;

import org.example.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    Product save(Product product);
    Product findById(long id);
    List<Product> findProductsSQL();
    List<Product> findProductsHQL();

}
