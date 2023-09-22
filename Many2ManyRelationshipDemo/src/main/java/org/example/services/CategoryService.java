package org.example.services;

import org.example.models.Category;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {

    Category save(Category category);
    Category findById(int id);

}
