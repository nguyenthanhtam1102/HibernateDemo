package org.example.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(
            name = "images",
            joinColumns = @JoinColumn(name = "product_id")
    )
    @Column(name = "image")
    private List<String> images;

    public Product(String name, List<String> images) {
        this.name = name;
        this.images = images;
    }
}
