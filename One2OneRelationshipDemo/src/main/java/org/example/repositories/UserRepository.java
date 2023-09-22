package org.example.repositories;

import org.example.models.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends GenericRepository<User, Integer> {
}
