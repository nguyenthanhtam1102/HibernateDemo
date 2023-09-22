package org.example;

import org.example.configs.AppConfig;
import org.example.models.ShippingAddress;
import org.example.models.User;
import org.example.services.ShippingAddressService;
import org.example.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        ShippingAddressService shippingAddressService = context.getBean(ShippingAddressService.class);

        User user = new User("Nguyen Thanh Tam");
        user = userService.save(user);

        ShippingAddress shippingAddress1 = new ShippingAddress(user, "Ho Chi Minh");
        ShippingAddress shippingAddress2 = new ShippingAddress(user, "Dong Thap");

        shippingAddress1 = shippingAddressService.save(shippingAddress1);
        shippingAddress2 = shippingAddressService.save(shippingAddress2);

        user = userService.findById(user.getId());

        System.out.println(user);
        System.out.println(shippingAddress1);
        System.out.println(shippingAddress2);

//        User user2 = new User("Nguyen Van A");
//        user2 = userService.save(user2);
//        ShippingAddress shippingAddress3 = new ShippingAddress(user2, "Shipping Address 1");
//        ShippingAddress shippingAddress4 = new ShippingAddress(user2, "Shipping Address 2");
//        ShippingAddress shippingAddress5 = new ShippingAddress(user2, "Shipping Address 3");
//
//        shippingAddress3 = shippingAddressService.save(shippingAddress3);
//        shippingAddress4 = shippingAddressService.save(shippingAddress4);
//        shippingAddress5 = shippingAddressService.save(shippingAddress5);
//
//        List<User> userList = userService.findAll();
//
//        userList.forEach(u -> {
//            System.out.println(u.getShippingAddresses());
//        });
    }
}