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

        Account account = new Account("thanhtam1102", "123456789");

        User user = new User(account, "Nguyen Thanh Tam");
        account.setUser(user);

        userService.save(user);
        System.out.println(user);
        System.out.println(user.getAccount());
    }
}