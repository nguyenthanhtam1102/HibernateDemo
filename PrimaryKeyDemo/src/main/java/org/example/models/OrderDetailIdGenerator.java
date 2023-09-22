package org.example.models;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.UUID;

public class OrderDetailIdGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {
        OrderDetailId orderDetailId = new OrderDetailId(1, UUID.randomUUID());
        return orderDetailId;
    }

}
