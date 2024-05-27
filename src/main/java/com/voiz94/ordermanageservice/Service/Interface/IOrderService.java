package com.voiz94.ordermanageservice.Service.Interface;

import com.voiz94.ordermanageservice.Model.Order;

import java.util.List;
import java.util.Optional;

public interface IOrderService {
    Order saveOrder(Order order);
    List<Order> getAllOrders();
    Optional<Order> getOrderById(Long id);
    void removeOrderById(Long id);
}
