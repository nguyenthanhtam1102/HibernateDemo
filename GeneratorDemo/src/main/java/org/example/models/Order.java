package org.example.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.id.enhanced.SequenceStyleGenerator;
import java.util.UUID;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "orders")
public class Order {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;

//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    private UUID id;

//    @Id
//    @GenericGenerator(
//            name = "sequence-generator",
//            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
//            parameters = {
//                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "order_sequence"),
//                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "5"),
//                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
//            }
//    )
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence-generator")
//    private long id;

    @Id
    @GeneratedValue(generator = "order-id-generator")
    @GenericGenerator(name = "order-id-generator", strategy = "org.example.models.OrderIdGenerator")
    private String id;

    @NonNull
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

}
