package org.example.services;

import org.example.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User save(User user);

}
