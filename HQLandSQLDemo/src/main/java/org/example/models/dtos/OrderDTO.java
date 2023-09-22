package org.example.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.example.models.OrderDetail;

import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class OrderDTO {

    private long orderId;

    private Date orderDate;

    private List<OrderDetailDTO> orderDetails;

}
