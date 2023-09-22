package org.example.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_details")
public class OrderDetail {

//    @EmbeddedId
//    private OrderDetailId id;

    @EmbeddedId
    @GeneratedValue(generator = "order-detail-id-generator")
    @GenericGenerator(
            name = "order-detail-id-generator",
            strategy = "org.example.models.OrderDetailIdGenerator"
    )
    private OrderDetailId id;
}
