package com.example.orderservice.OrderService;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
  List<Order> findAll();
  public default OrderRequest saveOrderRequest(OrderRequest orderRequest){
    return saveOrderRequest(orderRequest);
  }
}
