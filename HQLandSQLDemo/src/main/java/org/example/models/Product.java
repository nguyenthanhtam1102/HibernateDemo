package org.example.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NamedQueries(
        @NamedQuery(
                name = "Product_FindProductByName",
                query = "select p from Product p where name = :name"
        )
)
@NamedNativeQueries(
        @NamedNativeQuery(
                name = "Product_SearchProduct",
                query = "select * from products where lower(name) like :name or id = :id",
                resultClass = Product.class
        )
)
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    @Column(columnDefinition = "nvarchar(255)", nullable = false)
    private String name;

}
