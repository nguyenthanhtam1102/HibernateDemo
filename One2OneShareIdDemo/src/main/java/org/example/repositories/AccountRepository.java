package org.example.repositories;

import org.example.models.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository extends GenericRepository<Account, Integer> {
}
