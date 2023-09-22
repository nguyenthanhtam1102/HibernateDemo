package org.example.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @CreationTimestamp
    private Date createdAt;

    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER)
    private List<OrderDetail> orderDetails;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                '}';
    }
}
