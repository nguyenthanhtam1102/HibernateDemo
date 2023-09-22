package org.example.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NonNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id", unique = true)
    private Account account;

    @NonNull
    @Column(name = "full_name", nullable = false)
    private String fullName;

}
