package org.example.services;

import org.example.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User save(User user);
    User findById(int id);
    List<User> findAll();

}
