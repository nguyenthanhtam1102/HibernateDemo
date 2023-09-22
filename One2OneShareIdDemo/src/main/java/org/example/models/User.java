package org.example.models;

import jakarta.persistence.*;
import lombok.*;

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
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Account account;

    @NonNull
    @Column(name = "full_name", nullable = false)
    private String fullName;

}
