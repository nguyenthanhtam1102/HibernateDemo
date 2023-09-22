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
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NonNull
    @Column(name = "full_name", nullable = false)
    private String fullName;

    @NonNull
    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;

}
