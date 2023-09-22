package org.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class OrderDetailId implements Serializable {

//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private long orderId;

//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private UUID productId;

}
