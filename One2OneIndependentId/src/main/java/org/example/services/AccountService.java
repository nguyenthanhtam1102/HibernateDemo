package org.example.services;

import org.example.models.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {

    Account save(Account account);

}
