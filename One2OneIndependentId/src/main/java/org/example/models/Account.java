package org.example.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "user_id", unique = true)
    private User user;

    @NonNull
    @Column(nullable = false)
    private String username;

    @NonNull
    @Column(nullable = false)
    private String password;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
