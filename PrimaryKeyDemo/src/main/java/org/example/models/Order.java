package org.example.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
@IdClass(OrderId.class)
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id2;

    @NonNull
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

}
