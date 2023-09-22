package org.example.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NonNull
    @Column(name = "full_name", nullable = false)
    private String fullName;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<ShippingAddress> shippingAddresses;

}
