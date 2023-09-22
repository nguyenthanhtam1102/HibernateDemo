package org.example.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "accounts")
public class Account {

    @Id
    private int id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
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
