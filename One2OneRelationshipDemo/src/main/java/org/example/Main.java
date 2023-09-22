package org.example;

import org.example.configs.AppConfig;
import org.example.models.Account;
import org.example.models.User;
import org.example.services.AccountService;
import org.example.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        AccountService accountService = context.getBean(AccountService.class);

        Account account = new Account("thanhtam1102", "123456789");
        accountService.save(account);
        System.out.println(account);

        User user = new User("Nguyen Thanh Tam", account);
        userService.save(user);
        System.out.println(user);
    }
}