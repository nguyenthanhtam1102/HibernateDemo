package org.example.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "shipping_addresses")
public class ShippingAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @NonNull
    private String address;

    @Override
    public String toString() {
        return "ShippingAddress{" +
                "id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
