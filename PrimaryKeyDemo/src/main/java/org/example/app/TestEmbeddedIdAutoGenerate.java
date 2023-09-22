package org.example.app;

import org.example.configs.AppConfig;
import org.example.models.OrderDetail;
import org.example.services.OrderDetailService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmbeddedIdAutoGenerate {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderDetailService orderDetailService = context.getBean(OrderDetailService.class);

        OrderDetail orderDetail1 = new OrderDetail();

        OrderDetail orderDetail2 = new OrderDetail();

        orderDetail1 = orderDetailService.save(orderDetail1);
        orderDetail2 = orderDetailService.save(orderDetail2);

        System.out.println(orderDetail1);
        System.out.println(orderDetail2);

        OrderDetail findResult = orderDetailService.findById(orderDetail1.getId());
        System.out.println("Find Result:");
        System.out.println(findResult);
    }

}
