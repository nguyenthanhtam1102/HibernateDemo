package org.example.models;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Embeddable
public class OrderDetailId implements Serializable {

    private long order;
    private long product;

}
