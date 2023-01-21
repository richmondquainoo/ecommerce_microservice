package com.example.orderservice.OrderService;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "order_lineItems")
@Table
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class OrderLineItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product;
    private BigDecimal price;
    private Integer quantity;
}
